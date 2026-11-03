/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends AnimatedPanel {
    int field_Qb;
    boolean field_Ub;
    long field_zb;
    int field_Fb;
    AnimatedPanel field_xb;
    int field_Wb;
    boolean field_Vb;
    static Sprite[] field_Nb;
    int field_Gb;
    AnimatedPanel field_Ob;
    AnimatedPanel field_Mb;
    static sm[] field_Hb;
    int field_Eb;
    int field_Lb;
    String field_Cb;
    boolean field_Tb;
    AnimatedPanel field_Jb;
    String field_Db;
    static long field_Pb;
    static Sprite field_Kb;
    AnimatedPanel field_Ab;
    static bg field_Rb;
    static byte[][] field_Bb;
    long field_Ib;
    static Territory field_yb;
    static SoundCache field_Sb;

    final static void a(int param0, boolean param1) {
        if (DualLinkDequeSequence.field_k != null) {
          dk.a((byte) 54, DualLinkDequeSequence.field_k);
        }
        if (DerelictVictoryChecker.field_m != null) {
          DerelictVictoryChecker.field_m.a(13505, param1);
          if (param0 == 0) {
            UrlLoader.clearStatics((byte) -82, param1);
            if (null != DialogRoot.field_G) {
              DialogRoot.field_G.drawFullRaster(param1, -68);
            }
            ho.a(param1, param0 + 8323199);
            return;
          }
          return;
        }
        if (param0 == 0) {
          UrlLoader.clearStatics((byte) -82, param1);
          if (null != DialogRoot.field_G) {
            DialogRoot.field_G.drawFullRaster(param1, -68);
          }
          ho.a(param1, param0 + 8323199);
          return;
        }
    }

    final boolean a(mj param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_11_1 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_Rb = (bg) null;
          }
          stackIn_4_0 = this.field_Vb;
          if (param0.field_Vb) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            stackIn_7_0 = this.field_Vb;
            return stackIn_7_0;
          }
          stackIn_10_0 = param0.field_Tb;
          if (this.field_Tb) {
            stackIn_11_1 = 0;
          } else {
            stackIn_11_1 = 1;
          }
          if ((stackIn_10_0 ? 1 : 0) != stackIn_11_1) {
            stackIn_17_0 = !(this.field_zb >= param0.field_zb);
            return stackIn_17_0;
          }
          stackIn_13_0 = this.field_Tb;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("mj.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String param0, String param1, byte param2) {
        CharSequence var5 = null;
        this.field_Db = param1;
        if (param2 <= 1) {
          return;
        }
        try {
          this.field_Cb = param0;
          var5 = (CharSequence) ((Object) this.field_Db);
          ji.a(var5, true);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "mj.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearStatics(int param0) {
        field_Rb = null;
        if (param0 == -4923) {
          field_yb = null;
          field_Sb = null;
          field_Kb = null;
          field_Nb = null;
          field_Hb = null;
          field_Bb = (byte[][]) null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, Sprite[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param5 != null &&
            param0 > 0) {
            var6_int = param5[0].field_o;
            var7 = param5[param1].field_o;
            var8 = param5[1].field_o;
            param5[0].drawTinted(param4, param3, param2);
            param5[2].drawTinted(-var7 + (param4 + param0), param3, param2);
            SoftwareRasterizer.saveClip(fc.field_g);
            SoftwareRasterizer.intersectClip(var6_int + param4, param3, param4 + (param0 - var7), param5[1].field_p + param3);
            var9 = param4 + var6_int;
            var10 = param0 + param4 - var7;
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param5[1].drawTinted(param4, param3, param2);
            }
            SoftwareRasterizer.restoreClip(fc.field_g);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("mj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 < -58) {
          return !this.isSecondaryLinked((byte) 96) ? true : false;
        }
        mj.clearStatics(-58);
        return !this.isSecondaryLinked((byte) 96) ? true : false;
    }

    mj(String param0, String param1, long param2) {
        super(0L, (AnimatedPanel) null);
        CharSequence var6 = null;
        try {
          this.field_Db = param0;
          this.field_Cb = param1;
          this.field_Ib = param2;
          var6 = (CharSequence) ((Object) this.field_Db);
          ji.a(var6, true);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Hb = new sm[14];
        field_Bb = new byte[250][];
        field_Rb = new bg("");
    }
}
