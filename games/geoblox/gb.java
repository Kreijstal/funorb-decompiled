/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static em field_b;
    static int field_f;
    static int field_c;
    static int field_g;
    private tf field_a;
    private hf field_d;
    static int field_e;

    final static boolean b(int param0) {
        float var1 = 0.0f;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (n.field_j != param0) {
            break L0;
          } else {
            td.a(-348, fl.field_c[25]);
            break L0;
          }
        }
        n.field_j = n.field_j + 1;
        L1: while (true) {
          if (!hh.a(93)) {
            if (0 == n.field_j % 40) {
              if (vc.field_h >= 11) {
                L2: {
                  var1 = -((480.0f - (float)n.field_j) / 480.0f) + 1.0f;
                  if (11 <= vc.field_h) {
                    break L2;
                  } else {
                    si.field_j = ((int)(var1 * ka.field_c) << -231506296) + (uf.field_h[0] + ((int)(var1 * lk.field_b) << -265857872)) - -(int)(kk.field_x * var1);
                    break L2;
                  }
                }
                L3: {
                  var2 = tl.field_r[vc.field_h].field_s >> -757524927;
                  var3 = n.field_j << -597797246;
                  if (sg.field_d) {
                    break L3;
                  } else {
                    if (-var3 + 900 <= 320 + var2) {
                      td.a(-348, fl.field_c[7]);
                      sg.field_d = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (ab.field_d) {
                    break L4;
                  } else {
                    if (-var2 + (320 - qh.field_O[1].field_s) <= -1200 - -var3) {
                      td.a(-348, fl.field_c[8]);
                      ab.field_d = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (494 > n.field_j) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L5;
                  } else {
                    stackOut_50_0 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    break L5;
                  }
                }
                return stackIn_52_0 != 0;
              } else {
                L6: {
                  fh.field_c = n.field_j;
                  vc.field_h = vc.field_h + 1;
                  if (10 != vc.field_h) {
                    break L6;
                  } else {
                    td.a(-348, fl.field_c[26]);
                    break L6;
                  }
                }
                L7: {
                  var1 = -((480.0f - (float)n.field_j) / 480.0f) + 1.0f;
                  if (11 <= vc.field_h) {
                    break L7;
                  } else {
                    si.field_j = ((int)(var1 * ka.field_c) << -231506296) + (uf.field_h[0] + ((int)(var1 * lk.field_b) << -265857872)) - -(int)(kk.field_x * var1);
                    break L7;
                  }
                }
                L8: {
                  var2 = tl.field_r[vc.field_h].field_s >> -757524927;
                  var3 = n.field_j << -597797246;
                  if (sg.field_d) {
                    break L8;
                  } else {
                    if (-var3 + 900 <= 320 + var2) {
                      td.a(-348, fl.field_c[7]);
                      sg.field_d = true;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (ab.field_d) {
                    break L9;
                  } else {
                    if (-var2 + (320 - qh.field_O[1].field_s) <= -1200 - -var3) {
                      td.a(-348, fl.field_c[8]);
                      ab.field_d = true;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (494 > n.field_j) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L10;
                  } else {
                    stackOut_36_0 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    break L10;
                  }
                }
                return stackIn_38_0 != 0;
              }
            } else {
              L11: {
                var1 = -((480.0f - (float)n.field_j) / 480.0f) + 1.0f;
                if (11 <= vc.field_h) {
                  break L11;
                } else {
                  si.field_j = ((int)(var1 * ka.field_c) << -231506296) + (uf.field_h[0] + ((int)(var1 * lk.field_b) << -265857872)) - -(int)(kk.field_x * var1);
                  break L11;
                }
              }
              L12: {
                var2 = tl.field_r[vc.field_h].field_s >> -757524927;
                var3 = n.field_j << -597797246;
                if (sg.field_d) {
                  break L12;
                } else {
                  if (-var3 + 900 <= 320 + var2) {
                    td.a(-348, fl.field_c[7]);
                    sg.field_d = true;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (ab.field_d) {
                  break L13;
                } else {
                  if (-var2 + (320 - qh.field_O[1].field_s) <= -1200 - -var3) {
                    td.a(-348, fl.field_c[8]);
                    ab.field_d = true;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (494 > n.field_j) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L14;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L14;
                }
              }
              return stackIn_20_0 != 0;
            }
          } else {
            if (-14 != (ki.field_d ^ -1)) {
              continue L1;
            } else {
              return true;
            }
          }
        }
    }

    final hf c(byte param0) {
        hf var2 = null;
        var2 = ((gb) this).field_a.field_a.field_b;
        if (var2 != ((gb) this).field_a.field_a) {
          if (param0 != 88) {
            field_g = -4;
            ((gb) this).field_d = var2.field_b;
            return var2;
          } else {
            ((gb) this).field_d = var2.field_b;
            return var2;
          }
        } else {
          ((gb) this).field_d = null;
          return null;
        }
    }

    final hf d(int param0) {
        hf var2 = null;
        var2 = ((gb) this).field_a.field_a.field_c;
        if (((gb) this).field_a.field_a == var2) {
          ((gb) this).field_d = null;
          return null;
        } else {
          if (param0 != 1) {
            hf discarded$2 = ((gb) this).a((byte) 55);
            ((gb) this).field_d = var2.field_c;
            return var2;
          } else {
            ((gb) this).field_d = var2.field_c;
            return var2;
          }
        }
    }

    final hf c(int param0) {
        hf var2 = null;
        var2 = ((gb) this).field_d;
        if (var2 != ((gb) this).field_a.field_a) {
          ((gb) this).field_d = var2.field_c;
          if (param0 != 26) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((gb) this).field_d = null;
          return null;
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        boolean discarded$12 = kd.field_e.a(true, 127, ec.field_d, mj.field_b);
        kd.field_e.i(-65);
        L0: while (true) {
          if (!hh.a(77)) {
            if (fe.field_d == param0) {
              if (va.field_d) {
                return 3;
              } else {
                if (si.field_g == tf.field_d) {
                  return 1;
                } else {
                  if (ih.field_c.a(-106)) {
                    if (kd.field_b == tf.field_d) {
                      return 2;
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              var1 = fe.field_d;
              pc.a(-1, false);
              return var1;
            }
          } else {
            boolean discarded$13 = kd.field_e.a((byte) 105, te.field_a, ki.field_d);
            continue L0;
          }
        }
    }

    final hf a(hf param0, byte param1) {
        hf var3 = null;
        int var4 = 0;
        L0: {
          if (param0 == null) {
            var3 = ((gb) this).field_a.field_a.field_c;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (((gb) this).field_a.field_a == var3) {
          ((gb) this).field_d = null;
          return null;
        } else {
          var4 = 59 / ((param1 - 85) / 38);
          ((gb) this).field_d = var3.field_c;
          return var3;
        }
    }

    public static void b(byte param0) {
        int var1 = -66 / ((33 - param0) / 32);
        field_b = null;
    }

    final static void a(String param0, byte param1) {
        int var2 = -10 / ((58 - param1) / 41);
        System.out.println("Error: " + og.a(param0, "\n", true, "%0a"));
    }

    gb(tf param0) {
        ((gb) this).field_a = param0;
    }

    final hf a(byte param0) {
        hf var2 = ((gb) this).field_d;
        if (param0 <= 105) {
            return null;
        }
        if (!(var2 != ((gb) this).field_a.field_a)) {
            ((gb) this).field_d = null;
            return null;
        }
        ((gb) this).field_d = var2.field_b;
        return var2;
    }

    final hf a(byte param0, hf param1) {
        hf var3 = null;
        if (param1 == null) {
            var3 = ((gb) this).field_a.field_a.field_b;
        } else {
            var3 = param1;
        }
        if (param0 != 56) {
            hf discarded$9 = ((gb) this).d(-60);
            if (!(((gb) this).field_a.field_a != var3)) {
                ((gb) this).field_d = null;
                return null;
            }
            ((gb) this).field_d = var3.field_b;
            return var3;
        }
        if (!(((gb) this).field_a.field_a != var3)) {
            ((gb) this).field_d = null;
            return null;
        }
        ((gb) this).field_d = var3.field_b;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
    }
}
