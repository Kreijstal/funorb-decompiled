/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gsa {
    boolean field_h;
    boolean field_l;
    int field_m;
    private double field_g;
    boolean field_d;
    private double field_e;
    double field_q;
    int field_x;
    int field_f;
    int field_a;
    private fla field_t;
    int field_u;
    int field_r;
    static int field_j;
    static fpa field_y;
    int field_v;
    int field_c;
    boolean field_o;
    boolean field_b;
    int field_z;
    static String field_w;
    int field_n;
    double field_i;
    int field_p;
    boolean field_k;
    static String field_s;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        L0: {
          L1: {
            var9 = TombRacer.field_G ? 1 : 0;
            var4 = -1;
            if (efa.field_y > param1) {
              break L1;
            } else {
              if (param1 < ona.field_H) {
                L2: {
                  if (((gsa) this).field_k) {
                    break L2;
                  } else {
                    if (param1 < efa.field_y - -(50 * param2)) {
                      break L2;
                    } else {
                      L3: {
                        if (((gsa) this).field_v > 0) {
                          var4 = 63;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((gsa) this).field_k = true;
                      ((gsa) this).field_x = ((gsa) this).field_x + ((gsa) this).field_v;
                      break L2;
                    }
                  }
                }
                if (((gsa) this).field_b) {
                  break L0;
                } else {
                  if (25 + (efa.field_y - -(param2 * 50)) <= param1) {
                    L4: {
                      if (((gsa) this).field_u <= 0) {
                        break L4;
                      } else {
                        if (((gsa) this).field_v == 0) {
                          var4 = 63;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((gsa) this).field_b = true;
                    ((gsa) this).field_x = ((gsa) this).field_x + ((gsa) this).field_u;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          L5: {
            if (nta.field_d > param1) {
              break L5;
            } else {
              if (param1 < og.field_m) {
                L6: {
                  if (((gsa) this).field_d) {
                    break L6;
                  } else {
                    if (nta.field_d + param2 * 50 > param1) {
                      break L6;
                    } else {
                      ((gsa) this).field_x = ((gsa) this).field_x + ((gsa) this).field_n;
                      ((gsa) this).field_d = true;
                      if (((gsa) this).field_n <= 0) {
                        break L6;
                      } else {
                        var4 = 64;
                        break L6;
                      }
                    }
                  }
                }
                if (((gsa) this).field_h) {
                  break L0;
                } else {
                  if (param1 >= 25 + (50 * param2 + nta.field_d)) {
                    L7: {
                      ((gsa) this).field_x = ((gsa) this).field_x + ((gsa) this).field_z;
                      if (((gsa) this).field_z <= 0) {
                        break L7;
                      } else {
                        if (((gsa) this).field_n != 0) {
                          break L7;
                        } else {
                          var4 = 64;
                          break L7;
                        }
                      }
                    }
                    ((gsa) this).field_h = true;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          if (iv.field_ub > param1) {
            break L0;
          } else {
            if (ema.field_b > param1) {
              L8: {
                if (((gsa) this).field_l) {
                  break L8;
                } else {
                  if (param1 >= iv.field_ub - -(50 * param2)) {
                    L9: {
                      ((gsa) this).field_l = true;
                      if (((gsa) this).field_a <= 0) {
                        break L9;
                      } else {
                        var4 = 65;
                        break L9;
                      }
                    }
                    ((gsa) this).field_x = ((gsa) this).field_x + ((gsa) this).field_a;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              if (((gsa) this).field_o) {
                break L0;
              } else {
                if (param2 * 50 + iv.field_ub + 25 <= param1) {
                  L10: {
                    ((gsa) this).field_o = true;
                    if (((gsa) this).field_f <= 0) {
                      break L10;
                    } else {
                      if (((gsa) this).field_a != 0) {
                        break L10;
                      } else {
                        var4 = 65;
                        break L10;
                      }
                    }
                  }
                  ((gsa) this).field_x = ((gsa) this).field_x + ((gsa) this).field_f;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L11: {
          if (var4 == -1) {
            break L11;
          } else {
            fla discarded$1 = mr.field_w.a(new fm(var4, 0, 0, 0), -58);
            break L11;
          }
        }
        L12: {
          var5 = -((gsa) this).field_m + ((gsa) this).field_x;
          var6 = 0;
          if (var5 <= 0) {
            break L12;
          } else {
            var6 = 1;
            break L12;
          }
        }
        L13: {
          if (var6 > 0) {
            ((gsa) this).field_m = ((gsa) this).field_m + var6;
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          if (var6 != param0) {
            L15: {
              if (((gsa) this).field_t == null) {
                break L15;
              } else {
                if (!((gsa) this).field_t.l((byte) -98)) {
                  break L15;
                } else {
                  if (var6 != 0) {
                    break L14;
                  } else {
                    if (null == ((gsa) this).field_t) {
                      break L14;
                    } else {
                      ((gsa) this).field_t.a(mr.field_w, (byte) -113);
                      ((gsa) this).field_t = null;
                      break L14;
                    }
                  }
                }
              }
            }
            ((gsa) this).field_t = mr.field_w.a(new fm(param2 + 94, 0, 0, 0), -58);
            if (var6 != 0) {
              break L14;
            } else {
              if (null == ((gsa) this).field_t) {
                break L14;
              } else {
                ((gsa) this).field_t.a(mr.field_w, (byte) -113);
                ((gsa) this).field_t = null;
                break L14;
              }
            }
          } else {
            if (var6 != 0) {
              break L14;
            } else {
              if (null == ((gsa) this).field_t) {
                break L14;
              } else {
                ((gsa) this).field_t.a(mr.field_w, (byte) -113);
                ((gsa) this).field_t = null;
                break L14;
              }
            }
          }
        }
        L16: {
          ((gsa) this).field_q = 73.0;
          if (param1 < ona.field_H) {
            break L16;
          } else {
            L17: {
              var7 = (double)(param1 + -ona.field_H);
              if (var7 > 100.0) {
                var7 = 100.0;
                break L17;
              } else {
                break L17;
              }
            }
            ((gsa) this).field_q = ((gsa) this).field_q + ((gsa) this).field_i * var7;
            break L16;
          }
        }
        L18: {
          if (og.field_m > param1) {
            break L18;
          } else {
            L19: {
              var7 = (double)(param1 - og.field_m);
              if (100.0 < var7) {
                var7 = 100.0;
                break L19;
              } else {
                break L19;
              }
            }
            ((gsa) this).field_q = ((gsa) this).field_q + var7 * ((gsa) this).field_g;
            break L18;
          }
        }
        L20: {
          if (param1 < ema.field_b) {
            break L20;
          } else {
            L21: {
              var7 = (double)(param1 + -ema.field_b);
              if (var7 > 100.0) {
                var7 = 100.0;
                break L21;
              } else {
                break L21;
              }
            }
            ((gsa) this).field_q = ((gsa) this).field_q + var7 * ((gsa) this).field_e;
            break L20;
          }
        }
    }

    public static void a() {
        field_w = null;
        field_s = null;
        field_y = null;
    }

    final void a(double param0, double param1, double param2, boolean param3) {
        ((gsa) this).field_i = param2;
        ((gsa) this).field_e = param1;
        ((gsa) this).field_g = param0;
        if (!param3) {
            ((gsa) this).field_i = -0.9605648251097887;
        }
    }

    gsa(hca param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              ((gsa) this).field_o = false;
              ((gsa) this).field_l = false;
              ((gsa) this).field_h = false;
              ((gsa) this).field_p = param1[0];
              ((gsa) this).field_r = param1[1];
              ((gsa) this).field_q = 73.0;
              ((gsa) this).field_k = false;
              ((gsa) this).field_b = false;
              ((gsa) this).field_x = 0;
              ((gsa) this).field_c = param1[2];
              ((gsa) this).field_d = false;
              ((gsa) this).field_m = 0;
              ((gsa) this).field_n = gp.field_i[1] * ((gsa) this).field_r;
              ((gsa) this).field_a = gp.field_i[2] * ((gsa) this).field_c;
              ((gsa) this).field_v = ((gsa) this).field_p * gp.field_i[0];
              var3_int = param0.z(-96);
              if (var3_int == -1) {
                break L1;
              } else {
                L2: {
                  if (bta.field_n[var3_int] != 0) {
                    break L2;
                  } else {
                    ((gsa) this).field_u = ((gsa) this).field_u + param0.j(false);
                    break L2;
                  }
                }
                L3: {
                  if (1 != bta.field_n[var3_int]) {
                    break L3;
                  } else {
                    ((gsa) this).field_z = ((gsa) this).field_z + param0.j(false);
                    break L3;
                  }
                }
                if (2 != bta.field_n[var3_int]) {
                  break L1;
                } else {
                  ((gsa) this).field_f = ((gsa) this).field_f + param0.j(false);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("gsa.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 83;
        field_y = new fpa();
        field_s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
