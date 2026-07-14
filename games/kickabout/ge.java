/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends jd {
    static ff field_j;
    static String[] field_o;
    private ga field_l;
    static ut field_k;
    static int[] field_m;
    static hd field_n;

    final static void a(int param0, int param1, byte param2, int param3) {
        hn var4 = null;
        if (param2 >= 93) {
          var4 = new hn(2, new int[3]);
          ii.a(var4, 73);
          if (25 == cq.field_h.field_c) {
            ((b) (Object) cq.field_h).h((byte) 84);
            return;
          } else {
            return;
          }
        } else {
          field_o = null;
          var4 = new hn(2, new int[3]);
          ii.a(var4, 73);
          if (25 != cq.field_h.field_c) {
            return;
          } else {
            ((b) (Object) cq.field_h).h((byte) 84);
            return;
          }
        }
    }

    ge(ga param0, ga param1) {
        super(param0);
        ((ge) this).field_l = param1;
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        field_j = null;
        if (param0 != 76) {
          field_j = null;
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    final String a(byte param0, String param1) {
        l var3 = null;
        Object var4 = null;
        if (((ge) this).field_l instanceof cw) {
            var3 = ((cw) (Object) ((ge) this).field_l).a((byte) -115);
            if (var3 == null) {
                if (param0 == 25) {
                    if (!(param1.equals((Object) (Object) ((ge) this).field_l.field_q))) {
                        return rl.field_p;
                    }
                    return null;
                }
                var4 = null;
                String discarded$4 = ((ge) this).a((byte) -109, (String) null);
                if (!(param1.equals((Object) (Object) ((ge) this).field_l.field_q))) {
                    return rl.field_p;
                }
                return null;
            }
            if (var3.c(-24407) != he.field_yb) {
                return var3.b(-67);
            }
            if (param1.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                return var3.b(-67);
            }
            return rl.field_p;
        }
        if (param0 != 25) {
            var4 = null;
            String discarded$9 = ((ge) this).a((byte) -109, (String) null);
            if (!(param1.equals((Object) (Object) ((ge) this).field_l.field_q))) {
                return rl.field_p;
            }
            return null;
        }
        if (!(param1.equals((Object) (Object) ((ge) this).field_l.field_q))) {
            return rl.field_p;
        }
        return null;
    }

    final static void a(gv param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        var2 = bk.field_c.length - 1;
        L0: while (true) {
          if (1 > var2) {
            if (param1) {
              return;
            } else {
              bk.field_c[0] = param0;
              e.field_j = 0;
              return;
            }
          } else {
            bk.field_c[var2] = bk.field_c[var2 + -1];
            var2--;
            continue L0;
          }
        }
    }

    final rv a(String param0, int param1) {
        l var4 = null;
        l var5 = null;
        rv stackIn_5_0 = null;
        rv stackIn_10_0 = null;
        rv stackIn_16_0 = null;
        rv stackIn_22_0 = null;
        rv stackIn_27_0 = null;
        rv stackIn_33_0 = null;
        rv stackOut_32_0 = null;
        rv stackOut_31_0 = null;
        rv stackOut_26_0 = null;
        rv stackOut_25_0 = null;
        rv stackOut_21_0 = null;
        rv stackOut_20_0 = null;
        rv stackOut_15_0 = null;
        rv stackOut_14_0 = null;
        rv stackOut_9_0 = null;
        rv stackOut_8_0 = null;
        rv stackOut_4_0 = null;
        rv stackOut_3_0 = null;
        if (param1 == -5) {
          if (((ge) this).field_l instanceof cw) {
            var5 = ((cw) (Object) ((ge) this).field_l).a((byte) -113);
            if (var5 != null) {
              if (var5.c(-24407) == he.field_yb) {
                L0: {
                  if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                    stackOut_32_0 = he.field_yb;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = jt.field_Bb;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return stackIn_33_0;
              } else {
                return jt.field_Bb;
              }
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                  stackOut_26_0 = he.field_yb;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = jt.field_Bb;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                stackOut_21_0 = he.field_yb;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = jt.field_Bb;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          field_j = null;
          if (((ge) this).field_l instanceof cw) {
            var4 = ((cw) (Object) ((ge) this).field_l).a((byte) -113);
            if (var4 != null) {
              if (var4.c(-24407) == he.field_yb) {
                L3: {
                  if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                    stackOut_15_0 = he.field_yb;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = jt.field_Bb;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                return stackIn_16_0;
              } else {
                return jt.field_Bb;
              }
            } else {
              L4: {
                if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                  stackOut_9_0 = he.field_yb;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = jt.field_Bb;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                stackOut_4_0 = he.field_yb;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = jt.field_Bb;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static byte[] a(int param0, ut param1) {
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        var8 = Kickabout.field_G;
        var9 = new byte[param1.field_v * (param1.field_o >> 956025187)];
        var2 = var9;
        if (param0 != 16) {
          return null;
        } else {
          var3 = 0;
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (param1.field_v <= var5) {
              return var9;
            } else {
              var6 = 0;
              L1: while (true) {
                if (param1.field_o <= var6) {
                  var5++;
                  continue L0;
                } else {
                  L2: {
                    var7 = 0;
                    var4++;
                    if (param1.field_y[var4] != 0) {
                      var7 = (byte)(var7 | 1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var4++;
                    if (0 == param1.field_y[var4]) {
                      break L3;
                    } else {
                      var7 = (byte)(var7 | 2);
                      break L3;
                    }
                  }
                  L4: {
                    var4++;
                    if (param1.field_y[var4] != 0) {
                      var7 = (byte)(var7 | 4);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var4++;
                    if (param1.field_y[var4] != 0) {
                      var7 = (byte)(var7 | 8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var4++;
                    if (param1.field_y[var4] != 0) {
                      var7 = (byte)(var7 | 16);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var4++;
                    if (param1.field_y[var4] != 0) {
                      var7 = (byte)(var7 | 32);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var4++;
                    if (param1.field_y[var4] == 0) {
                      break L8;
                    } else {
                      var7 = (byte)(var7 | 64);
                      break L8;
                    }
                  }
                  L9: {
                    var4++;
                    if (param1.field_y[var4] != 0) {
                      var7 = (byte)(var7 | 128);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var3++;
                  var9[var3] = (byte)var7;
                  var6 += 8;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ff(9, 0, 4, 1);
        field_m = new int[2];
    }
}
