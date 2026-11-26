/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends IntrusiveNode {
    int field_i;
    static boolean field_j;
    static tf field_l;
    boolean field_h;
    int[] field_k;

    final static void a(byte param0) {
        ni.a(75, 17);
        if (param0 < 62) {
          vb var2 = (vb) null;
          vi.a(-73, (vb) null, 90);
        }
    }

    final static RgbSprite[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        RgbSprite[] var1 = new RgbSprite[th.field_t];
        for (var2 = 0; var2 < th.field_t; var2++) {
          var3 = pb.field_h[var2] * bd.field_m[var2];
          var4 = be.field_f[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = ci.field_b[vg.a((int) var4[var6], 255)];
          }
          var1[var2] = new RgbSprite(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var5);
        }
        GzipDecompressor.a(param0 ^ 27773);
        if (param0 != 23793) {
          return (RgbSprite[]) null;
        }
        return var1;
    }

    final static void a(int param0, vb param1, int param2) {
        th var5 = null;
        int var4 = 0;
        try {
          var5 = SpriteGeometry.field_q;
          var5.h(param0, 0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(param2, param2 - 2);
          var5.writeByte(param1.field_n, -1);
          var5.writeByte(param1.field_p, -1);
          var5.writeInt(param1.field_j, -32287);
          var5.writeInt(param1.field_q, -32287);
          var5.writeInt(param1.field_h, -32287);
          var5.writeInt(param1.field_o, -32287);
          var5.appendCrc32(var4, (byte) 119);
          var5.backpatchByteLength(-var4 + var5.position, (byte) -122);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "vi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        int var1 = 12 % ((-66 - param0) / 59);
        field_l = null;
    }

    final static BinaryBitmapFont a(byte[] param0, byte param1) {
        BinaryBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        BinaryBitmapFont stackIn_5_0 = null;
        BinaryBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (BinaryBitmapFont) (stackIn_2_0);
          }
          if (param1 < 100) {
            stackIn_5_0 = (BinaryBitmapFont) null;
            return stackIn_5_0;
          }
          var2 = new BinaryBitmapFont(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, be.field_f);
          GzipDecompressor.a(12428);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("vi.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    vi() {
        this.field_h = false;
    }

    static {
        field_l = new tf();
    }
}
