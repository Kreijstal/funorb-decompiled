/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends l {
    int[] field_u;
    private String[] field_v;
    static String field_q;
    private int[] field_s;
    static km field_t;
    static String field_w;
    private int[][] field_r;

    final static void a(boolean param0) {
        vj.field_c = new jc();
        if (!param0) {
          field_q = (String) null;
        }
    }

    final String e(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Chess.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_v == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_v[0]);
        for (var3 = 1; this.field_v.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_v[var3]);
        }
        if (param0 >= -102) {
          field_t = (km) null;
        }
        return var2.toString();
    }

    final void a(p param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Chess.field_G;
        try {
          if (!param1) {
            field_t = (km) null;
          }
          while (true) {
            var3_int = param0.i(-79);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, 80, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("dj.J(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        p var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          var10 = new p(param0);
          var3 = 92 % ((61 - param1) / 50);
          var4 = var10.i(-92);
          var5 = var10.e((byte) -124);
          if (var5 >= 0 && (0 == je.field_l ||
            !(var5 > je.field_l))) {
            if (var4 == 0) {
              var13 = new byte[var5];
              var11 = var13;
              var6_ref_byte__ = var11;
              var10.a(var5, (byte) 124, var13, 0);
              stackIn_7_0 = var6_ref_byte__;
              return stackIn_7_0;
            }
            var6 = var10.e((byte) -93);
            if (var6 >= 0 && (je.field_l == 0 ||
              !(je.field_l < var6))) {
              var14 = new byte[var6];
              var12 = var14;
              var7 = var12;
              if (var4 != 1) {
                var8 = nc.field_N;
                synchronized (var8) {
                  nc.field_N.a(var14, (byte) -34, var10);
                }
              } else {
                en.a(var14, var6, param0, var5, 9);
              }
              stackIn_21_0 = var7;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("dj.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void g(int param0) {
        hd.field_c.a(0, -(bo.field_c ? 44 + sc.field_e : 0) + bh.field_G.field_M, -2147483648, 18, 0);
        uk.field_c.a(-40 + (bh.field_G.field_M + (-sc.field_e - 2)), 42 + sc.field_e, -2147483648, 18, 0);
        ib.field_c.a(param0, bh.field_G.field_pb - 20, 20, -3, sc.field_e, 0, bh.field_G.field_M);
    }

    final static gm h(int param0) {
        if (param0 != -13154) {
          dj.a(true);
        }
        return (gm) ((Object) new kh());
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var4 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            {
              var5 = param0.charAt(var4);
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
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_67_0 = var3;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_70_0 = var2;
          stackIn_70_1 = new StringBuilder().append("dj.C(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(')').toString());
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = Chess.field_G;
        if (param0 != 32768) {
          return;
        }
        if (null != this.field_u) {
          for (var2 = 0; this.field_u.length > var2; var2++) {
            this.field_u[var2] = s.a(this.field_u[var2], 32768);
          }
        }
    }

    public static void d(byte param0) {
        field_q = null;
        field_t = null;
        if (param0 > -25) {
          dj.a(false);
        }
        field_w = null;
    }

    private final void a(int param0, int param1, p param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hg var7 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Chess.field_G;
        try {
          if (1 != param0) {
            if (param0 == 2) {
              var4_int = param2.i(param1 - 193);
              this.field_u = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_u[var5] = param2.f(674914976);
              }
            } else {
              if (param0 == 3) {
                var4_int = param2.i(-103);
                this.field_r = new int[var4_int][];
                this.field_s = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param2.f(674914976);
                  var7 = li.a(var6, 0);
                  if (var7 != null) {
                    this.field_s[var5] = var6;
                    array$0 = new int[var7.field_c];
                    this.field_r[var5] = array$0;
                    for (var8 = 0; var8 < var7.field_c; var8++) {
                      this.field_r[var5][var8] = param2.f(674914976);
                    }
                  }
                }
              } else {
                if (4 == param0) {
                }
              }
            }
          } else {
            this.field_v = gl.a((byte) -118, '<', param2.d(0));
          }
          if (param1 != 80) {
            var10 = (CharSequence) null;
            dj.a((CharSequence) null, 106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("dj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    dj() {
    }

    static {
        field_q = "Your request to join has been declined.";
        field_w = "Cancel unrated rematch";
    }
}
