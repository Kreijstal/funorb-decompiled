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
            if ((param1 ^ -1) == -52) {
              ig.field_N.field_e = 2;
              break L0;
            } else {
              if ((param1 ^ -1) != -51) {
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
              if (-52 != (param1 ^ -1)) {
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
              if ((param1 ^ -1) == -51) {
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
        Object var3 = null;
        if (param1 == null) {
          return null;
        } else {
          L0: {
            var2 = new fn(param1, field_Jb, nh.field_O, sf.field_X, hd.field_r, ja.field_e);
            uj.d(-63);
            if (param0 == -5427) {
              break L0;
            } else {
              var3 = null;
              nc discarded$2 = th.a((gb) null, 13, (String) null, (gb) null, (String) null);
              break L0;
            }
          }
          return var2;
        }
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
        ((th) this).field_Kb = new le(0L, param2);
        ((th) this).field_Gb = new pb(0L, param3, true);
        ((th) this).field_Mb = new pb(0L, param3, false);
        ((th) this).a(false, ((th) this).field_Kb);
        ((th) this).a(false, (le) (Object) ((th) this).field_Gb);
        ((th) this).a(false, (le) (Object) ((th) this).field_Mb);
        ((th) this).field_Ib = param1;
        ((th) this).field_Kb.a(false, param1);
    }

    final static nc a(gb param0, int param1, String param2, gb param3, String param4) {
        int var5 = param0.a((byte) -2, param4);
        int var6 = -53 / ((param1 - -52) / 49);
        int var7 = param0.a(var5, param2, -1);
        return cj.a(param3, 7844, var7, param0, var5);
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
          if (param3 > 10) {
            break L1;
          } else {
            field_Lb = 108;
            break L1;
          }
        }
        L2: {
          if (!((th) this).field_Gb.g(122)) {
            break L2;
          } else {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z - param4;
            break L2;
          }
        }
        L3: {
          if (((th) this).field_Gb.h(-1)) {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z + param1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((th) this).field_Gb.e((byte) 112)) {
            ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z - param1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((th) this).field_Mb.i(4308)) {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib + param4;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (((th) this).field_Mb.g(126)) {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib - param4;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (!((th) this).field_Mb.h(-1)) {
            break L7;
          } else {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib + param0;
            break L7;
          }
        }
        L8: {
          if (((th) this).field_Mb.e((byte) 63)) {
            ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib - param0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (((th) this).field_S) {
            if (((th) this).field_Kb.field_sb <= ((th) this).field_Ib.field_sb) {
              ((th) this).field_Ib.field_z = ((th) this).field_Ib.field_z - param2;
              break L9;
            } else {
              ((th) this).field_Ib.field_ib = ((th) this).field_Ib.field_ib - param2;
              break L9;
            }
          } else {
            break L9;
          }
        }
        L10: {
          if (param5) {
            L11: {
              if (-(((th) this).field_Ib.field_z + ((th) this).field_Ib.field_zb) < 0) {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (-1 >= (-(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb) ^ -1)) {
                break L12;
              } else {
                ((th) this).field_Ib.field_ib = -((th) this).field_Ib.field_tb;
                break L12;
              }
            }
            L13: {
              if (((th) this).field_Ib.field_sb + (((th) this).field_Ib.field_N + -((th) this).field_Kb.field_sb) >= -(((th) this).field_Ib.field_zb - -((th) this).field_Ib.field_z)) {
                break L13;
              } else {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb + -(-((th) this).field_Kb.field_sb + (((th) this).field_Ib.field_N + ((th) this).field_Ib.field_sb));
                break L13;
              }
            }
            if (((th) this).field_Ib.field_X + ((th) this).field_Ib.field_qb + -((th) this).field_Kb.field_qb < -(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb)) {
              ((th) this).field_Ib.field_ib = -(((th) this).field_Ib.field_qb - -((th) this).field_Ib.field_X - ((th) this).field_Kb.field_qb) - ((th) this).field_Ib.field_tb;
              break L10;
            } else {
              break L10;
            }
          } else {
            L14: {
              if (-((th) this).field_Kb.field_sb + ((th) this).field_Ib.field_sb - -((th) this).field_Ib.field_N < -(((th) this).field_Ib.field_z + ((th) this).field_Ib.field_zb)) {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb + -(((th) this).field_Ib.field_sb - (-((th) this).field_Ib.field_N - -((th) this).field_Kb.field_sb));
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-(((th) this).field_Ib.field_zb - -((th) this).field_Ib.field_z) >= 0) {
                break L15;
              } else {
                ((th) this).field_Ib.field_z = -((th) this).field_Ib.field_zb;
                break L15;
              }
            }
            L16: {
              if (((th) this).field_Ib.field_X + ((th) this).field_Ib.field_qb + -((th) this).field_Kb.field_qb >= -(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb)) {
                break L16;
              } else {
                ((th) this).field_Ib.field_ib = -(-((th) this).field_Kb.field_qb + ((th) this).field_Ib.field_qb - -((th) this).field_Ib.field_X) + -((th) this).field_Ib.field_tb;
                break L16;
              }
            }
            if ((-(((th) this).field_Ib.field_ib + ((th) this).field_Ib.field_tb) ^ -1) > -1) {
              ((th) this).field_Ib.field_ib = -((th) this).field_Ib.field_tb;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L17: {
          if (((th) this).field_Gb.d((byte) -124)) {
            ((th) this).field_Ib.field_zb = -((th) this).field_Gb.a(((th) this).field_Ib.field_sb, param5, ((th) this).field_Kb.field_sb, 101);
            ((th) this).field_Ib.field_z = 0;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if (((th) this).field_Mb.d((byte) -128)) {
            ((th) this).field_Ib.field_tb = -((th) this).field_Mb.b(((th) this).field_Ib.field_qb, param5, 121, ((th) this).field_Kb.field_qb);
            ((th) this).field_Ib.field_ib = 0;
            break L18;
          } else {
            break L18;
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
