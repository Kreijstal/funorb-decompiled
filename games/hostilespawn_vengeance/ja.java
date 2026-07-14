/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int field_d;
    private int field_a;
    private int field_g;
    private gj[] field_j;
    static byte[][] field_e;
    private int field_i;
    String field_b;
    static int field_c;
    static int[] field_h;
    float field_f;

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 == 26) {
            return;
        }
        Object var2 = null;
        ja.a((byte) -91, (ji) null, false);
    }

    final static void a(byte param0, ji param1, boolean param2) {
        int var3 = 0;
        if (ha.field_w.field_p == param1) {
          L0: {
            ha.field_w.field_p = null;
            if (ha.field_w.field_u == param1) {
              ha.field_w.field_u = null;
              break L0;
            } else {
              break L0;
            }
          }
          db.a(true, 256, param1);
          var3 = -47 % ((param0 - -45) / 56);
          return;
        } else {
          L1: {
            if (ha.field_w.field_u == param1) {
              ha.field_w.field_u = null;
              break L1;
            } else {
              break L1;
            }
          }
          db.a(true, 256, param1);
          var3 = -47 % ((param0 - -45) / 56);
          return;
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        gj var5 = null;
        gj var6 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > -32) {
          ((ja) this).field_i = -29;
          L0: while (true) {
            if (((ja) this).field_a > ((ja) this).field_i) {
              var6 = ((ja) this).field_j[((ja) this).field_i];
              if (!var6.field_a.a(-15879)) {
                this.a(0, 20467, var6);
                return false;
              } else {
                L1: {
                  if ((var6.field_f ^ -1) > -1) {
                    break L1;
                  } else {
                    if (var6.field_a.a(var6.field_f, (byte) 8)) {
                      break L1;
                    } else {
                      this.a(var6.field_a.b(-8102, var6.field_f), 20467, var6);
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_c) {
                    break L2;
                  } else {
                    if (!var6.field_a.a(-8088, var6.field_c)) {
                      this.a(var6.field_a.b(-113, var6.field_c), 20467, var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((var6.field_f ^ -1) <= -1) {
                    break L3;
                  } else {
                    if (null != var6.field_c) {
                      break L3;
                    } else {
                      if (var6.field_g == null) {
                        break L3;
                      } else {
                        if (var6.field_a.e(0)) {
                          break L3;
                        } else {
                          this.a(var6.field_a.c(0), 20467, var6);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((ja) this).field_i = ((ja) this).field_i + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((ja) this).field_a > ((ja) this).field_i) {
              var5 = ((ja) this).field_j[((ja) this).field_i];
              if (!var5.field_a.a(-15879)) {
                this.a(0, 20467, var5);
                return false;
              } else {
                L5: {
                  if ((var5.field_f ^ -1) > -1) {
                    break L5;
                  } else {
                    if (var5.field_a.a(var5.field_f, (byte) 8)) {
                      break L5;
                    } else {
                      this.a(var5.field_a.b(-8102, var5.field_f), 20467, var5);
                      return false;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_c) {
                    break L6;
                  } else {
                    if (!var5.field_a.a(-8088, var5.field_c)) {
                      this.a(var5.field_a.b(-113, var5.field_c), 20467, var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if ((var5.field_f ^ -1) <= -1) {
                    break L7;
                  } else {
                    if (null != var5.field_c) {
                      break L7;
                    } else {
                      if (var5.field_g == null) {
                        break L7;
                      } else {
                        if (var5.field_a.e(0)) {
                          break L7;
                        } else {
                          this.a(var5.field_a.c(0), 20467, var5);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((ja) this).field_i = ((ja) this).field_i + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        if (!nf.a(param0, param2 ^ -29205)) {
          if (pb.a(param2 ^ 17032, param0)) {
            return false;
          } else {
            if (!vg.a(true, param0)) {
              if (param1.length() == 0) {
                return true;
              } else {
                if (kc.a(param0, true, param1)) {
                  return false;
                } else {
                  if (param2 == 0) {
                    if (!vh.a(param1, param2 ^ 29360, param0)) {
                      if (eg.a(false, param1, param0)) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    field_d = -123;
                    if (!vh.a(param1, param2 ^ 29360, param0)) {
                      if (eg.a(false, param1, param0)) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, gj param2) {
        float var4 = 0.0f;
        if (param1 == 20467) {
          var4 = (float)(((ja) this).field_i + 1) + (float)param0 / 100.0f;
          if (-1 == (param0 ^ -1)) {
            ((ja) this).field_b = param2.field_e;
            ((ja) this).field_f = (float)((ja) this).field_g * var4 / (float)(1 + ((ja) this).field_a);
            return;
          } else {
            ((ja) this).field_b = param2.field_g + " - " + param0 + "%";
            ((ja) this).field_f = (float)((ja) this).field_g * var4 / (float)(1 + ((ja) this).field_a);
            return;
          }
        } else {
          ((ja) this).field_j = null;
          var4 = (float)(((ja) this).field_i + 1) + (float)param0 / 100.0f;
          if (-1 == (param0 ^ -1)) {
            ((ja) this).field_b = param2.field_e;
            ((ja) this).field_f = (float)((ja) this).field_g * var4 / (float)(1 + ((ja) this).field_a);
            return;
          } else {
            ((ja) this).field_b = param2.field_g + " - " + param0 + "%";
            ((ja) this).field_f = (float)((ja) this).field_g * var4 / (float)(1 + ((ja) this).field_a);
            return;
          }
        }
    }

    final static void a(oj param0, byte param1, oc param2) {
        if (-2 <= (param0.field_F ^ -1)) {
          L0: {
            if (param0.field_F <= 0) {
              break L0;
            } else {
              if (param0.field_F >= 220) {
                break L0;
              } else {
                if (param0.field_I <= 0) {
                  break L0;
                } else {
                  param0.field_e = param0.field_e + 1;
                  if (1000 < param0.field_e) {
                    param0.field_I = param0.field_I - 1;
                    param0.field_e = 0;
                    mm.field_m[el.field_j] = new oj(param2, 1, rl.field_c);
                    mm.field_m[el.field_j].field_F = 1;
                    el.field_j = el.field_j + 1;
                    break L0;
                  } else {
                    if (param1 == 113) {
                      return;
                    } else {
                      field_c = -3;
                      return;
                    }
                  }
                }
              }
            }
          }
          if (param1 == 113) {
            return;
          } else {
            field_c = -3;
            return;
          }
        } else {
          param0.field_F = param0.field_F - 1;
          if (param0.field_F > 0) {
            if (param0.field_F < 220) {
              L1: {
                if (param0.field_I <= 0) {
                  break L1;
                } else {
                  param0.field_e = param0.field_e + 1;
                  if (1000 < param0.field_e) {
                    param0.field_I = param0.field_I - 1;
                    param0.field_e = 0;
                    mm.field_m[el.field_j] = new oj(param2, 1, rl.field_c);
                    mm.field_m[el.field_j].field_F = 1;
                    el.field_j = el.field_j + 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 == 113) {
                return;
              } else {
                field_c = -3;
                return;
              }
            } else {
              if (param1 == 113) {
                return;
              } else {
                field_c = -3;
                return;
              }
            }
          } else {
            if (param1 == 113) {
              return;
            } else {
              field_c = -3;
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(-1 == (param0 & param1 ^ -1))) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    private ja() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_h = new int[]{32, 26};
    }
}
