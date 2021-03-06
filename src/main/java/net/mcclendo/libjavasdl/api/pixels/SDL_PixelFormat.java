package net.mcclendo.libjavasdl.api.pixels;

import net.mcclendo.libjavasdl.jna.AbstractSdlStructure;

import com.sun.jna.Pointer;

public class SDL_PixelFormat extends AbstractSdlStructure {
    public int format;
    public SDL_Palette palette;
    public byte bitsPerPixel;
    public byte bytesPerPixel;
    public byte[] padding = new byte[2];
    public int rMask;
    public int gMask;
    public int bMask;
    public int aMask;
    public byte rLoss;
    public byte gLoss;
    public byte bLoss;
    public byte aLoss;
    public byte rShift;
    public byte gShift;
    public byte bShift;
    public byte aShift;
    public int refcount;
    public Pointer next;
}
