/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fj extends le {
    static long field_Rb;
    private le field_Fb;
    private le field_Gb;
    static rc field_Tb;
    private le field_Qb;
    static String field_Sb;
    static int field_Lb;
    private int field_Hb;
    private le field_Nb;
    static int field_Jb;
    static bd[] field_Kb;
    private le field_Ib;
    static double field_Pb;
    private le field_Mb;
    static int field_Ob;

    fj(long param0, le param1, le param2, le param3, le param4) {
        super(param0, (le) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        le var9 = null;
        le var10 = null;
        try {
          L0: {
            this.field_Fb = new le(0L, param1);
            this.field_Gb = new le(0L, param2);
            this.a(false, this.field_Fb);
            this.a(false, this.field_Gb);
            this.field_Qb = new le(0L, (le) null);
            this.a(false, this.field_Qb);
            this.field_Nb = new le(0L, param3);
            this.field_Ib = new le(0L, param3);
            this.field_Ib.field_B = true;
            var9 = this.field_Nb;
            var10 = var9;
            var10.field_B = true;
            this.field_Qb.a(false, this.field_Nb);
            this.field_Qb.a(false, this.field_Ib);
            this.field_Mb = new le(0L, param4);
            this.field_Mb.field_Db = true;
            this.field_Qb.a(false, this.field_Mb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("fj.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final static Boolean k(int param0) {
        Boolean var1 = ii.field_h;
        if (param0 != -11401) {
            field_Tb = (rc) null;
            ii.field_h = null;
            return var1;
        }
        ii.field_h = null;
        return var1;
    }

    public static void i(int param0) {
        field_Sb = null;
        field_Tb = null;
        if (param0 != -24510) {
            field_Pb = -1.0872068835562798;
            field_Kb = null;
            return;
        }
        field_Kb = null;
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -24467) {
          L0: {
            field_Tb = (rc) null;
            if (this.field_Mb.field_W == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_Mb.field_W == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        le var14;
        le var15;
        le var16;
        le var17;
        le var18;
        le var19;
        le stackIn_13_0 = null;
        le stackIn_13_1 = null;
        le stackIn_13_2 = null;
        le stackIn_14_0 = null;
        le stackIn_14_1 = null;
        le stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        le stackIn_20_0 = null;
        le stackIn_20_1 = null;
        le stackIn_20_2 = null;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        L0: {
          if (this.field_qb * 2 > this.field_sb) {
            var6 = this.field_sb / 2;
            var5 = this.field_sb / 2;
            break L0;
          } else {
            var5 = this.field_qb;
            var6 = -this.field_qb + this.field_sb;
            break L0;
          }
        }
        var7 = var6 + -var5;
        var8 = var7;
        if (param0 <= 0) {
          L1: {
            var9 = param0 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var12 = var11 + var8 / 2;
            var14 = this.field_Fb;
            var14.field_sb = var5;
            var14.field_qb = this.field_qb;
            var14.field_zb = 0;
            var14.field_tb = 0;
            var15 = this.field_Gb;
            var15.field_zb = var6;
            var15.field_qb = this.field_qb;
            var15.field_tb = param1;
            var15.field_sb = -var6 + this.field_sb;
            var16 = this.field_Qb;
            var16.field_qb = this.field_qb;
            var16.field_tb = 0;
            var16.field_zb = var5;
            var16.field_sb = var7;
            var17 = this.field_Nb;
            var17.field_zb = 0;
            var17.field_sb = var12;
            var17.field_tb = 0;
            var17.field_qb = this.field_qb;
            var18 = this.field_Ib;
            var18.field_tb = 0;
            var18.field_zb = var12;
            var18.field_qb = this.field_qb;
            var18.field_sb = -var12 + var7;
            var19 = this.field_Mb;
            var19.field_tb = 0;
            var19.field_sb = var8;
            var19.field_zb = var11;
            stackIn_20_0 = this.field_Fb;

            stackIn_20_1 = this.field_Gb;

            stackIn_20_2 = this.field_Qb;

            if (param2 >= param0) {
              stackIn_21_0 = (le) ((Object) stackIn_20_0);
              stackIn_21_1 = (le) ((Object) stackIn_20_1);
              stackIn_21_2 = (le) ((Object) stackIn_20_2);
              stackIn_21_3 = 0;
              break L2;
            } else {
              stackIn_21_0 = (le) ((Object) stackIn_20_0);
              stackIn_21_1 = (le) ((Object) stackIn_20_1);
              stackIn_21_2 = (le) ((Object) stackIn_20_2);
              stackIn_21_3 = 1;
              break L2;
            }
          }
          stackIn_21_2.field_jb = stackIn_21_3 != 0;
          stackIn_21_1.field_jb = stackIn_21_3 != 0;
          stackIn_21_0.field_jb = stackIn_21_3 != 0;
          var19.field_qb = this.field_qb;
          return;
        } else {
          L3: {
            var8 = var8 * param2 / param0;
            if (var8 >= this.field_qb) {
              break L3;
            } else {
              var8 = this.field_qb;
              break L3;
            }
          }
          L4: {
            if (var8 <= var7) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param0 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var12 = var11 + var8 / 2;
            var14 = this.field_Fb;
            var14.field_sb = var5;
            var14.field_qb = this.field_qb;
            var14.field_zb = 0;
            var14.field_tb = 0;
            var15 = this.field_Gb;
            var15.field_zb = var6;
            var15.field_qb = this.field_qb;
            var15.field_tb = param1;
            var15.field_sb = -var6 + this.field_sb;
            var16 = this.field_Qb;
            var16.field_qb = this.field_qb;
            var16.field_tb = 0;
            var16.field_zb = var5;
            var16.field_sb = var7;
            var17 = this.field_Nb;
            var17.field_zb = 0;
            var17.field_sb = var12;
            var17.field_tb = 0;
            var17.field_qb = this.field_qb;
            var18 = this.field_Ib;
            var18.field_tb = 0;
            var18.field_zb = var12;
            var18.field_qb = this.field_qb;
            var18.field_sb = -var12 + var7;
            var19 = this.field_Mb;
            var19.field_tb = 0;
            var19.field_sb = var8;
            var19.field_zb = var11;
            stackIn_13_0 = this.field_Fb;

            stackIn_13_1 = this.field_Gb;

            stackIn_13_2 = this.field_Qb;

            if (param2 >= param0) {
              stackIn_14_0 = (le) ((Object) stackIn_13_0);
              stackIn_14_1 = (le) ((Object) stackIn_13_1);
              stackIn_14_2 = (le) ((Object) stackIn_13_2);
              stackIn_14_3 = 0;
              break L6;
            } else {
              stackIn_14_0 = (le) ((Object) stackIn_13_0);
              stackIn_14_1 = (le) ((Object) stackIn_13_1);
              stackIn_14_2 = (le) ((Object) stackIn_13_2);
              stackIn_14_3 = 1;
              break L6;
            }
          }
          stackIn_14_2.field_jb = stackIn_14_3 != 0;
          stackIn_14_1.field_jb = stackIn_14_3 != 0;
          stackIn_14_0.field_jb = stackIn_14_3 != 0;
          var19.field_qb = this.field_qb;
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 == 2) {
          if (0 == this.field_Fb.field_Q) {
            if (this.field_Fb.field_W != 0) {
              L0: {
                if ((this.field_Hb ^ -1) < -1) {
                  this.field_Hb = this.field_Hb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_Hb != 0) {
                return false;
              } else {
                this.field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            this.field_Hb = 20;
            return true;
          }
        } else {
          this.field_Mb = (le) null;
          if (0 == this.field_Fb.field_Q) {
            if (this.field_Fb.field_W != 0) {
              L1: {
                if ((this.field_Hb ^ -1) < -1) {
                  this.field_Hb = this.field_Hb - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_Hb != 0) {
                return false;
              } else {
                this.field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            this.field_Hb = 20;
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        String var10;
        this.field_qb = param1;
        this.field_zb = param4;
        if (param3 != 20) {
          var10 = (String) null;
          fj.a((String) null, 31, false, (String) null, -42, (byte) 83, (String) null);
          this.field_sb = param5;
          this.field_tb = param0;
          this.a(param7, 0, param6, param2);
          return;
        } else {
          this.field_sb = param5;
          this.field_tb = param0;
          this.a(param7, 0, param6, param2);
          return;
        }
    }

    final static int a(String param0, int param1, boolean param2, String param3, int param4, byte param5, String param6) {
        s var7 = null;
        RuntimeException var7_ref = null;
        s var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new s(param6);
              if (param5 == -8) {
                break L1;
              } else {
                field_Kb = (bd[]) null;
                break L1;
              }
            }
            var8 = new s(param0);
            stackIn_3_0 = lb.a(param1, (byte) 124, var7, param2, var8, param3, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("fj.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, m param1, boolean param2) {
        en var6 = null;
        int var4 = 0;
        try {
            if (!param2) {
                String var5 = (String) null;
                fj.a((String) null, 7, true, (String) null, 102, (byte) 5, (String) null);
            }
            var6 = s.field_b;
            en var3 = var6;
            var6.i(19319, param0);
            var6.field_i = var6.field_i + 1;
            var4 = var6.field_i;
            var6.d(106, 1);
            if (param1.field_i != null) {
                var6.d(114, param1.field_i.length);
                var6.a(param1.field_i.length, param1.field_i, true, 0);
            } else {
                var6.d(80, 0);
            }
            var6.f(var4, -90);
            var6.field_i = var6.field_i - 4;
            param1.field_o = var6.d(8195);
            var6.a(var6.field_i + -var4, -19720);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "fj.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = this.field_Qb.field_sb + -this.field_Mb.field_sb;
        if (param2 <= -22) {
          L0: {
            if (-1 > (var6 ^ -1)) {
              var7 = this.field_Mb.field_zb;
              var8 = -param3 + param0;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param1) {
            L1: {
              if (var5 <= param0 - param3) {
                break L1;
              } else {
                var5 = param0 + -param3;
                break L1;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L2: {
              if (0 <= var5) {
                break L2;
              } else {
                var5 = 0;
                break L2;
              }
            }
            if (-param3 + param0 >= var5) {
              return var5;
            } else {
              var5 = -param3 + param0;
              return var5;
            }
          }
        } else {
          L3: {
            this.a(-95, -63, 115, -27);
            if (-1 > (var6 ^ -1)) {
              var7 = this.field_Mb.field_zb;
              var8 = -param3 + param0;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param1) {
            L4: {
              if (var5 <= param0 - param3) {
                break L4;
              } else {
                var5 = param0 + -param3;
                break L4;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L5: {
              if (0 <= var5) {
                break L5;
              } else {
                var5 = 0;
                break L5;
              }
            }
            if (-param3 + param0 >= var5) {
              return var5;
            } else {
              var5 = -param3 + param0;
              return var5;
            }
          }
        }
    }

    final boolean j(int param0) {
        if (this.field_Gb.field_Q == 0) {
          if (param0 == 0) {
            if (-1 != (this.field_Gb.field_W ^ -1)) {
              if (this.field_Hb <= 0) {
                if (this.field_Hb != 0) {
                  return false;
                } else {
                  this.field_Hb = 3;
                  return true;
                }
              } else {
                this.field_Hb = this.field_Hb - 1;
                if (this.field_Hb == 0) {
                  this.field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            this.g(-49);
            if (-1 != (this.field_Gb.field_W ^ -1)) {
              if (this.field_Hb > 0) {
                this.field_Hb = this.field_Hb - 1;
                if (this.field_Hb == 0) {
                  this.field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (this.field_Hb == 0) {
                  this.field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          this.field_Hb = 20;
          return true;
        }
    }

    final boolean g(int param0) {
        if (-1 == (this.field_Nb.field_Q ^ -1)) {
          if ((this.field_Nb.field_W ^ -1) != param0) {
            L0: {
              if ((this.field_Hb ^ -1) < -1) {
                this.field_Hb = this.field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Hb == 0) {
              if (this.field_Mb.field_mb + this.field_Mb.field_z <= rb.field_m) {
                return false;
              } else {
                this.field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Hb = 20;
          return true;
        }
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        FileOutputStream var4 = null;
        try {
            if (param1 != 15445) {
                field_Ob = 85;
            }
            var4 = new FileOutputStream(param3);
            var4.write(param0, 0, param2);
            var4.close();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "fj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(boolean param0) {
        if (this.field_Ib.field_Q == 0) {
          if (!param0) {
            if (this.field_Ib.field_W != 0) {
              L0: {
                if (-1 > (this.field_Hb ^ -1)) {
                  this.field_Hb = this.field_Hb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_Hb == 0) {
                if (this.field_Mb.field_N + this.field_Mb.field_sb + (this.field_Mb.field_z + this.field_Mb.field_mb) > rb.field_m) {
                  return false;
                } else {
                  this.field_Hb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Hb = 20;
          return true;
        }
    }

    final int a(int param0, byte param1, int param2) {
        if (param1 != 126) {
          field_Jb = -105;
          return this.a(param0, false, -110, param2);
        } else {
          return this.a(param0, false, -110, param2);
        }
    }

    static {
        field_Pb = 0.0;
    }
}
