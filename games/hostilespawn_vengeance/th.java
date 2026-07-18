/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends le {
    le field_Ib;
    static int[] field_Fb;
    static int[] field_Jb;
    static int field_Lb;
    static bd[] field_Hb;
    le field_Kb;
    private pb field_Gb;
    private pb field_Mb;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        be.field_g = null;
        ce.field_e = 0;
        db.field_o = null;
        var2 = mb.field_p;
        if (param0 > 120) {
          L0: {
            mb.field_p = hn.field_a;
            if (param1 == 51) {
              ig.field_N.field_e = 2;
              break L0;
            } else {
              if (param1 != 50) {
                ig.field_N.field_e = 1;
                break L0;
              } else {
                ig.field_N.field_e = 5;
                break L0;
              }
            }
          }
          L1: {
            hn.field_a = var2;
            ig.field_N.field_k = ig.field_N.field_k + 1;
            if (2 > ig.field_N.field_k) {
              break L1;
            } else {
              if (param1 != 51) {
                break L1;
              } else {
                return 2;
              }
            }
          }
          L2: {
            if (2 > ig.field_N.field_k) {
              break L2;
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                break L2;
              }
            }
          }
          if (4 <= ig.field_N.field_k) {
            return 1;
          } else {
            return -1;
          }
        } else {
          return -96;
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        if (param0 >= -110) {
            return;
        }
        this.a(((th) this).field_Kb.field_sb, ((th) this).field_Kb.field_qb, param1, (byte) 58, param2, param3);
    }

    final static fn a(int param0, byte[] param1) {
        fn var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        fn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new fn(param1, field_Jb, nh.field_O, sf.field_X, hd.field_r, ja.field_e);
              uj.d(-63);
              stackOut_3_0 = (fn) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("th.B(").append(-5427).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void d(byte param0) {
        field_Jb = null;
        field_Fb = null;
        field_Hb = null;
        if (param0 != 16) {
            th.d((byte) -46);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          ((th) this).field_Kb.field_qb = ((th) this).field_qb;
          ((th) this).field_Ib.field_tb = 0;
          ((th) this).field_Kb.field_sb = ((th) this).field_sb;
          ((th) this).field_Ib.field_zb = 0;
          ((th) this).field_Gb.b(110);
          ((th) this).field_Mb.b(115);
          var5 = 30 / ((param2 - -45) / 56);
          if (((th) this).field_Kb.field_qb >= ((th) this).field_Ib.field_qb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (((th) this).field_Kb.field_sb >= ((th) this).field_Ib.field_sb) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = stackIn_6_0;
            if (var4 == 0) {
              break L3;
            } else {
              if (var6 != 0) {
                ((th) this).a(false, (le) (Object) ((th) this).field_Mb);
                ((th) this).a(false, (le) (Object) ((th) this).field_Gb);
                ((th) this).field_Kb.field_qb = ((th) this).field_Kb.field_qb - (param1 + param0);
                ((th) this).field_Kb.field_sb = ((th) this).field_Kb.field_sb - (param1 + param0);
                ((th) this).field_Mb.a(((th) this).field_sb - param0, ((th) this).field_qb + -param0, param0, 99, 0);
                ((th) this).field_Mb.b(((th) this).field_Kb.field_qb, ((th) this).field_Ib.field_qb, -((th) this).field_Ib.field_tb, false);
                ((th) this).field_Gb.a(0, param0, -param0 + ((th) this).field_sb, -13, ((th) this).field_qb + -param0);
                ((th) this).field_Gb.b(((th) this).field_Kb.field_sb, ((th) this).field_Ib.field_sb, -((th) this).field_Ib.field_zb, false);
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (var4 != 0) {
            ((th) this).a(false, (le) (Object) ((th) this).field_Mb);
            ((th) this).field_Kb.field_sb = ((th) this).field_Kb.field_sb - (param0 - -param1);
            ((th) this).field_Mb.a(-param0 + ((th) this).field_sb, ((th) this).field_qb, param0, 104, 0);
            ((th) this).field_Mb.b(((th) this).field_Kb.field_qb, ((th) this).field_Ib.field_qb, -((th) this).field_Ib.field_tb, false);
            break L2;
          } else {
            if (var6 == 0) {
              break L2;
            } else {
              ((th) this).a(false, (le) (Object) ((th) this).field_Gb);
              ((th) this).field_Kb.field_qb = ((th) this).field_Kb.field_qb - (param0 + param1);
              ((th) this).field_Gb.a(0, param0, ((th) this).field_sb, 127, -param0 + ((th) this).field_qb);
              ((th) this).field_Gb.b(((th) this).field_Kb.field_sb, ((th) this).field_Ib.field_sb, -((th) this).field_Ib.field_zb, false);
              break L2;
            }
          }
        }
    }

    th(long param0, le param1, le param2, pb param3) {
        super(param0, (le) null);
        try {
            ((th) this).field_Kb = new le(0L, param2);
            ((th) this).field_Gb = new pb(0L, param3, true);
            ((th) this).field_Mb = new pb(0L, param3, false);
            ((th) this).a(false, ((th) this).field_Kb);
            ((th) this).a(false, (le) (Object) ((th) this).field_Gb);
            ((th) this).a(false, (le) (Object) ((th) this).field_Mb);
            ((th) this).field_Ib = param1;
            ((th) this).field_Kb.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "th.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static nc a(gb param0, int param1, String param2, gb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        nc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5_int = param0.a((byte) -2, param4);
            var6 = -53 / ((param1 - -52) / 49);
            var7 = param0.a(var5_int, param2, -1);
            stackOut_0_0 = cj.a(param3, 7844, var7, param0, var5_int);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("th.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, boolean param5) {
        int var8 = 0;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (((th) this).field_Gb.i(4308)) {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z + param4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((th) this).field_Gb.g(122)) {
            break L1;
          } else {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z - param4;
            break L1;
          }
        }
        L2: {
          if (((th) this).field_Gb.h(-1)) {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z + param1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((th) this).field_Gb.e((byte) 112)) {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z - param1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((th) this).field_Mb.i(4308)) {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib + param4;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((th) this).field_Mb.g(126)) {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib - param4;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!((th) this).field_Mb.h(-1)) {
            break L6;
          } else {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib + param0;
            break L6;
          }
        }
        L7: {
          if (((th) this).field_Mb.e((byte) 63)) {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib - param0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (((th) this).field_S) {
            if (((th) this).field_Kb.field_sb <= ((th) this).field_Ib.field_sb) {
              ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z - param2;
              break L8;
            } else {
              ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib - param2;
              break L8;
            }
          } else {
            break L8;
          }
        }
        L9: {
          if (param5) {
            L10: {
              if (-(((th) this).field_Ib.field_z + ((th) this).field_Ib.field_zb) < 0) {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (-(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb) >= 0) {
                break L11;
              } else {
                ((th) this).field_Ib.field_ib = -((th) this).field_Ib.field_tb;
                break L11;
              }
            }
            L12: {
              if (((th) this).field_Ib.field_sb + (((th) this).field_Ib.field_N + -((th) this).field_Kb.field_sb) >= -(((th) this).field_Ib.field_zb - -((th) this).field_Ib.field_z)) {
                break L12;
              } else {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb + -(-((th) this).field_Kb.field_sb + (((th) this).field_Ib.field_N + ((th) this).field_Ib.field_sb));
                break L12;
              }
            }
            if (((th) this).field_Ib.field_X + ((th) this).field_Ib.field_qb + -((th) this).field_Kb.field_qb < -(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb)) {
              ((th) this).field_Ib.field_ib = -(((th) this).field_Ib.field_qb - -((th) this).field_Ib.field_X - ((th) this).field_Kb.field_qb) - ((th) this).field_Ib.field_tb;
              break L9;
            } else {
              break L9;
            }
          } else {
            L13: {
              if (-((th) this).field_Kb.field_sb + ((th) this).field_Ib.field_sb - -((th) this).field_Ib.field_N < -(((th) this).field_Ib.field_z + ((th) this).field_Ib.field_zb)) {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb + -(((th) this).field_Ib.field_sb - (-((th) this).field_Ib.field_N - -((th) this).field_Kb.field_sb));
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (-(((th) this).field_Ib.field_zb - -((th) this).field_Ib.field_z) >= 0) {
                break L14;
              } else {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb;
                break L14;
              }
            }
            L15: {
              if (((th) this).field_Ib.field_X + ((th) this).field_Ib.field_qb + -((th) this).field_Kb.field_qb >= -(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb)) {
                break L15;
              } else {
                ((th) this).field_Ib.field_ib = -(-((th) this).field_Kb.field_qb + ((th) this).field_Ib.field_qb - -((th) this).field_Ib.field_X) + -((th) this).field_Ib.field_tb;
                break L15;
              }
            }
            if (-(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb) < 0) {
              ((th) this).field_Ib.field_ib = -((th) this).field_Ib.field_tb;
              break L9;
            } else {
              break L9;
            }
          }
        }
        L16: {
          if (((th) this).field_Gb.d((byte) -124)) {
            ((th) this).field_Ib.field_zb = -((th) this).field_Gb.a(((th) this).field_Ib.field_sb, param5, ((th) this).field_Kb.field_sb, 101);
            ((th) this).field_Ib.field_z = 0;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          if (((th) this).field_Mb.d((byte) -128)) {
            ((th) this).field_Ib.field_tb = -((th) this).field_Mb.b(((th) this).field_Ib.field_qb, param5, 121, ((th) this).field_Kb.field_qb);
            ((th) this).field_Ib.field_ib = 0;
            break L17;
          } else {
            break L17;
          }
        }
        ((th) this).field_Gb.b(((th) this).field_Kb.field_sb, ((th) this).field_Ib.field_sb, -((th) this).field_Ib.field_zb, false);
        ((th) this).field_Mb.b(((th) this).field_Kb.field_qb, ((th) this).field_Ib.field_qb, -((th) this).field_Ib.field_tb, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = new int[]{40, 3, 30, 0, 30, 50, 6, 50};
        field_Lb = 0;
    }
}
