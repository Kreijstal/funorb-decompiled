/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends sr {
    static rv field_p;
    static int[] field_n;
    static int field_o;
    static long[] field_q;

    final int a(int param0) {
        if (param0 >= -69) {
            field_q = null;
            return 2;
        }
        return 2;
    }

    en() {
    }

    public static void b(byte param0) {
        field_q = null;
        field_p = null;
        if (param0 != 38) {
            field_o = -26;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        L0: {
          param0 = param0 >> 9;
          if (param0 < 0) {
            param0++;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (param0 < -4) {
            var2 = var2 | 2;
            break L1;
          } else {
            if (4 >= param0) {
              break L1;
            } else {
              L2: {
                var2 = var2 | 2;
                if ((param0 ^ -1) >= 2) {
                  break L2;
                } else {
                  if (param0 >= 3) {
                    break L2;
                  } else {
                    var2 = var2 | 8;
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 <= -1) {
                  break L3;
                } else {
                  if (6 >= param0) {
                    break L3;
                  } else {
                    var2 = var2 | 4;
                    break L3;
                  }
                }
              }
              if (param0 > 0) {
                L4: {
                  if ((param0 ^ -1) > -8) {
                    var2 = var2 | 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param1 != -25147) {
                  return 14;
                } else {
                  return var2;
                }
              } else {
                if (param1 != -25147) {
                  return 14;
                } else {
                  return var2;
                }
              }
            }
          }
        }
        L5: {
          if ((param0 ^ -1) >= 2) {
            break L5;
          } else {
            if (param0 >= 3) {
              break L5;
            } else {
              var2 = var2 | 8;
              break L5;
            }
          }
        }
        L6: {
          if (param0 <= -1) {
            break L6;
          } else {
            if (6 >= param0) {
              break L6;
            } else {
              var2 = var2 | 4;
              break L6;
            }
          }
        }
        L7: {
          if (param0 <= 0) {
            break L7;
          } else {
            if ((param0 ^ -1) > -8) {
              var2 = var2 | 1;
              break L7;
            } else {
              if (param1 != -25147) {
                return 14;
              } else {
                return var2;
              }
            }
          }
        }
        if (param1 != -25147) {
          return 14;
        } else {
          return var2;
        }
    }

    final static void a(int param0, int param1) {
        ng.field_a = (param0 & 60) >> -1115771196;
        q.field_b = (param0 & 14) >> 927309026;
        if (-3 <= (ng.field_a ^ -1)) {
          if (param1 == -1) {
            if (2 >= q.field_b) {
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            } else {
              q.field_b = 2;
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            field_p = null;
            if (2 >= q.field_b) {
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            } else {
              q.field_b = 2;
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ng.field_a = 2;
          if (param1 != -1) {
            field_p = null;
            if (2 < q.field_b) {
              q.field_b = 2;
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            } else {
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            if (2 < q.field_b) {
              q.field_b = 2;
              fc.field_a = param0 & 3;
              if (fc.field_a <= 2) {
                return;
              } else {
                fc.field_a = 2;
                return;
              }
            } else {
              fc.field_a = param0 & 3;
              if (fc.field_a > 2) {
                fc.field_a = 2;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        up var5 = null;
        String var6 = null;
        String var7 = null;
        up var8 = null;
        var8 = ((sp) param1).field_Sb;
        var4 = var8;
        var5 = ((sp) param2).field_Sb;
        if (param0 != 2) {
          int discarded$1 = en.b(83, 32);
          var6 = ce.field_G[var8.field_q][var8.field_l];
          var7 = ce.field_G[var5.field_q][var5.field_l];
          return var6.compareTo(var7) ^ ((en) this).field_i << -1617887873;
        } else {
          var6 = ce.field_G[var8.field_q][var8.field_l];
          var7 = ce.field_G[var5.field_q][var5.field_l];
          return var6.compareTo(var7) ^ ((en) this).field_i << -1617887873;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_p = new rv();
        field_o = -1;
        field_q = new long[]{64356L, 63569L, 64749L};
        field_n = new int[64];
        for (var0 = 0; field_n.length > var0; var0++) {
            field_n[var0] = (var0 << 1050199009) * 65793;
        }
    }
}
