/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static String field_b;
    static int[] field_g;
    ra field_m;
    static wk[] field_l;
    static wk field_r;
    static int[] field_s;
    static wk field_q;
    static String field_k;
    ra field_a;
    static int[] field_h;
    ra field_j;
    ra field_p;
    int field_i;
    gi field_o;
    long field_e;
    byte field_n;
    volatile int field_f;
    gi field_c;
    volatile int field_t;
    qa field_d;

    public static void c(byte param0) {
        int var1 = 82 % ((-38 - param0) / 51);
        field_s = null;
        field_b = null;
        field_q = null;
        field_g = null;
        field_l = null;
        field_k = null;
        field_r = null;
        field_h = null;
    }

    final int a(byte param0) {
        if (param0 != 16) {
            return 76;
        }
        return ((vk) this).field_m.a((byte) -115) + ((vk) this).field_a.a((byte) -105);
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 100) {
          L0: {
            boolean discarded$10 = ((vk) this).d((byte) 105);
            if ((((vk) this).d(-21033) ^ -1) > -21) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((vk) this).d(-21033) ^ -1) > -21) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int d(int param0) {
        if (param0 != -21033) {
          ((vk) this).a(124);
          return ((vk) this).field_j.a((byte) -102) - -((vk) this).field_p.a((byte) -85);
        } else {
          return ((vk) this).field_j.a((byte) -102) - -((vk) this).field_p.a((byte) -85);
        }
    }

    final static boolean a(long param0, int[] param1, String param2, int param3, int param4) {
        if (param4 == -21) {
          if (param1 != null) {
            if ((param3 ^ -1) == -3) {
              if (!qm.a((byte) -31, param2, param0)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    abstract boolean d(byte param0);

    abstract void a(Object param0, boolean param1, int param2);

    abstract void b(int param0);

    final static void a(boolean param0) {
        pc var1 = null;
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        fc.field_a.b();
        cm.field_j.b();
        la.field_b = la.field_b - 1;
        if (!param0) {
          L0: {
            if (la.field_b != 0) {
              break L0;
            } else {
              la.field_b = 200;
              var1 = (pc) (Object) mm.field_b.e(13058);
              L1: while (true) {
                if (var1 == null) {
                  if (null == rl.field_c) {
                    break L0;
                  } else {
                    var1 = (pc) (Object) rl.field_c.e(13058);
                    L2: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L3: {
                          if (var1.field_u.b((byte) -12)) {
                            break L3;
                          } else {
                            var1.b(4);
                            break L3;
                          }
                        }
                        var1 = (pc) (Object) rl.field_c.a((byte) -6);
                        continue L2;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (var1.field_u.b((byte) -12)) {
                      break L4;
                    } else {
                      var1.b(4);
                      break L4;
                    }
                  }
                  var1 = (pc) (Object) mm.field_b.a((byte) -101);
                  continue L1;
                }
              }
            }
          }
          L5: {
            if (null == q.field_f) {
              break L5;
            } else {
              if (!q.field_f.d((byte) 90)) {
                ml.field_g = null;
                break L5;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          field_s = null;
          if (la.field_b == 0) {
            la.field_b = 200;
            var1 = (pc) (Object) mm.field_b.e(13058);
            L6: while (true) {
              if (var1 == null) {
                if (null != rl.field_c) {
                  var1 = (pc) (Object) rl.field_c.e(13058);
                  L7: while (true) {
                    if (var1 == null) {
                      L8: {
                        if (null == q.field_f) {
                          break L8;
                        } else {
                          if (!q.field_f.d((byte) 90)) {
                            ml.field_g = null;
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      L9: {
                        if (var1.field_u.b((byte) -12)) {
                          break L9;
                        } else {
                          var1.b(4);
                          break L9;
                        }
                      }
                      var1 = (pc) (Object) rl.field_c.a((byte) -6);
                      continue L7;
                    }
                  }
                } else {
                  L10: {
                    if (null == q.field_f) {
                      break L10;
                    } else {
                      if (!q.field_f.d((byte) 90)) {
                        ml.field_g = null;
                        break L10;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L11: {
                  if (var1.field_u.b((byte) -12)) {
                    break L11;
                  } else {
                    var1.b(4);
                    break L11;
                  }
                }
                var1 = (pc) (Object) mm.field_b.a((byte) -101);
                continue L6;
              }
            }
          } else {
            if (null != q.field_f) {
              if (q.field_f.d((byte) 90)) {
                return;
              } else {
                ml.field_g = null;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    abstract void a(int param0);

    final boolean c(int param0) {
        int var2 = -117 / ((-48 - param0) / 41);
        return 20 <= ((vk) this).a((byte) 16) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ak param6, byte param7, mi param8, int param9, ak param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, mi param18, ak param19, int param20) {
        int var21 = 87 % ((-55 - param7) / 51);
        kg.a(2048, param8, param18, param11);
        he.a(false, param14, param0, param17, param9);
        sf.a(52, param13, param1);
        hf.a(param10, param2, param3, param6, -125, param16);
        qe.a(param19, param12, param20, 3);
        ph.a(param4, param5, param15, -97);
    }

    final qa a(byte param0, int param1, int param2, boolean param3, byte param4) {
        long var6 = ((long)param1 << -17987872) - -(long)param2;
        qa var8 = new qa();
        var8.field_w = var6;
        int var9 = 90 / ((param4 - -46) / 45);
        var8.field_K = param0;
        var8.field_B = param3 ? true : false;
        if (param3) {
            if (-21 >= ((vk) this).a((byte) 16)) {
                throw new RuntimeException();
            }
            ((vk) this).field_m.a((byte) 96, (kd) (Object) var8);
        } else {
            if (!(-21 > ((vk) this).d(-21033))) {
                throw new RuntimeException();
            }
            ((vk) this).field_j.a((byte) 47, (kd) (Object) var8);
        }
        return var8;
    }

    vk() {
        ((vk) this).field_m = new ra();
        ((vk) this).field_a = new ra();
        ((vk) this).field_j = new ra();
        ((vk) this).field_p = new ra();
        ((vk) this).field_o = new gi(6);
        ((vk) this).field_n = (byte) 0;
        ((vk) this).field_f = 0;
        ((vk) this).field_t = 0;
        ((vk) this).field_c = new gi(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter name of friend to delete from list";
        field_s = new int[]{84, 104, 29, 87, 29, 24, 24, 24, 86, 85, 47, 17, 3, 8, 31, 29, 16, 13, 17, -1};
        field_k = "You have 1 unread message!";
        field_h = new int[]{100, 25};
    }
}
