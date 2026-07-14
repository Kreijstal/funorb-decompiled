/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o {
    kc field_d;
    static ej field_c;
    double field_e;
    int field_f;
    double field_b;
    static vd[] field_a;

    final void a(int param0) {
        if (param0 != 2) {
          o.a(-85, -82, 96, -41, -118, -52);
          ((o) this).b(((o) this).field_b, 128);
          return;
        } else {
          ((o) this).b(((o) this).field_b, 128);
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            o.a(-30, 98, 16, -74, 112, -14);
        }
    }

    final void a(double param0, int param1) {
        ((o) this).a(param0, (byte) 49, param0);
        if (param1 >= -77) {
            field_a = (vd[]) null;
        }
    }

    final void a(double param0, byte param1, double param2) {
        if (((o) this).field_d.field_a >= -param0) {
          ((o) this).field_d.field_b = -((o) this).field_d.field_b;
          if (((o) this).field_d.field_a <= param0) {
            ((o) this).field_d.field_b = -((o) this).field_d.field_b;
            ((o) this).field_d.field_a = -((o) this).field_d.field_a;
            if (-param2 <= ((o) this).field_d.field_b) {
              if (param1 != 49) {
                L0: {
                  ((o) this).field_b = 1.33615424320731;
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                L1: {
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              ((o) this).field_d.field_b = ((o) this).field_d.field_b + 2.0 * param2;
              if (param1 != 49) {
                L2: {
                  ((o) this).field_b = 1.33615424320731;
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          } else {
            ((o) this).field_d.field_a = ((o) this).field_d.field_a - 2.0 * param0;
            ((o) this).field_d.field_b = -((o) this).field_d.field_b;
            ((o) this).field_d.field_a = -((o) this).field_d.field_a;
            if (-param2 <= ((o) this).field_d.field_b) {
              if (param1 != 49) {
                L4: {
                  ((o) this).field_b = 1.33615424320731;
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              ((o) this).field_d.field_b = ((o) this).field_d.field_b + 2.0 * param2;
              if (param1 == 49) {
                L6: {
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                L7: {
                  ((o) this).field_b = 1.33615424320731;
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            }
          }
        } else {
          ((o) this).field_d.field_a = ((o) this).field_d.field_a + param0 * 2.0;
          ((o) this).field_d.field_b = -((o) this).field_d.field_b;
          if (((o) this).field_d.field_a > param0) {
            ((o) this).field_d.field_a = ((o) this).field_d.field_a - 2.0 * param0;
            ((o) this).field_d.field_b = -((o) this).field_d.field_b;
            ((o) this).field_d.field_a = -((o) this).field_d.field_a;
            if (-param2 > ((o) this).field_d.field_b) {
              ((o) this).field_d.field_b = ((o) this).field_d.field_b + 2.0 * param2;
              if (param1 != 49) {
                L8: {
                  ((o) this).field_b = 1.33615424320731;
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              } else {
                L9: {
                  ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                  if (param2 < ((o) this).field_d.field_b) {
                    ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            } else {
              L10: {
                if (param1 == 49) {
                  break L10;
                } else {
                  ((o) this).field_b = 1.33615424320731;
                  break L10;
                }
              }
              L11: {
                ((o) this).field_d.field_a = -((o) this).field_d.field_a;
                if (param2 < ((o) this).field_d.field_b) {
                  ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            L12: {
              ((o) this).field_d.field_b = -((o) this).field_d.field_b;
              ((o) this).field_d.field_a = -((o) this).field_d.field_a;
              if (-param2 <= ((o) this).field_d.field_b) {
                break L12;
              } else {
                ((o) this).field_d.field_b = ((o) this).field_d.field_b + 2.0 * param2;
                break L12;
              }
            }
            L13: {
              if (param1 == 49) {
                break L13;
              } else {
                ((o) this).field_b = 1.33615424320731;
                break L13;
              }
            }
            L14: {
              ((o) this).field_d.field_a = -((o) this).field_d.field_a;
              if (param2 < ((o) this).field_d.field_b) {
                ((o) this).field_d.field_b = ((o) this).field_d.field_b - param2 * 2.0;
                break L14;
              } else {
                break L14;
              }
            }
            return;
          }
        }
    }

    final void a(double param0, byte param1) {
        if (param1 == 25) {
          ((o) this).field_e = ((o) this).field_e + param0;
          if (((o) this).field_e < 0.0) {
            L0: {
              ((o) this).field_e = ((o) this).field_e + 256.0;
              if (((o) this).field_e > 256.0) {
                ((o) this).field_e = ((o) this).field_e - 256.0;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (((o) this).field_e > 256.0) {
                ((o) this).field_e = ((o) this).field_e - 256.0;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          field_c = (ej) null;
          ((o) this).field_e = ((o) this).field_e + param0;
          if (((o) this).field_e >= 0.0) {
            L2: {
              if (((o) this).field_e > 256.0) {
                ((o) this).field_e = ((o) this).field_e - 256.0;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ((o) this).field_e = ((o) this).field_e + 256.0;
              if (((o) this).field_e > 256.0) {
                ((o) this).field_e = ((o) this).field_e - 256.0;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final void b(double param0, int param1) {
        double var4 = 0.0;
        var4 = 3.141592653589793 * ((double)((o) this).field_f + ((o) this).field_e) / (double)param1;
        ((o) this).field_d.field_a = ((o) this).field_d.field_a - Math.sin(var4) * param0;
        ((o) this).field_d.field_b = ((o) this).field_d.field_b - Math.cos(var4) * param0;
        if (((o) this).field_f >= 0) {
          if (-1 < ((o) this).field_f) {
            ((o) this).field_f = ((o) this).field_f - 1;
            return;
          } else {
            return;
          }
        } else {
          ((o) this).field_f = ((o) this).field_f + 1;
          if (-1 <= ((o) this).field_f) {
            return;
          } else {
            ((o) this).field_f = ((o) this).field_f - 1;
            return;
          }
        }
    }

    final void a(byte param0, double param1) {
        double var4 = 0.0;
        if (param0 <= 104) {
          return;
        } else {
          var4 = 3.141592653589793 * ((o) this).field_e / 128.0;
          ((o) this).field_d.field_a = ((o) this).field_d.field_a - Math.cos(var4) * param1;
          ((o) this).field_d.field_b = ((o) this).field_d.field_b + Math.sin(var4) * param1;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          vs.field_b[os.field_w] = param1;
          uf.field_d[os.field_w] = os.field_w;
          js.field_c[os.field_w] = param5;
          if (ft.field_o < param5) {
            fj.field_d = param5;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 > 14) {
          L1: {
            if (op.field_a > param5) {
              nh.field_a = param5;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            hg.field_C[os.field_w] = param4;
            qd.field_p[os.field_w] = param0;
            dd.field_c[os.field_w] = param3;
            var6 = param0 + param4 - -param3;
            if (0 == var6) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L2;
            } else {
              stackOut_23_0 = param4 * 1000 / var6;
              stackIn_25_0 = stackOut_23_0;
              break L2;
            }
          }
          var7 = stackIn_25_0;
          ai.field_a[os.field_w] = var7;
          if (nh.field_a <= var7) {
            os.field_w = os.field_w + 1;
            if (fj.field_d < var7) {
              fj.field_d = var7;
              return;
            } else {
              return;
            }
          } else {
            nh.field_a = var7;
            os.field_w = os.field_w + 1;
            if (fj.field_d < var7) {
              fj.field_d = var7;
              return;
            } else {
              return;
            }
          }
        } else {
          L3: {
            field_a = (vd[]) null;
            if (op.field_a > param5) {
              nh.field_a = param5;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            hg.field_C[os.field_w] = param4;
            qd.field_p[os.field_w] = param0;
            dd.field_c[os.field_w] = param3;
            var6 = param0 + param4 - -param3;
            if (0 == var6) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = param4 * 1000 / var6;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          var7 = stackIn_10_0;
          ai.field_a[os.field_w] = var7;
          if (nh.field_a <= var7) {
            os.field_w = os.field_w + 1;
            if (fj.field_d < var7) {
              fj.field_d = var7;
              return;
            } else {
              return;
            }
          } else {
            nh.field_a = var7;
            os.field_w = os.field_w + 1;
            if (fj.field_d >= var7) {
              return;
            } else {
              fj.field_d = var7;
              return;
            }
          }
        }
    }

    o(kc param0) {
        ((o) this).field_f = 0;
        ((o) this).field_e = 0.0;
        ((o) this).field_b = 0.0;
        ((o) this).field_d = new kc(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ej(1, 2, 2, 0);
    }
}
