/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kga extends dg {
    private bua field_s;
    private int field_p;
    private int field_r;
    private int field_t;
    private int field_m;
    static String field_q;
    static dn field_o;
    static eua field_n;

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
        if (((kga) this).a(127).field_E >= 20) {
          if (0 == ((kga) this).field_t) {
            ((kga) this).field_s = new bua(3, 0);
            return;
          } else {
            return;
          }
        } else {
          ((kga) this).a(param1, -2159, param0);
          if (0 != ((kga) this).field_t) {
            return;
          } else {
            ((kga) this).field_s = new bua(3, 0);
            return;
          }
        }
    }

    final void a(gma param0, int param1, gr param2) {
        int var5 = 0;
        int var6 = 0;
        ue var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        if (!(param2 instanceof ue)) {
          if (!(param2 instanceof rl)) {
            if (!(param2 instanceof ok)) {
              if (!(param2 instanceof ef)) {
                return;
              } else {
                ((kga) this).field_t = 4;
                return;
              }
            } else {
              ((kga) this).field_t = 5;
              return;
            }
          } else {
            ((kga) this).field_t = 5;
            return;
          }
        } else {
          var7 = (ue) (Object) param2;
          var5 = var7.j((byte) -77);
          if (var5 != 0) {
            if (var5 != 3) {
              if (var5 != 1) {
                if (-3 != (var5 ^ -1)) {
                  return;
                } else {
                  ((kga) this).field_t = 1;
                  return;
                }
              } else {
                ((kga) this).field_t = 0;
                return;
              }
            } else {
              ((kga) this).field_t = 2;
              return;
            }
          } else {
            ((kga) this).field_t = 3;
            return;
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        ka var11_ref = null;
        int var6 = 0;
        ka var7 = null;
        ka var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ka var11 = null;
        ka var12 = null;
        ka var13 = null;
        ka var14 = null;
        ka var14_ref = null;
        ka var15 = null;
        ka var15_ref = null;
        ka var16 = null;
        ka var16_ref = null;
        int stackIn_8_0 = 0;
        ka stackIn_20_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        ka stackOut_19_0 = null;
        ka stackOut_18_0 = null;
        var11_ref = null;
        var10 = TombRacer.field_G ? 1 : 0;
        if (null != ((kga) this).field_h) {
          L0: {
            if (((kga) this).field_k instanceof pd) {
              if (((pd) (Object) ((kga) this).field_k).c(-72)) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          }
          var6 = stackIn_8_0;
          var7 = null;
          var8 = ((kga) this).field_t;
          if (var8 == -1) {
            L1: {
              if (var6 == 0) {
                stackOut_19_0 = rl.field_t[0];
                stackIn_20_0 = stackOut_19_0;
                break L1;
              } else {
                stackOut_18_0 = ((kga) this).field_s.b((byte) 74);
                stackIn_20_0 = stackOut_18_0;
                break L1;
              }
            }
            var11_ref = stackIn_20_0;
            var12 = var11_ref;
            var12 = var11_ref;
            var7 = var11_ref;
            if (var6 != 0) {
              ((kga) this).field_s.a(3, false, (byte) -84, 9);
              var12 = ((kga) this).field_s.b((byte) 74);
              var8 = 73 / ((-38 - param4) / 47);
              if (var6 != 0) {
                if (((kga) this).field_t != 0) {
                  return;
                } else {
                  L2: {
                    if (var12 == null) {
                      break L2;
                    } else {
                      var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                      gqa.a(var9, -83584144, param1, param2, var12, param3);
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                L3: {
                  param3 = param3 + ((kga) this).field_r;
                  if (var12 == null) {
                    break L3;
                  } else {
                    var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                    gqa.a(var9, -83584144, param1, param2, var12, param3);
                    break L3;
                  }
                }
                return;
              }
            } else {
              L4: {
                var8 = 73 / ((-38 - param4) / 47);
                param3 = param3 + ((kga) this).field_r;
                if (var11_ref == null) {
                  break L4;
                } else {
                  var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                  gqa.a(var9, -83584144, param1, param2, var11_ref, param3);
                  break L4;
                }
              }
              return;
            }
          } else {
            if (-2 != var8) {
              if (var8 != 2) {
                if (3 == var8) {
                  var15_ref = rl.field_t[4];
                  var16 = var15_ref;
                  var7 = var16;
                  var16 = var15_ref;
                  var8 = 73 / ((-38 - param4) / 47);
                  if (var6 != 0) {
                    if (((kga) this).field_t != 0) {
                      return;
                    } else {
                      L5: {
                        if (var15_ref == null) {
                          break L5;
                        } else {
                          var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                          gqa.a(var9, -83584144, param1, param2, var15_ref, param3);
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      param3 = param3 + ((kga) this).field_r;
                      if (var15_ref == null) {
                        break L6;
                      } else {
                        var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                        gqa.a(var9, -83584144, param1, param2, var15_ref, param3);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  if ((var8 ^ -1) == -5) {
                    var16_ref = rl.field_t[5];
                    var7 = var16_ref;
                    var7 = var16_ref;
                    var8 = 73 / ((-38 - param4) / 47);
                    if (var6 != 0) {
                      if (((kga) this).field_t != 0) {
                        return;
                      } else {
                        L7: {
                          if (var16_ref == null) {
                            break L7;
                          } else {
                            var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                            gqa.a(var9, -83584144, param1, param2, var16_ref, param3);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        param3 = param3 + ((kga) this).field_r;
                        if (var16_ref == null) {
                          break L8;
                        } else {
                          var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                          gqa.a(var9, -83584144, param1, param2, var16_ref, param3);
                          break L8;
                        }
                      }
                      return;
                    }
                  } else {
                    L9: {
                      if ((var8 ^ -1) != -6) {
                        break L9;
                      } else {
                        var7_ref = rl.field_t[7];
                        break L9;
                      }
                    }
                    var8 = 73 / ((-38 - param4) / 47);
                    if (var6 != 0) {
                      if (((kga) this).field_t != 0) {
                        return;
                      } else {
                        L10: {
                          if (var7_ref == null) {
                            break L10;
                          } else {
                            var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                            gqa.a(var9, -83584144, param1, param2, var7_ref, param3);
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L11: {
                        param3 = param3 + ((kga) this).field_r;
                        if (var7_ref == null) {
                          break L11;
                        } else {
                          var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                          gqa.a(var9, -83584144, param1, param2, var7_ref, param3);
                          break L11;
                        }
                      }
                      return;
                    }
                  }
                }
              } else {
                var14_ref = rl.field_t[2];
                var15 = var14_ref;
                var16 = var15;
                var7 = var16;
                var15 = var14_ref;
                var8 = 73 / ((-38 - param4) / 47);
                if (var6 != 0) {
                  if (((kga) this).field_t != 0) {
                    return;
                  } else {
                    L12: {
                      if (var14_ref == null) {
                        break L12;
                      } else {
                        var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                        gqa.a(var9, -83584144, param1, param2, var14_ref, param3);
                        break L12;
                      }
                    }
                    return;
                  }
                } else {
                  L13: {
                    param3 = param3 + ((kga) this).field_r;
                    if (var14_ref == null) {
                      break L13;
                    } else {
                      var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                      gqa.a(var9, -83584144, param1, param2, var14_ref, param3);
                      break L13;
                    }
                  }
                  return;
                }
              }
            } else {
              var13 = rl.field_t[1];
              var14 = var13;
              var15 = var14;
              var16 = var15;
              var7 = var16;
              var14 = var13;
              var8 = 73 / ((-38 - param4) / 47);
              if (var6 != 0) {
                if (((kga) this).field_t != 0) {
                  return;
                } else {
                  L14: {
                    if (var13 == null) {
                      break L14;
                    } else {
                      var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                      gqa.a(var9, -83584144, param1, param2, var13, param3);
                      break L14;
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  param3 = param3 + ((kga) this).field_r;
                  if (var13 == null) {
                    break L15;
                  } else {
                    var9 = dfa.a(-((kga) this).field_h.g(-25787) + 4096 - -((kga) this).field_m >> 414378818, 2048, -117);
                    gqa.a(var9, -83584144, param1, param2, var13, param3);
                    break L15;
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void n(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != 9) {
            return;
        }
        field_q = null;
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        if (param0 <= 119) {
          L0: {
            ((kga) this).f(88);
            if (-21 >= param1.field_E) {
              ((kga) this).field_t = param2.b((byte) 44, 4);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-21 <= param1.field_E) {
              ((kga) this).field_t = param2.b((byte) 44, 4);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void i(int param0) {
        qpa.a(275, ht.field_Pb, 3, 40, 440, 126, 200);
        qpa.a(275, cla.field_n, 5, 40, 440, 126, 200);
        qpa.a(275, se.field_s, 6, 40, 440, 124, 200);
        qpa.a(335, jta.field_z, 9, 40, 440, 125, 200);
        if (param0 < 97) {
            Object var2 = null;
            kga.a((cka) null, -2);
        }
    }

    kga(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((kga) this).field_m = 0;
        ((kga) this).field_p = 0;
    }

    public final void f(int param0) {
        super.f(param0 ^ 0);
        if (param0 == -4366) {
          L0: {
            if (null != ((kga) this).field_s) {
              ((kga) this).field_s.a(0);
              break L0;
            } else {
              break L0;
            }
          }
          if ((((kga) this).field_t ^ -1) != -2) {
            if ((((kga) this).field_t ^ -1) == -3) {
              return;
            } else {
              ((kga) this).field_p = ((kga) this).field_p + 32;
              ((kga) this).field_m = ((kga) this).field_m + 96;
              ((kga) this).field_r = 524288 + hua.a((byte) 119, dfa.a(((kga) this).field_p, 2048, -122)) * 8;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        super.a((byte) -58, param1);
        param1.a((byte) 61, ((kga) this).field_t, 4);
        int var3 = 15 % ((-8 - param0) / 40);
    }

    final static void a(cka param0, int param1) {
        ama var7 = null;
        dca var9 = null;
        mq var11 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        L0: {
          if (hna.field_e != null) {
            break L0;
          } else {
            var7 = new ama();
            var20 = var7.a(16, 128, 0, 128);
            hna.field_e = bw.a(270, var20, false);
            break L0;
          }
        }
        L1: {
          if (null != gu.field_l) {
            break L1;
          } else {
            var9 = new dca();
            var21 = var9.a(128, 16, 123, 128);
            gu.field_l = bw.a(270, var21, false);
            break L1;
          }
        }
        var11 = param0.field_zc;
        if (param1 >= 116) {
          if (var11.a((byte) 89)) {
            if (uga.field_m != null) {
              return;
            } else {
              var23 = gaa.a(4.0f, 16.0f, 128, (jg) (Object) new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
              uga.field_m = bw.a(270, var23, false);
              return;
            }
          } else {
            return;
          }
        } else {
          kga.n((byte) 16);
          if (!var11.a((byte) 89)) {
            return;
          } else {
            L2: {
              if (uga.field_m == null) {
                var22 = gaa.a(4.0f, 16.0f, 128, (jg) (Object) new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                uga.field_m = bw.a(270, var22, false);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    final void b(byte param0, int param1) {
        ((kga) this).field_t = param1;
        if (param0 <= 73) {
            Object var4 = null;
            kga.a((cka) null, 79);
        }
    }

    kga(int param0) {
        super(param0);
        ((kga) this).field_m = 0;
        ((kga) this).field_p = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Bouncy Fireballs";
        field_o = new dn();
    }
}
