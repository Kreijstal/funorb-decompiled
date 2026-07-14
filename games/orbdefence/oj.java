/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ca {
    private int field_i;
    private int field_n;
    private int field_h;
    static String field_o;
    private int field_f;
    private lb field_s;
    private int field_m;
    private boolean field_p;
    int field_g;
    private int field_k;
    private int field_l;
    static dh field_q;
    static fk field_j;
    static im field_r;

    final void a(byte param0) {
        if (0 <= ((oj) this).field_g) {
          ((oj) this).field_f = ((oj) this).field_f + ((oj) this).field_l;
          ((oj) this).field_k = ((oj) this).field_k + ((oj) this).field_h;
          if (((oj) this).field_k > 1600) {
            ((oj) this).field_h = ((oj) this).field_h - 1;
            ((oj) this).field_l = ((oj) this).field_l + 1;
            if (param0 == 44) {
              if (!((oj) this).field_p) {
                L0: {
                  ((oj) this).field_g = ((oj) this).field_g + 1;
                  if ((((oj) this).field_g ^ -1) != -101) {
                    break L0;
                  } else {
                    if (!((oj) this).field_p) {
                      ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L1: {
                  ((oj) this).field_g = ((oj) this).field_g + 2;
                  ((oj) this).field_g = ((oj) this).field_g + 1;
                  if ((((oj) this).field_g ^ -1) != -101) {
                    break L1;
                  } else {
                    if (!((oj) this).field_p) {
                      ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              ((oj) this).field_f = -103;
              if (((oj) this).field_p) {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if ((((oj) this).field_g ^ -1) == -101) {
                  L2: {
                    if (!((oj) this).field_p) {
                      ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if ((((oj) this).field_g ^ -1) == -101) {
                  if (((oj) this).field_p) {
                    return;
                  } else {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((oj) this).field_h = ((oj) this).field_h + 1;
            ((oj) this).field_l = ((oj) this).field_l + 1;
            if (param0 == 44) {
              if (!((oj) this).field_p) {
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if ((((oj) this).field_g ^ -1) == -101) {
                  if (!((oj) this).field_p) {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if ((((oj) this).field_g ^ -1) == -101) {
                  if (!((oj) this).field_p) {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((oj) this).field_f = -103;
              if (!((oj) this).field_p) {
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if ((((oj) this).field_g ^ -1) == -101) {
                  if (((oj) this).field_p) {
                    return;
                  } else {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if ((((oj) this).field_g ^ -1) == -101) {
                  if (((oj) this).field_p) {
                    return;
                  } else {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 != 44) {
            ((oj) this).field_f = -103;
            if (((oj) this).field_p) {
              ((oj) this).field_g = ((oj) this).field_g + 2;
              ((oj) this).field_g = ((oj) this).field_g + 1;
              if ((((oj) this).field_g ^ -1) == -101) {
                if (((oj) this).field_p) {
                  return;
                } else {
                  ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                  return;
                }
              } else {
                return;
              }
            } else {
              ((oj) this).field_g = ((oj) this).field_g + 1;
              if ((((oj) this).field_g ^ -1) == -101) {
                if (((oj) this).field_p) {
                  return;
                } else {
                  ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L3: {
              if (!((oj) this).field_p) {
                break L3;
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                break L3;
              }
            }
            L4: {
              ((oj) this).field_g = ((oj) this).field_g + 1;
              if ((((oj) this).field_g ^ -1) != -101) {
                break L4;
              } else {
                if (!((oj) this).field_p) {
                  ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            return;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 == 47) {
          var2 = 1;
          if (-2 != (param1 ^ -1)) {
            if (-3 != param1) {
              if (param1 == 5) {
                L0: {
                  var2 = 2;
                  if ((param1 ^ -1) != -5) {
                    break L0;
                  } else {
                    var2 = 3;
                    break L0;
                  }
                }
                return var2;
              } else {
                L1: {
                  if ((param1 ^ -1) != -5) {
                    break L1;
                  } else {
                    var2 = 3;
                    break L1;
                  }
                }
                return var2;
              }
            } else {
              L2: {
                var2 = 2;
                if ((param1 ^ -1) != -5) {
                  break L2;
                } else {
                  var2 = 3;
                  break L2;
                }
              }
              return var2;
            }
          } else {
            L3: {
              var2 = 2;
              if (param1 != -5) {
                break L3;
              } else {
                var2 = 3;
                break L3;
              }
            }
            return var2;
          }
        } else {
          return 15;
        }
    }

    final static boolean a(ti param0, int param1, ti param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        var3 = param0.field_ab + -param2.field_ab;
        if (param1 == 100) {
          L0: {
            if (param0.field_Z == uc.field_r) {
              // wide iinc 3 -200
              break L0;
            } else {
              if (null == param0.field_Z) {
                // wide iinc 3 200
                break L0;
              } else {
                break L0;
              }
            }
          }
          if (param2.field_Z != uc.field_r) {
            if (param2.field_Z != null) {
              L1: {
                if (var3 <= 0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L1;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L1;
                }
              }
              return stackIn_20_0 != 0;
            } else {
              L2: {
                // wide iinc 3 -200
                if (var3 <= 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L2;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            L3: {
              // wide iinc 3 200
              if (var3 <= 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            return stackIn_11_0 != 0;
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var4 = -param1 + ((((oj) this).field_f >> 1036800260) + 320);
          var5 = 240 + ((((oj) this).field_k >> 1292743844) + -param2);
          if (!((oj) this).field_p) {
            break L0;
          } else {
            var4 = (((oj) this).field_f >> 813333188) + 363;
            var5 = 24 - -(((oj) this).field_k >> 1942111140);
            break L0;
          }
        }
        L1: {
          var6 = 255;
          if (param0 == 54) {
            break L1;
          } else {
            ((oj) this).a((byte) 2, -56, 109);
            break L1;
          }
        }
        L2: {
          var7 = ((oj) this).field_i + 3 << 498524868;
          var8 = ((oj) this).field_g;
          var9 = 363;
          var10 = 24;
          if (((oj) this).field_p) {
            var9 = -param1 + (((oj) this).field_n >> -1355637692) + 320;
            var10 = (((oj) this).field_m >> 741293284) - param2 + 240;
            break L2;
          } else {
            break L2;
          }
        }
        if (100 >= var8) {
          if (0 <= var8) {
            var4 = (var8 * var9 + var4 * (-var8 + 100)) / 100;
            var5 = (var8 * var10 + var5 * (-var8 + 100)) / 100;
            if (var8 < 0) {
              if (!((oj) this).field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << -1244787388, var5 << -1297325724, var7, var6, ki.field_f);
              return;
            }
          } else {
            if (var8 < 0) {
              if (!((oj) this).field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << -1244787388, var5 << -1297325724, var7, var6, ki.field_f);
              return;
            }
          }
        } else {
          var5 = var10;
          var4 = var9;
          if (!((oj) this).field_p) {
            var6 = 200 - var8;
            var7 = 320;
            if (var8 < 0) {
              if (!((oj) this).field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << -1244787388, var5 << -1297325724, var7, var6, ki.field_f);
              return;
            }
          } else {
            return;
          }
        }
    }

    oj(int param0, int param1, lb param2, int param3) {
        ((oj) this).field_k = param1 * ol.field_e << -16368572;
        ((oj) this).field_f = ol.field_e * param0 << -506286044;
        ((oj) this).field_l = (int)(-80.0 + Math.random() * 161.0);
        ((oj) this).field_h = (int)(Math.random() * 161.0 - 80.0);
        ((oj) this).field_i = 1;
        ((oj) this).field_g = -param3;
        ((oj) this).field_s = param2;
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != 384) {
          oj.c(100);
          field_q = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          return;
        }
    }

    oj(int param0, int param1, lb param2, int param3, int param4) {
        ((oj) this).field_k = param1 * ol.field_e << 1397294020;
        ((oj) this).field_f = param0 * ol.field_e << -402839292;
        ((oj) this).field_l = (int)(-80.0 + Math.random() * 161.0);
        ((oj) this).field_h = (int)(-80.0 + Math.random() * 161.0);
        ((oj) this).field_g = -param3;
        ((oj) this).field_s = param2;
        ((oj) this).field_i = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "BIG SHOT";
        field_j = new fk(2);
        field_r = new im();
    }
}
