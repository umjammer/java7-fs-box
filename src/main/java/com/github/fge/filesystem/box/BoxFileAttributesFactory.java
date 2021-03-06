package com.github.fge.filesystem.box;

import com.box.sdk.BoxItem;
import com.github.fge.filesystem.attributes.FileAttributesFactory;

public final class BoxFileAttributesFactory
    extends FileAttributesFactory
{
    public BoxFileAttributesFactory()
    {
        setMetadataClass(BoxItem.Info.class);
        addImplementation("basic", BoxBasicFileAttributesProvider.class);
    }
}
