/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private int field_e;
    static boolean field_m;
    private boolean field_r;
    private int field_h;
    private int field_d;
    private int field_x;
    private int field_q;
    private int field_i;
    static dd field_g;
    private int field_l;
    static String field_k;
    static int field_u;
    private int field_a;
    static String field_s;
    private int field_b;
    private int field_n;
    static int[] field_t;
    private int field_w;
    private int field_c;
    private int field_j;
    private int field_f;
    private int field_o;
    private le field_p;
    private float field_v;

    final void a(int param0) {
        ((va) this).field_p.a(((va) this).field_b, -1062, ((va) this).field_c);
        if (param0 > -113) {
            field_m = true;
        }
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = ((va) this).field_o;
        var3 = ((va) this).field_l;
        if (((va) this).c((byte) -114)) {
          L0: {
            if (var2 <= ((va) this).field_w) {
              if (var2 >= ((va) this).field_e) {
                break L0;
              } else {
                var2 = ((va) this).field_e;
                break L0;
              }
            } else {
              var2 = ((va) this).field_w;
              break L0;
            }
          }
          L1: {
            if (var3 <= ((va) this).field_q) {
              if (((va) this).field_a > var3) {
                var3 = ((va) this).field_a;
                break L1;
              } else {
                L2: {
                  if (((va) this).field_v > 0.0f) {
                    var4 = (int)((float)var3 * ((va) this).field_v + 0.5f);
                    if (var4 > var2) {
                      var3 = (int)((float)var2 / ((va) this).field_v);
                      break L2;
                    } else {
                      if (var2 > var4) {
                        var2 = var4;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (var2 == ki.field_a) {
                  if (gm.field_nb == var3) {
                    L3: {
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    ((va) this).field_p.a(var3, -1062, var2);
                    L4: {
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  ((va) this).field_p.a(var3, -1062, var2);
                  L5: {
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              }
            } else {
              var3 = ((va) this).field_q;
              break L1;
            }
          }
          if (((va) this).field_v > 0.0f) {
            var4 = (int)((float)var3 * ((va) this).field_v + 0.5f);
            if (var4 > var2) {
              var3 = (int)((float)var2 / ((va) this).field_v);
              if (var2 == ki.field_a) {
                if (gm.field_nb != var3) {
                  L6: {
                    ((va) this).field_p.a(var3, -1062, var2);
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                } else {
                  L7: {
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  ((va) this).field_p.a(var3, -1062, var2);
                  if (((va) this).field_o > 0) {
                    field_u = (-ki.field_a + ((va) this).field_o) / 2;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              }
            } else {
              if (var2 > var4) {
                var2 = var4;
                if (var2 == ki.field_a) {
                  if (gm.field_nb != var3) {
                    L9: {
                      ((va) this).field_p.a(var3, -1062, var2);
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  } else {
                    L10: {
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    ((va) this).field_p.a(var3, -1062, var2);
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              } else {
                if (var2 == ki.field_a) {
                  if (gm.field_nb != var3) {
                    L12: {
                      ((va) this).field_p.a(var3, -1062, var2);
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    return;
                  } else {
                    L13: {
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  }
                } else {
                  L14: {
                    ((va) this).field_p.a(var3, -1062, var2);
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if (var2 == ki.field_a) {
              if (gm.field_nb == var3) {
                L15: {
                  if (((va) this).field_o > 0) {
                    field_u = (-ki.field_a + ((va) this).field_o) / 2;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              } else {
                L16: {
                  ((va) this).field_p.a(var3, -1062, var2);
                  if (((va) this).field_o > 0) {
                    field_u = (-ki.field_a + ((va) this).field_o) / 2;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return;
              }
            } else {
              L17: {
                ((va) this).field_p.a(var3, -1062, var2);
                if (((va) this).field_o > 0) {
                  field_u = (-ki.field_a + ((va) this).field_o) / 2;
                  break L17;
                } else {
                  break L17;
                }
              }
              return;
            }
          }
        } else {
          ((va) this).field_r = false;
          return;
        }
    }

    final vb b(int param0) {
        vb var2 = null;
        ((va) this).field_c = ki.field_a;
        ((va) this).field_b = gm.field_nb;
        ((va) this).field_p.a(((va) this).field_h, param0 + 6874, ((va) this).field_f);
        if (param0 == -7936) {
          h.field_h = false;
          var2 = wf.a(0, ((va) this).field_f, 0, fg.field_q, 0, ((va) this).field_h);
          if (var2 == null) {
            ((va) this).a(-121);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((va) this).field_n = -70;
          h.field_h = false;
          var2 = wf.a(0, ((va) this).field_f, 0, fg.field_q, 0, ((va) this).field_h);
          if (var2 != null) {
            return var2;
          } else {
            ((va) this).a(-121);
            return var2;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        if (null != rh.field_p) {
          return;
        } else {
          L0: {
            if (wc.field_q <= 0) {
              ((va) this).field_r = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((va) this).field_r) {
            int fieldTemp$2 = ((va) this).field_n - 1;
            ((va) this).field_n = ((va) this).field_n - 1;
            if (fieldTemp$2 > 0) {
              return;
            } else {
              ((va) this).field_n = ((va) this).field_d;
              if (~((va) this).field_j >= ~kf.field_k) {
                int discarded$3 = -61;
                this.d();
                var2 = -56 / ((param0 - 24) / 47);
                return;
              } else {
                ((va) this).field_r = false;
                return;
              }
            }
          } else {
            if (ki.field_a < ((va) this).field_o) {
              field_u = (-ki.field_a + ((va) this).field_o) / 2;
              if (ki.field_a != ((va) this).field_x) {
                ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                return;
              } else {
                if (~((va) this).field_i != ~gm.field_nb) {
                  ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (((va) this).field_o <= 0) {
                if (ki.field_a != ((va) this).field_x) {
                  ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                  return;
                } else {
                  if (~((va) this).field_i == ~gm.field_nb) {
                    return;
                  } else {
                    ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                    return;
                  }
                }
              } else {
                field_u = 0;
                if (ki.field_a != ((va) this).field_x) {
                  ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                  return;
                } else {
                  if (~((va) this).field_i != ~gm.field_nb) {
                    ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static bh a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        bh var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        bh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var10 = 0;
            var9 = new bh(40, 65495, param4, param2, param0, param8, param7);
            wi.field_j.a(false, (lh) (Object) var9);
            s.a(-4471, 3, var9);
            stackOut_0_0 = (bh) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("va.D(").append(param0).append(44).append(40).append(44).append(param2).append(44).append(65495).append(44).append(param4).append(44).append(-102).append(44).append(3).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param7 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param8 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2) {
        ((va) this).field_o = param0;
        if (param1 != 0) {
            ((va) this).field_d = -117;
            ((va) this).field_l = param2;
            return;
        }
        ((va) this).field_l = param2;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -30 / ((-74 - param0) / 38);
        if (kf.field_k >= ((va) this).field_j) {
          if (wc.field_q <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void b() {
        field_t = null;
        field_k = null;
        field_g = null;
        field_s = null;
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Type your age in years";
        field_s = "Rescued: <%0>/<%1>";
        field_t = new int[40];
        field_u = 0;
    }
}
