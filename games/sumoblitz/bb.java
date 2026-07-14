/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends ak {
    static int field_l;
    static long field_j;
    private int field_k;
    static int[] field_i;

    public static void b(byte param0) {
        if (param0 < 31) {
            return;
        }
        field_i = null;
    }

    final void a(int param0, ha param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ha var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        hr[] var8 = null;
        int var9 = 0;
        hr[] stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        hr[] stackOut_4_0 = null;
        hr[] stackOut_3_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        wo.a(up.field_c, 490, -20 + -(ns.field_b.c() / 2) + 290, param0 << -1199937224, 3, param1, ns.field_b.c() - -100, -5, 1, true);
        be.field_t.a(bw.field_c, 5023231 | param0 << 1619421240, -1, 60, 320, 0);
        hc.field_e.a(bw.field_c, -1, -1, 60, 320, 0);
        int discarded$2 = gt.field_db.a(200, 5023231 | param0 << -2053208040, 0, 300, 170, (int[]) null, (hr[]) null, 75, -1, 0, 0, param2 + -6432, wh.field_r, (aa) null, 1, 0);
        int discarded$3 = bq.field_c.a(200, -1, 0, 300, 170, (int[]) null, (hr[]) null, 75, -1, 0, 0, param2 ^ 11104, wh.field_r, (aa) null, 1, 0);
        qv.field_k.a(ic.a(ar.field_M, new String[1], (byte) -128).toUpperCase(), 5023231 | param0 << 463141656, -1, 180, 320, 0);
        uq.field_a.a(ic.a(ar.field_M, new String[1], (byte) -128).toUpperCase(), -1, -1, 180, 320, 0);
        var4 = 140;
        var5 = 0;
        L0: while (true) {
          if (392 < var4) {
            super.a(param0, param1, param2);
            return;
          } else {
            L1: {
              var6_ref = param1;
              var7 = -10 + var4;
              if (var5 == ((bb) this).field_k) {
                stackOut_4_0 = jn.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = vv.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var8 = stackIn_5_0;
              wo.a(var8, 170, var7, 0, 1, var6_ref, 131, 185, 1, true);
              if (-2 == (c.field_u[var5] ^ -1)) {
                if (oc.d(17079) + -ok.field_k == 0) {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_11_0 = stackOut_6_0;
                break L2;
              }
            }
            L3: {
              var6 = stackIn_11_0;
              qv.field_k.a(ee.field_a[var5].toUpperCase(), param0 << 1064319704 | 5023231, -1, 225, var4 + 51, 0);
              uq.field_a.a(ee.field_a[var5].toUpperCase(), -1, -1, 225, 55 + (var4 + -4), param2 ^ -2355);
              if (var6 == 0) {
                ud.field_q[var5].a(55 + var4 + -(ud.field_q[var5].b() >> -1363234911), 200 - -(ud.field_q[var5].d() >> -209481311), 1, 0, 2);
                break L3;
              } else {
                ud.field_q[15 + var5].a(55 + var4 + -(ud.field_q[var5].b() >> -1933138111), (ud.field_q[var5].d() >> 243320577) + 200, 1, 0, 2);
                break L3;
              }
            }
            qv.field_k.a(Integer.toString(c.field_u[var5]), 5023231 | param0 << 812912344, -16777216, 320, 55 + var4, 0);
            uq.field_a.a(Integer.toString(c.field_u[var5]), -1, -16777216, 320, 55 + var4, param2 ^ -2355);
            var5++;
            var4 += 126;
            continue L0;
          }
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
          if (-201 >= pi.field_e) {
            L1: {
              if ((pi.field_e ^ -1) < -351) {
                var3 = -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((bb) this).field_k = var3 * 3 - -var2;
              if (-112 > (-140 + ko.field_p) % 126) {
                ((bb) this).field_k = -1;
                break L2;
              } else {
                break L2;
              }
            }
            if (-4 > ((bb) this).field_k) {
              L3: {
                if (0 > ((bb) this).field_k) {
                  ((bb) this).field_k = -1;
                  break L3;
                } else {
                  break L3;
                }
              }
              if ((((bb) this).field_k ^ -1) < 0) {
                if (1 != hk.field_c) {
                  if (2 == hk.field_c) {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                    ok.field_k = ok.field_k - 1;
                    if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
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
                    if ((c.field_u[((bb) this).field_k] ^ -1) < -11) {
                      c.field_u[((bb) this).field_k] = 10;
                      ok.field_k = ok.field_k - 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (2 == hk.field_c) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                      ok.field_k = ok.field_k - 1;
                      if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
                        c.field_u[((bb) this).field_k] = 1;
                        ok.field_k = ok.field_k + 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              L4: {
                ((bb) this).field_k = -1;
                if (0 < (((bb) this).field_k ^ -1)) {
                  ((bb) this).field_k = -1;
                  break L4;
                } else {
                  break L4;
                }
              }
              if ((((bb) this).field_k ^ -1) < 0) {
                if (1 != hk.field_c) {
                  if (2 == hk.field_c) {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                    ok.field_k = ok.field_k - 1;
                    if (-2 >= (c.field_u[((bb) this).field_k] ^ -1)) {
                      return;
                    } else {
                      c.field_u[((bb) this).field_k] = 1;
                      ok.field_k = ok.field_k + 1;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                    ok.field_k = ok.field_k + 1;
                    if (c.field_u[((bb) this).field_k] >= -11) {
                      return;
                    } else {
                      c.field_u[((bb) this).field_k] = 10;
                      ok.field_k = ok.field_k - 1;
                      return;
                    }
                  } else {
                    L5: {
                      if (2 != hk.field_c) {
                        break L5;
                      } else {
                        c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                        ok.field_k = ok.field_k - 1;
                        if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
                          c.field_u[((bb) this).field_k] = 1;
                          ok.field_k = ok.field_k + 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L6: {
              var3 = -1;
              ((bb) this).field_k = var3 * 3 - -var2;
              if (-112 < (-140 + ko.field_p) % 126) {
                ((bb) this).field_k = -1;
                break L6;
              } else {
                break L6;
              }
            }
            if (-4 < ((bb) this).field_k) {
              L7: {
                if (0 > ((bb) this).field_k) {
                  ((bb) this).field_k = -1;
                  break L7;
                } else {
                  break L7;
                }
              }
              if ((((bb) this).field_k ^ -1) < 0) {
                if (1 != hk.field_c) {
                  if (2 == hk.field_c) {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                    ok.field_k = ok.field_k - 1;
                    if (-2 >= (c.field_u[((bb) this).field_k] ^ -1)) {
                      return;
                    } else {
                      c.field_u[((bb) this).field_k] = 1;
                      ok.field_k = ok.field_k + 1;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                    ok.field_k = ok.field_k + 1;
                    if ((c.field_u[((bb) this).field_k] ^ -1) >= -11) {
                      return;
                    } else {
                      c.field_u[((bb) this).field_k] = 10;
                      ok.field_k = ok.field_k - 1;
                      return;
                    }
                  } else {
                    L8: {
                      if (2 != hk.field_c) {
                        break L8;
                      } else {
                        c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                        ok.field_k = ok.field_k - 1;
                        if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
                          c.field_u[((bb) this).field_k] = 1;
                          ok.field_k = ok.field_k + 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L9: {
                ((bb) this).field_k = -1;
                if (0 > ((bb) this).field_k) {
                  ((bb) this).field_k = -1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if ((((bb) this).field_k ^ -1) < 0) {
                  L11: {
                    if (1 != hk.field_c) {
                      break L11;
                    } else {
                      if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                        c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                        ok.field_k = ok.field_k + 1;
                        if (c.field_u[((bb) this).field_k] < -11) {
                          c.field_u[((bb) this).field_k] = 10;
                          ok.field_k = ok.field_k - 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (2 != hk.field_c) {
                    break L10;
                  } else {
                    c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                    ok.field_k = ok.field_k - 1;
                    if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
                      c.field_u[((bb) this).field_k] = 1;
                      ok.field_k = ok.field_k + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                } else {
                  break L10;
                }
              }
              return;
            }
          }
        } else {
          L12: {
            L13: {
              var2 = -1;
              var3 = (-200 + pi.field_e) / 150;
              if (-201 < (pi.field_e ^ -1)) {
                break L13;
              } else {
                if ((pi.field_e ^ -1) < -351) {
                  break L13;
                } else {
                  break L12;
                }
              }
            }
            var3 = -1;
            break L12;
          }
          L14: {
            ((bb) this).field_k = var3 * 3 - -var2;
            if (-112 > (-140 + ko.field_p) % 126) {
              ((bb) this).field_k = -1;
              break L14;
            } else {
              break L14;
            }
          }
          if (-4 > ((bb) this).field_k) {
            L15: {
              if (0 > ((bb) this).field_k) {
                ((bb) this).field_k = -1;
                break L15;
              } else {
                break L15;
              }
            }
            if ((((bb) this).field_k ^ -1) < 0) {
              if (1 != hk.field_c) {
                if (2 == hk.field_c) {
                  c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                  ok.field_k = ok.field_k - 1;
                  if (-2 >= (c.field_u[((bb) this).field_k] ^ -1)) {
                    return;
                  } else {
                    c.field_u[((bb) this).field_k] = 1;
                    ok.field_k = ok.field_k + 1;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                  c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                  ok.field_k = ok.field_k + 1;
                  if ((c.field_u[((bb) this).field_k] ^ -1) >= -11) {
                    return;
                  } else {
                    c.field_u[((bb) this).field_k] = 10;
                    ok.field_k = ok.field_k - 1;
                    return;
                  }
                } else {
                  L16: {
                    if (2 != hk.field_c) {
                      break L16;
                    } else {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                      ok.field_k = ok.field_k - 1;
                      if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
                        c.field_u[((bb) this).field_k] = 1;
                        ok.field_k = ok.field_k + 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L17: {
              ((bb) this).field_k = -1;
              if (0 < (((bb) this).field_k ^ -1)) {
                ((bb) this).field_k = -1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if ((((bb) this).field_k ^ -1) < 0) {
                L19: {
                  if (1 != hk.field_c) {
                    break L19;
                  } else {
                    if (0 < oc.d(param0 ^ -2765) + -ok.field_k) {
                      c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] + 1;
                      ok.field_k = ok.field_k + 1;
                      if (c.field_u[((bb) this).field_k] < -11) {
                        c.field_u[((bb) this).field_k] = 10;
                        ok.field_k = ok.field_k - 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                if (2 != hk.field_c) {
                  break L18;
                } else {
                  c.field_u[((bb) this).field_k] = c.field_u[((bb) this).field_k] - 1;
                  ok.field_k = ok.field_k - 1;
                  if (-2 < (c.field_u[((bb) this).field_k] ^ -1)) {
                    c.field_u[((bb) this).field_k] = 1;
                    ok.field_k = ok.field_k + 1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            return;
          }
        }
    }

    static {
    }
}
