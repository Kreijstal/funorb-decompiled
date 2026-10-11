/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends mb {
    static byte[][] field_h;
    static int[] field_k;
    static String field_j;
    static String field_i;
    private java.nio.ByteBuffer field_l;

    public static void f(int param0) {
        field_k = null;
        if (param0 < 117) {
          field_j = (String) null;
        }
        field_j = null;
        field_h = (byte[][]) null;
        field_i = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        java.awt.Component var6 = null;
        try {
          if (param0 > -34) {
            var6 = (java.awt.Component) null;
            hi.a((java.awt.Component) null, -120);
          }
          var2_int = param1.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((0 >= var5 ||
                var5 >= 128) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_68_0 = var3;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_71_0 = var2;
          stackIn_71_1 = new StringBuilder().append("hi.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        f.field_c = uc.a(true, new double[][][]{new double[][]{om.a(-93, new double[]{0.5, 0.5, -1.0, 0.5, 0.5, 0.0})}, ir.a(-122, om.a(-100, new double[]{1.22, 0.5, -0.45, 0.73, 0.5, 0.0})), rm.a(om.a(-84, new double[]{1.22, 1.323, -0.402, 0.83, 0.72, 0.0}), 123), rm.a(om.a(-77, new double[]{0.79, 1.6, -0.804, 0.55, 0.67, 0.0}), 126)});
        f.field_a = uc.a(true, new double[][][]{new double[][]{om.a(-92, new double[]{0.5, 0.65, -1.0, 0.5, 0.65, 0.0})}, ir.a(-101, om.a(-62, new double[]{1.41, 0.5, -0.6, 0.81, 0.5, 0.0})), rm.a(om.a(-107, new double[]{1.28, 1.48, -0.478, 0.85, 0.81, 0.0}), 126), rm.a(om.a(-83, new double[]{0.761, 1.846, -0.865, 0.593, 0.831, 0.0}), -115)});
        if (param0 >= -127) {
          field_j = (String) null;
        }
    }

    final static boolean e(int param0) {
        if (param0 != -11071) {
          field_k = (int[]) null;
        }
        return nk.field_m.a(true);
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != -14762) {
          return;
        }
        try {
          param0.addMouseListener(wp.field_g);
          param0.addMouseMotionListener(wp.field_g);
          param0.addFocusListener(wp.field_g);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hi.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hi() {
    }

    final void a(byte[] param0, byte param1) {
        try {
          if (param1 != 2) {
            hi.e(-82);
          }
          this.field_l = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_l.position(0);
          this.field_l.put(param0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.a(param0, false);
        var2.a(0, false);
    }

    final static wc a(boolean param0) {
        if (!param0) {
          return (wc) null;
        }
        if (aa.field_c == wd.field_Lb) {
          throw new IllegalStateException();
        }
        if (wd.field_Lb == td.field_f) {
          wd.field_Lb = aa.field_c;
          return sf.field_B;
        }
        return null;
    }

    final static kl a(int param0, int param1, int param2, di param3, di param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        kl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vj.a(param1, param4, param2, (byte) 121)) {
            stackIn_2_0 = null;
            return (kl) (stackIn_2_0);
          }
          var5_int = 41 / ((param0 + 73) / 41);
          stackIn_4_0 = ta.a(16908, param3.a(105, param2, param1));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final byte[] a(int param0) {
        byte[] var3 = new byte[this.field_l.capacity()];
        byte[] var2 = var3;
        this.field_l.position(0);
        if (param0 <= 0) {
          this.field_l = (java.nio.ByteBuffer) null;
        }
        this.field_l.get(var3);
        return var3;
    }

    static {
        field_j = "<col=9999ff>Blues</col>";
        field_i = "Close";
    }
}
