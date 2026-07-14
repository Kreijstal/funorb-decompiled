/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ei {
    static boolean[] field_p;
    static vd field_t;
    static int[] field_s;
    static String field_r;
    static he[] field_q;

    final String a(byte param0, String param1) {
        if (((g) this).a(8192, param1) == u.field_b) {
            return jf.field_kb;
        }
        if (param0 > 47) {
            return null;
        }
        field_t = null;
        return null;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 <= -32) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 > param6) {
              break L2;
            } else {
              if (param0 + param4 <= param6) {
                break L2;
              } else {
                if (param5 < param3) {
                  break L2;
                } else {
                  if (param3 - -param2 <= param5) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (gl.field_c != -1) {
            break L0;
          } else {
            if (0 == (oc.field_B ^ -1)) {
              oc.field_B = ob.field_g;
              gl.field_c = ck.field_c;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            dd.field_l = dd.field_l + 1;
            if (param0 != null) {
              if (!param0.equals((Object) (Object) ie.field_C)) {
                break L2;
              } else {
                break L1;
              }
            } else {
              if (ie.field_C != null) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (!em.field_c) {
              if (dd.field_l >= qe.field_c) {
                if (je.field_j + qe.field_c > dd.field_l) {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_17_0 = stackOut_14_0;
                  break L3;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_17_0 = stackOut_12_0;
                break L3;
              }
            } else {
              stackOut_10_0 = 0;
              stackIn_17_0 = stackOut_10_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_17_0;
            if (param0 != null) {
              if (!em.field_c) {
                if (var2 != 0) {
                  dd.field_l = qe.field_c;
                  break L4;
                } else {
                  dd.field_l = 0;
                  break L4;
                }
              } else {
                dd.field_l = qe.field_c;
                break L4;
              }
            } else {
              dd.field_l = 0;
              break L4;
            }
          }
          oh.field_e = gl.field_c;
          pi.field_Q = oc.field_B;
          if (param0 != null) {
            em.field_c = false;
            break L1;
          } else {
            if (var2 == 0) {
              break L1;
            } else {
              em.field_c = true;
              break L1;
            }
          }
        }
        ie.field_C = param0;
        if (param1 == 0) {
          L5: {
            if (!em.field_c) {
              gl.field_c = -1;
              if (!em.field_c) {
                break L5;
              } else {
                if (dd.field_l != cd.field_d) {
                  break L5;
                } else {
                  dd.field_l = 0;
                  em.field_c = false;
                  break L5;
                }
              }
            } else {
              gl.field_c = -1;
              if (!em.field_c) {
                break L5;
              } else {
                if (dd.field_l != cd.field_d) {
                  break L5;
                } else {
                  dd.field_l = 0;
                  em.field_c = false;
                  break L5;
                }
              }
            }
          }
          oc.field_B = -1;
          return;
        } else {
          return;
        }
    }

    final static boolean b(byte param0, String param1) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = param1.charAt(0);
        for (var3 = 1; var3 < param1.length(); var3++) {
            if (param1.charAt(var3) != var2) {
                return false;
            }
        }
        if (param0 <= 94) {
            return true;
        }
        return true;
    }

    final vh a(int param0, String param1) {
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!jf.a(var4, param0 + -640)) {
            return u.field_b;
        }
        if (param0 != 8192) {
            field_s = null;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = hh.a(10, var5);
        if (var3 > 0) {
            // if_icmplt L70
        } else {
            return u.field_b;
        }
        return ce.field_e;
    }

    public static void b(boolean param0) {
        if (!param0) {
            boolean discarded$0 = g.a(-14, (byte) -108, 98, -109, -122, -119, -13);
        }
        field_p = null;
        field_q = null;
        field_s = null;
        field_r = null;
        field_t = null;
    }

    g(kl param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[64];
        field_s = new int[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 128, 64, 64, 64, 64, 64, 64, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 64, 64, 64, 64, 0, 128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};
        field_t = new vd();
    }
}
