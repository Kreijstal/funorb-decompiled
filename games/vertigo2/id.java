/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_d;
    private jl field_e;
    static sq field_g;
    static mi field_f;
    private r field_h;
    private r field_b;
    static long field_a;
    private jl field_c;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          if (!param2) {
            if (!param3) {
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            } else {
              var4++;
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          } else {
            var4 += 2;
            if (!param3) {
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            } else {
              var4++;
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          }
        } else {
          var4 += 4;
          if (param2) {
            var4 += 2;
            if (param3) {
              var4++;
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            } else {
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          } else {
            if (param3) {
              var4++;
              if (param1 == 1342181375) {
                return qn.field_t[var4];
              } else {
                field_g = null;
                return qn.field_t[var4];
              }
            } else {
              if (param1 != 1342181375) {
                field_g = null;
                return qn.field_t[var4];
              } else {
                return qn.field_t[var4];
              }
            }
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (!sq.field_c) {
          throw new IllegalStateException();
        } else {
          mg.field_O = true;
          pm.a((byte) 52, true);
          var1 = 39 % ((param0 - 88) / 32);
          hn.field_w = 0;
          return;
        }
    }

    final static boolean a(mi param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -31980) {
          L0: {
            field_g = null;
            if (-2 != param0.c((byte) -109, 1)) {
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
            if (-2 != param0.c((byte) -109, 1)) {
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

    final ae a(boolean param0, int[] param1, int param2) {
        Object var5 = null;
        if (-2 == (((id) this).field_b.c(-1) ^ -1)) {
          return this.a(param1, 120, param2, 0);
        } else {
          if (1 == ((id) this).field_b.b(param2, (byte) -73)) {
            return this.a(param1, 124, 0, param2);
          } else {
            if (param0) {
              var5 = null;
              ae discarded$2 = this.a((int[]) null, 126, -12, -30);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final static int a(int param0, short param1, short param2, lg param3, boolean param4, short param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = param3.field_p[param1] + param3.field_p[param5] >> -1885119935;
        var7 = param3.field_D[param1] + param3.field_D[param5] >> -1566516639;
        var8 = param3.field_i[param1] + param3.field_i[param5] >> -50922463;
        param2 = (short)param3.a(var6 + (param3.field_p[param2] + -var6) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param2] + -var7) / (64 + -param0), var8 + 64 * (-var8 + param3.field_i[param2]) / (64 + -param0));
        param1 = (short)param3.a(var6 + (-var6 + param3.field_p[param1]) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param1] + -var7) / (-param0 + 64), var8 + (-var8 + param3.field_i[param1]) * 64 / (-param0 + 64));
        if (param4) {
          return -5;
        } else {
          param5 = (short)param3.a(var6 + 64 * (param3.field_p[param5] + -var6) / (-param0 + 64), var7 + (-var7 + param3.field_D[param5]) * 64 / (-param0 + 64), var8 + 64 * (-var8 + param3.field_i[param5]) / (64 + -param0));
          return param3.a(param2, param1, param5);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 76) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final ae a(int[] param0, int param1, int param2) {
        Object var5 = null;
        if (((id) this).field_h.c(-1) == 1) {
          return this.b(param0, 0, -127, param2);
        } else {
          if (((id) this).field_h.b(param2, (byte) -94) != 1) {
            if (param1 != 64) {
              var5 = null;
              ae discarded$2 = this.a((int[]) null, -38, -61, 48);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.b(param0, param2, -128, 0);
          }
        }
    }

    private final ae a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ae var8 = null;
        ae var8_ref = null;
        hp var9 = null;
        ae var10 = null;
        hp var11 = null;
        ae var12 = null;
        hp var20 = null;
        ae var21 = null;
        hp var23 = null;
        ae var24 = null;
        var5 = (param3 >>> 151026956 | (param3 & 1342181375) << -1945268060) ^ param2;
        var5 = var5 | param3 << -1558677712;
        if (param1 > 119) {
          var6 = (long)var5;
          var8 = (ae) (Object) ((id) this).field_c.a(var6, (byte) 64);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                var23 = hp.a(((id) this).field_b, param3, param2);
                if (var23 == null) {
                  return null;
                } else {
                  L0: {
                    var24 = var23.a();
                    var8_ref = var24;
                    ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                    if (param0 != null) {
                      param0[0] = param0[0] - var24.field_s.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var23 = hp.a(((id) this).field_b, param3, param2);
              if (var23 == null) {
                return null;
              } else {
                L1: {
                  var24 = var23.a();
                  var8_ref = var24;
                  ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                  if (param0 != null) {
                    param0[0] = param0[0] - var24.field_s.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            }
          }
        } else {
          ((id) this).field_e = null;
          var6 = (long)var5;
          var8 = (ae) (Object) ((id) this).field_c.a(var6, (byte) 64);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                var20 = hp.a(((id) this).field_b, param3, param2);
                var9 = var20;
                if (var20 == null) {
                  return null;
                } else {
                  L2: {
                    var21 = var20.a();
                    var8_ref = var21;
                    ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                    if (param0 != null) {
                      param0[0] = param0[0] - var21.field_s.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var11 = hp.a(((id) this).field_b, param3, param2);
              var9 = var11;
              if (var11 == null) {
                return null;
              } else {
                L3: {
                  var12 = var11.a();
                  var10 = var12;
                  var8_ref = var12;
                  ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                  if (param0 != null) {
                    param0[0] = param0[0] - var12.field_s.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            }
          }
        }
    }

    final static qi a(int param0, int param1, byte param2, int param3, jj param4, int param5) {
        java.awt.Frame var6 = null;
        qi var7 = null;
        java.awt.Frame var8 = null;
        if (param2 == 94) {
          var8 = oc.a(param5, param1, param0, param4, param3, 54);
          var6 = var8;
          if (var8 == null) {
            return null;
          } else {
            var7 = new qi();
            var7.field_c = var8;
            java.awt.Component discarded$2 = var7.field_c.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param3, param5);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    private final ae b(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ae var8 = null;
        ae var8_ref = null;
        vh var9 = null;
        vh var9_ref = null;
        var5 = (param1 >>> 174054220 | (-1879044097 & param1) << 1779724932) ^ param3;
        var5 = var5 | param1 << -922099984;
        if (param2 <= -125) {
          var6 = 4294967296L ^ (long)var5;
          var8 = (ae) (Object) ((id) this).field_c.a(var6, (byte) 64);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (param0[0] > 0) {
                L0: {
                  var9 = (vh) (Object) ((id) this).field_e.a(var6, (byte) 64);
                  if (var9 == null) {
                    var9_ref = vh.a(((id) this).field_h, param1, param3);
                    if (var9_ref != null) {
                      ((id) this).field_e.a((li) (Object) var9_ref, var6, false);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param0);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c(2);
                  ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (vh) (Object) ((id) this).field_e.a(var6, (byte) 64);
                if (var9 == null) {
                  var9_ref = vh.a(((id) this).field_h, param1, param3);
                  if (var9_ref != null) {
                    ((id) this).field_e.a((li) (Object) var9_ref, var6, false);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(2);
                ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                return var8_ref;
              }
            }
          }
        } else {
          field_a = 53L;
          var6 = 4294967296L ^ (long)var5;
          var8 = (ae) (Object) ((id) this).field_c.a(var6, (byte) 64);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (param0[0] > 0) {
                L2: {
                  var9 = (vh) (Object) ((id) this).field_e.a(var6, (byte) 64);
                  if (var9 == null) {
                    var9_ref = vh.a(((id) this).field_h, param1, param3);
                    if (var9_ref != null) {
                      ((id) this).field_e.a((li) (Object) var9_ref, var6, false);
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    break L2;
                  }
                }
                var8_ref = var9_ref.a(param0);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c(2);
                  ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L3: {
                var9 = (vh) (Object) ((id) this).field_e.a(var6, (byte) 64);
                if (var9 == null) {
                  var9_ref = vh.a(((id) this).field_h, param1, param3);
                  if (var9_ref != null) {
                    ((id) this).field_e.a((li) (Object) var9_ref, var6, false);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(2);
                ((id) this).field_c.a((li) (Object) var8_ref, var6, false);
                return var8_ref;
              }
            }
          }
        }
    }

    id(r param0, r param1) {
        ((id) this).field_e = new jl(256);
        ((id) this).field_c = new jl(256);
        ((id) this).field_b = param0;
        ((id) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sq();
    }
}
