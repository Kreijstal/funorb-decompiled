/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends ak {
    static int field_l;
    static long field_j;
    private int field_k;
    static int[] field_i;

    public static void b(byte param0) {
        field_i = null;
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ha var6_ref_ha = null;
        int var6 = 0;
        int var7 = 0;
        hr[] var8 = null;
        int var9 = 0;
        hr[] stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        hr[] stackOut_5_0 = null;
        hr[] stackOut_4_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            wo.a(up.field_c, 490, -20 + -(ns.field_b.c() / 2) + 290, param0 << 24, 3, param1, ns.field_b.c() - -100, -5, 1, true);
            be.field_t.a(bw.field_c, 5023231 | param0 << 24, -1, 60, 320, 0);
            hc.field_e.a(bw.field_c, -1, -1, 60, 320, 0);
            int discarded$2 = gt.field_db.a(200, 5023231 | param0 << 24, 0, 300, 170, (int[]) null, (hr[]) null, 75, -1, 0, 0, param2 + -6432, wh.field_r, (aa) null, 1, 0);
            int discarded$3 = bq.field_c.a(200, -1, 0, 300, 170, (int[]) null, (hr[]) null, 75, -1, 0, 0, param2 ^ 11104, wh.field_r, (aa) null, 1, 0);
            qv.field_k.a(ic.a(ar.field_M, new String[1], (byte) -128).toUpperCase(), 5023231 | param0 << 24, -1, 180, 320, 0);
            uq.field_a.a(ic.a(ar.field_M, new String[1], (byte) -128).toUpperCase(), -1, -1, 180, 320, 0);
            var4_int = 140;
            var5 = 0;
            L1: while (true) {
              if (392 < var4_int) {
                super.a(param0, param1, param2);
                break L0;
              } else {
                L2: {
                  var6_ref_ha = param1;
                  var7 = -10 + var4_int;
                  if (var5 == ((bb) this).field_k) {
                    stackOut_5_0 = jn.field_c;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = vv.field_a;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  wo.a(var8, 170, var7, 0, 1, var6_ref_ha, 131, 185, 1, true);
                  if (c.field_u[var5] == 1) {
                    if (oc.d(17079) + -ok.field_k == 0) {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_12_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_12_0;
                  qv.field_k.a(ee.field_a[var5].toUpperCase(), param0 << 24 | 5023231, -1, 225, var4_int + 51, 0);
                  uq.field_a.a(ee.field_a[var5].toUpperCase(), -1, -1, 225, 55 + (var4_int + -4), param2 ^ -2355);
                  if (var6 == 0) {
                    ud.field_q[var5].a(55 + var4_int + -(ud.field_q[var5].b() >> 1), 200 - -(ud.field_q[var5].d() >> 1), 1, 0, 2);
                    break L4;
                  } else {
                    ud.field_q[15 + var5].a(55 + var4_int + -(ud.field_q[var5].b() >> 1), (ud.field_q[var5].d() >> 1) + 200, 1, 0, 2);
                    break L4;
                  }
                }
                qv.field_k.a(Integer.toString(c.field_u[var5]), 5023231 | param0 << 24, -16777216, 320, 55 + var4_int, 0);
                uq.field_a.a(Integer.toString(c.field_u[var5]), -1, -16777216, 320, 55 + var4_int, param2 ^ -2355);
                var5++;
                var4_int += 126;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("bb.B(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 41);
        }
    }

    public bb() {
        super(9);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        super.b(param0);
        var2 = (ko.field_p + -140) / 126;
        if (ko.field_p >= 140) {
          L0: {
            if (520 >= ko.field_p) {
              break L0;
            } else {
              var2 = -1;
              break L0;
            }
          }
          var3 = (-200 + pi.field_e) / 150;
          if (pi.field_e >= 200) {
            L1: {
              if (pi.field_e > 350) {
                var3 = -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((bb) this).field_k = var3 * 3 - -var2;
              if ((-140 + ko.field_p) % 126 > 111) {
                ((bb) this).field_k = -1;
                break L2;
              } else {
                break L2;
              }
            }
            if (((bb) this).field_k < 3) {
              L3: {
                if (((bb) this).field_k < -1) {
                  ((bb) this).field_k = -1;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((bb) this).field_k > -1) {
                L4: {
                  if (1 != hk.field_c) {
                    if (2 != hk.field_c) {
                      break L4;
                    } else {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                      ok.field_k = ok.field_k - 1;
                      if (c.field_u[((bb) this).field_k] < 1) {
                        c.field_u[((bb) this).field_k] = 1;
                        ok.field_k = ok.field_k + 1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                      ok.field_k = ok.field_k + 1;
                      if (c.field_u[((bb) this).field_k] > 10) {
                        c.field_u[((bb) this).field_k] = 10;
                        ok.field_k = ok.field_k - 1;
                        break L4;
                      } else {
                        return;
                      }
                    } else {
                      if (2 != hk.field_c) {
                        return;
                      } else {
                        c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                        ok.field_k = ok.field_k - 1;
                        if (c.field_u[((bb) this).field_k] < 1) {
                          c.field_u[((bb) this).field_k] = 1;
                          ok.field_k = ok.field_k + 1;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              L5: {
                ((bb) this).field_k = -1;
                if (((bb) this).field_k < -1) {
                  ((bb) this).field_k = -1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (((bb) this).field_k > -1) {
                  if (1 != hk.field_c) {
                    if (2 == hk.field_c) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                      ok.field_k = ok.field_k - 1;
                      if (c.field_u[((bb) this).field_k] < 1) {
                        c.field_u[((bb) this).field_k] = 1;
                        ok.field_k = ok.field_k + 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                      ok.field_k = ok.field_k + 1;
                      if (c.field_u[((bb) this).field_k] > 10) {
                        c.field_u[((bb) this).field_k] = 10;
                        ok.field_k = ok.field_k - 1;
                        break L6;
                      } else {
                        return;
                      }
                    } else {
                      L7: {
                        if (2 != hk.field_c) {
                          break L7;
                        } else {
                          c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                          ok.field_k = ok.field_k - 1;
                          if (c.field_u[((bb) this).field_k] < 1) {
                            c.field_u[((bb) this).field_k] = 1;
                            ok.field_k = ok.field_k + 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            L8: {
              var3 = -1;
              ((bb) this).field_k = var3 * 3 - -var2;
              if ((-140 + ko.field_p) % 126 > 111) {
                ((bb) this).field_k = -1;
                break L8;
              } else {
                break L8;
              }
            }
            if (((bb) this).field_k < 3) {
              L9: {
                if (((bb) this).field_k < -1) {
                  ((bb) this).field_k = -1;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (((bb) this).field_k > -1) {
                L10: {
                  if (1 != hk.field_c) {
                    if (2 != hk.field_c) {
                      break L10;
                    } else {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                      ok.field_k = ok.field_k - 1;
                      if (c.field_u[((bb) this).field_k] < 1) {
                        c.field_u[((bb) this).field_k] = 1;
                        ok.field_k = ok.field_k + 1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                      ok.field_k = ok.field_k + 1;
                      if (c.field_u[((bb) this).field_k] > 10) {
                        c.field_u[((bb) this).field_k] = 10;
                        ok.field_k = ok.field_k - 1;
                        break L10;
                      } else {
                        return;
                      }
                    } else {
                      L11: {
                        if (2 != hk.field_c) {
                          break L11;
                        } else {
                          c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                          ok.field_k = ok.field_k - 1;
                          if (c.field_u[((bb) this).field_k] < 1) {
                            c.field_u[((bb) this).field_k] = 1;
                            ok.field_k = ok.field_k + 1;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              L12: {
                ((bb) this).field_k = -1;
                if (((bb) this).field_k < -1) {
                  ((bb) this).field_k = -1;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (((bb) this).field_k > -1) {
                  L14: {
                    if (1 != hk.field_c) {
                      break L14;
                    } else {
                      if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                        c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                        ok.field_k = ok.field_k + 1;
                        if (c.field_u[((bb) this).field_k] > 10) {
                          c.field_u[((bb) this).field_k] = 10;
                          ok.field_k = ok.field_k - 1;
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (2 != hk.field_c) {
                    break L13;
                  } else {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                    ok.field_k = ok.field_k - 1;
                    if (c.field_u[((bb) this).field_k] < 1) {
                      c.field_u[((bb) this).field_k] = 1;
                      ok.field_k = ok.field_k + 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                } else {
                  break L13;
                }
              }
              return;
            }
          }
        } else {
          L15: {
            L16: {
              var2 = -1;
              var3 = (-200 + pi.field_e) / 150;
              if (pi.field_e < 200) {
                break L16;
              } else {
                if (pi.field_e > 350) {
                  break L16;
                } else {
                  break L15;
                }
              }
            }
            var3 = -1;
            break L15;
          }
          L17: {
            ((bb) this).field_k = var3 * 3 - -var2;
            if ((-140 + ko.field_p) % 126 > 111) {
              ((bb) this).field_k = -1;
              break L17;
            } else {
              break L17;
            }
          }
          if (((bb) this).field_k < 3) {
            L18: {
              if (((bb) this).field_k < -1) {
                ((bb) this).field_k = -1;
                break L18;
              } else {
                break L18;
              }
            }
            if (((bb) this).field_k > -1) {
              L19: {
                if (1 != hk.field_c) {
                  if (2 != hk.field_c) {
                    break L19;
                  } else {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                    ok.field_k = ok.field_k - 1;
                    if (c.field_u[((bb) this).field_k] < 1) {
                      c.field_u[((bb) this).field_k] = 1;
                      ok.field_k = ok.field_k + 1;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                    ok.field_k = ok.field_k + 1;
                    if (c.field_u[((bb) this).field_k] > 10) {
                      c.field_u[((bb) this).field_k] = 10;
                      ok.field_k = ok.field_k - 1;
                      break L19;
                    } else {
                      return;
                    }
                  } else {
                    L20: {
                      if (2 != hk.field_c) {
                        break L20;
                      } else {
                        c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                        ok.field_k = ok.field_k - 1;
                        if (c.field_u[((bb) this).field_k] < 1) {
                          c.field_u[((bb) this).field_k] = 1;
                          ok.field_k = ok.field_k + 1;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L21: {
              ((bb) this).field_k = -1;
              if (((bb) this).field_k < -1) {
                ((bb) this).field_k = -1;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (((bb) this).field_k > -1) {
                L23: {
                  if (1 != hk.field_c) {
                    break L23;
                  } else {
                    if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                      ok.field_k = ok.field_k + 1;
                      if (c.field_u[((bb) this).field_k] > 10) {
                        c.field_u[((bb) this).field_k] = 10;
                        ok.field_k = ok.field_k - 1;
                        break L22;
                      } else {
                        break L22;
                      }
                    } else {
                      break L23;
                    }
                  }
                }
                if (2 != hk.field_c) {
                  break L22;
                } else {
                  c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                  ok.field_k = ok.field_k - 1;
                  if (c.field_u[((bb) this).field_k] < 1) {
                    c.field_u[((bb) this).field_k] = 1;
                    ok.field_k = ok.field_k + 1;
                    break L22;
                  } else {
                    break L22;
                  }
                }
              } else {
                break L22;
              }
            }
            return;
          }
        }
    }

    static {
    }
}
