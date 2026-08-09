/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends ci {
    static di field_Fb;
    static nl field_Gb;
    private ci field_Jb;
    static String field_Eb;
    static String field_Ib;
    ci field_Hb;

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        L0: {
          var4 = -param1;
          var5 = -param1;
          if (null != this.field_Jb) {
            var4 = this.field_Jb.e((byte) -57);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null != this.field_Hb) {
            var5 = this.field_Hb.a(-param2 + -var4 + (this.field_M + -param2) + -param1, -84);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = param2 + (var5 + param2 - -var4) + param1;
          if (var6 > this.field_M) {
            var5 = var5 + (this.field_M - var6);
            var6 = this.field_M;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 < -122) {
            break L3;
          } else {
            tl.a(-96, 21, -127, -74);
            break L3;
          }
        }
        L4: {
          if (this.field_fb != 1) {
            break L4;
          } else {
            param2 = param2 + (this.field_M - var6) / 2;
            break L4;
          }
        }
        L5: {
          if ((this.field_fb ^ -1) != -3) {
            break L5;
          } else {
            param2 = param2 + (-var6 + this.field_M);
            break L5;
          }
        }
        L6: {
          if (this.field_Jb == null) {
            break L6;
          } else {
            this.field_Jb.a(param2, var4, -2147483648, this.field_pb, 0);
            this.field_Jb.field_cb = this.field_cb;
            break L6;
          }
        }
        L7: {
          if (null != this.field_Hb) {
            L8: {
              this.field_Hb.a(param2 - (-var4 - param1), var5, -2147483648, this.field_pb, 0);
              if (this.field_Jb != null) {
                this.field_Hb.field_fb = 0;
                break L8;
              } else {
                this.field_Hb.field_fb = this.field_fb;
                break L8;
              }
            }
            this.field_Hb.field_cb = this.field_cb;
            break L7;
          } else {
            break L7;
          }
        }
    }

    final static void a(byte param0, km param1) {
        try {
            r.k(param0 ^ -2968);
            if (param0 != -67) {
                ac var3 = (ac) null;
                tl.a((ac) null, -55, (byte) 64);
            }
            wb.a(param1.field_x, param1.field_v, param1.field_u);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "tl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        this.a(param3, param0, param5 ^ 2147483626, param2, param4);
        this.a(param5 ^ 107, param1, param6);
        if (param5 != -22) {
            tl.a(-18, 42, 89, 18);
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            nh.a();
            pd.field_Tb = 11;
            gf.field_b = new int[260];
            var1_int = 0;
            L1: while (true) {
              if ((var1_int ^ -1) <= -257) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= gf.field_b.length) {
                    L3: {
                      if (!param0) {
                        break L3;
                      } else {
                        field_Fb = (di) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    gf.field_b[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                gf.field_b[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "tl.H(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        field_Ib = null;
        field_Gb = null;
        field_Fb = null;
        field_Eb = null;
        if (param0 > -101) {
            field_Gb = (nl) null;
        }
    }

    final static void a(ac param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vn.field_vb.a((o) (param0), (byte) 119);
              fa.a(param0, param2 ^ 14994, param1);
              if (param2 == 117) {
                break L1;
              } else {
                field_Gb = (nl) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("tl.G(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (pi.field_d != null) {
            if (!(!pi.field_d.b(4))) {
                fi.a(-393711775);
                return true;
            }
        }
        if (pj.field_h != null && pj.field_h.f((byte) 95)) {
            pj.field_h = null;
            fi.a(-393711775);
            return true;
        }
        if (af.b((byte) 125)) {
            return true;
        }
        if (!(!fn.a(param0, 23012, param1, param3))) {
            return true;
        }
        if (param2 <= 74) {
            field_Ib = (String) null;
            return false;
        }
        return false;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -param0;
        if (!(this.field_Jb == null)) {
            var4 = this.field_Jb.e((byte) 120);
        }
        int var5 = -param0;
        if (!param2) {
            field_Ib = (String) null;
        }
        if (null != this.field_Hb) {
            var5 = this.field_Hb.e((byte) 73);
        }
        return param1 + (var4 - (-param0 - (var5 + param1)));
    }

    final static void k(int param0) {
        int fieldTemp$0 = 0;
        if (param0 != 31553) {
            tl.a(-57, -23, 14, -33);
        }
        if (hd.field_l.g(-18110) != null) {
            fieldTemp$0 = fb.field_K + 1;
            fb.field_K = fb.field_K + 1;
            if (!((fieldTemp$0 ^ -1) != -336)) {
                fb.field_K = 0;
                hd.field_l.f(1184188328);
            }
        }
    }

    tl(long param0, ci param1, ci param2, ci param3, km param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Jb = new ci(0L, param2);
                this.field_Jb.field_jb = param4;
                this.a((byte) 125, this.field_Jb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Hb = new ci(0L, param3, param5);
                this.a((byte) 123, this.field_Hb);
                this.h(0);
                break L2;
              } else {
                this.h(0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("tl.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    static {
        field_Ib = "<%0> is not on your ignore list.";
        field_Eb = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
