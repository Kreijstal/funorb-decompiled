/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends jc {
    static boolean field_A;
    byte[] field_w;
    int field_y;
    static bi field_x;
    static fm field_v;
    ua field_B;
    static bi field_z;

    public static void h(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 100 % ((-56 - param0) / 52);
    }

    final static void a(int param0, int param1, wa param2) {
        int var4 = 0;
        wa var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        var5 = param2;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 > param1) {
          if (param2.field_h > param0) {
            L0: {
              stackOut_6_0 = param2.field_a;
              stackOut_6_1 = param2.field_a * (param0 - 1) + param2.field_f;
              stackOut_6_2 = null;
              stackOut_6_3 = param2.field_f + param0 * param2.field_a;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              if (2147483647 == param2.field_h) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = param2.field_h;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L0;
              } else {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = -param0 + param2.field_h;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L0;
              }
            }
            var5 = wi.a(stackIn_9_0, stackIn_9_1, (wa) (Object) stackIn_9_2, stackIn_9_3, stackIn_9_4, param2.field_g + param0, param1 + -3903);
            param2.field_h = param0;
            L1: while (true) {
              if (param2.field_c != null) {
                L2: {
                  if (param2.field_c.field_g < var5.field_g) {
                    break L2;
                  } else {
                    if (param2.field_c.field_g == var5.field_g) {
                      if (param2.field_c.field_h > var5.field_h) {
                        break L2;
                      } else {
                        var5.field_c = param2.field_c;
                        param2.field_c = var5;
                        return;
                      }
                    } else {
                      var5.field_c = param2.field_c;
                      param2.field_c = var5;
                      return;
                    }
                  }
                }
                param2 = param2.field_c;
                continue L1;
              } else {
                var5.field_c = param2.field_c;
                param2.field_c = var5;
                return;
              }
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void a(bc param0, byte param1, boolean param2, bc param3) {
        int var4 = -57 / ((param1 - 22) / 37);
        ba.a(n.field_o, dm.field_h, 124, fg.field_b, se.field_m, mc.field_o, l.field_a, oh.field_a, param2, (nq) (Object) ul.field_xb, ii.field_u, gn.field_w);
        bh.field_m = ae.a(93, "lobby", param3, "chatfilter");
        jf.field_d[1] = gm.field_o;
        jf.field_d[0] = bf.field_b;
        jf.field_d[2] = ue.field_d;
        ne.a(param0, (byte) -64, (nq) (Object) ge.field_p);
    }

    final static void f(byte param0) {
        Object var2 = null;
        if (param0 == 118) {
          L0: {
            if (di.field_m == 0) {
              sg.a(true, false, 50, vr.field_d, tk.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          di.field_m = di.field_m + 1;
          if ((di.field_m + 1 ^ -1) == -751) {
            jc.a(4, (byte) 122);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            var2 = null;
            int discarded$8 = ak.a(22, (CharSequence) null, '');
            if (di.field_m == 0) {
              sg.a(true, false, 50, vr.field_d, tk.field_C);
              break L1;
            } else {
              break L1;
            }
          }
          di.field_m = di.field_m + 1;
          if ((di.field_m + 1 ^ -1) != -751) {
            return;
          } else {
            jc.a(4, (byte) 122);
            return;
          }
        }
    }

    final int e(int param0) {
        if (!(!((ak) this).field_u)) {
            return 0;
        }
        if (param0 != 0) {
            ((ak) this).field_w = null;
            return 100;
        }
        return 100;
    }

    final static boolean a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        L0: {
          if (!ol.a(-126)) {
            break L0;
          } else {
            L1: {
              o.a(param3, param6, false, param2);
              if (null == hp.field_m) {
                break L1;
              } else {
                if (!hp.field_m.a(param6, param1, -16, param5, param3)) {
                  break L1;
                } else {
                  ai.a(3);
                  param3 = false;
                  break L1;
                }
              }
            }
            jl.a(-21, param3, param6);
            nf.a(-126, param4, param3);
            param3 = false;
            break L0;
          }
        }
        if (!param0) {
          field_A = false;
          return param3;
        } else {
          return param3;
        }
    }

    final static void c(int param0, int param1) {
        int var2 = 0;
        wm.field_b = param1;
        if (jh.field_B != null) {
          L0: {
            jh.field_B.c(598, param1);
            if (null != u.field_b) {
              u.field_b.a(param1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = -9 / ((62 - param0) / 62);
          return;
        } else {
          L1: {
            if (null != u.field_b) {
              u.field_b.a(param1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          var2 = -9 / ((62 - param0) / 62);
          return;
        }
    }

    final static void i(int param0) {
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 > (qa.field_t ^ -1)) {
          qa.field_t = qa.field_t - 1;
          if (param0 == -751) {
            if (qa.field_t <= 0) {
              if (-1 > bc.field_b) {
                L0: {
                  qo.a(22353, bc.field_b);
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                L1: {
                  if (-1 > (ee.field_k ^ -1)) {
                    qo.a(22353, ee.field_k);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              nj.a(438);
              if (-1 >= bc.field_b) {
                L2: {
                  if (-1 > ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  qo.a(22353, bc.field_b);
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          } else {
            field_z = null;
            if (qa.field_t <= 0) {
              if (-1 > bc.field_b) {
                L4: {
                  qo.a(22353, bc.field_b);
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  if (-1 > ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              nj.a(438);
              if (-1 > bc.field_b) {
                L6: {
                  qo.a(22353, bc.field_b);
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                L7: {
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
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
          if ((bc.field_b ^ -1) >= -1) {
            if (ee.field_k > 0) {
              ee.field_k = ee.field_k - 1;
              if (param0 == -751) {
                if (qa.field_t <= 0) {
                  if (-1 > bc.field_b) {
                    L8: {
                      qo.a(22353, bc.field_b);
                      if (-1 < ee.field_k) {
                        qo.a(22353, ee.field_k);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return;
                  } else {
                    L9: {
                      if (-1 > (ee.field_k ^ -1)) {
                        qo.a(22353, ee.field_k);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    nj.a(438);
                    if (-1 <= bc.field_b) {
                      break L10;
                    } else {
                      qo.a(22353, bc.field_b);
                      break L10;
                    }
                  }
                  L11: {
                    if (-1 < ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              } else {
                L12: {
                  field_z = null;
                  if (qa.field_t <= 0) {
                    break L12;
                  } else {
                    nj.a(438);
                    break L12;
                  }
                }
                L13: {
                  if (-1 <= bc.field_b) {
                    break L13;
                  } else {
                    qo.a(22353, bc.field_b);
                    break L13;
                  }
                }
                L14: {
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                return;
              }
            } else {
              if (param0 != -751) {
                field_z = null;
                if (qa.field_t > 0) {
                  nj.a(438);
                  if (-1 > bc.field_b) {
                    L15: {
                      qo.a(22353, bc.field_b);
                      if (-1 < ee.field_k) {
                        qo.a(22353, ee.field_k);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    return;
                  } else {
                    L16: {
                      if (-1 > (ee.field_k ^ -1)) {
                        qo.a(22353, ee.field_k);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    if (-1 <= bc.field_b) {
                      break L17;
                    } else {
                      qo.a(22353, bc.field_b);
                      break L17;
                    }
                  }
                  L18: {
                    if (-1 < ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  if (qa.field_t <= 0) {
                    break L19;
                  } else {
                    nj.a(438);
                    break L19;
                  }
                }
                L20: {
                  if (-1 <= bc.field_b) {
                    break L20;
                  } else {
                    qo.a(22353, bc.field_b);
                    break L20;
                  }
                }
                L21: {
                  if (-1 < ee.field_k) {
                    qo.a(22353, ee.field_k);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                return;
              }
            }
          } else {
            bc.field_b = bc.field_b - 1;
            if (param0 == -751) {
              if (qa.field_t <= 0) {
                if (-1 >= bc.field_b) {
                  L22: {
                    if (-1 < ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  return;
                } else {
                  L23: {
                    qo.a(22353, bc.field_b);
                    if (-1 > ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  return;
                }
              } else {
                nj.a(438);
                if (-1 <= bc.field_b) {
                  L24: {
                    if (-1 > ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                } else {
                  L25: {
                    qo.a(22353, bc.field_b);
                    if (-1 < ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  return;
                }
              }
            } else {
              field_z = null;
              if (qa.field_t <= 0) {
                if (-1 < bc.field_b) {
                  L26: {
                    qo.a(22353, bc.field_b);
                    if (-1 > ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  return;
                } else {
                  L27: {
                    if (-1 < ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                nj.a(438);
                if (-1 > bc.field_b) {
                  L28: {
                    qo.a(22353, bc.field_b);
                    if (-1 < ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  return;
                } else {
                  L29: {
                    if (-1 > ee.field_k) {
                      qo.a(22353, ee.field_k);
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            var6 = 6 % ((-32 - param0) / 50);
            return var3;
          } else {
            if (param1.charAt(var5) != param2) {
              var5++;
              var5++;
              continue L0;
            } else {
              var3++;
              var5++;
              continue L0;
            }
          }
        }
    }

    ak() {
    }

    final byte[] e(byte param0) {
        if (param0 <= 48) {
            ((ak) this).field_y = -105;
            if (!(!((ak) this).field_u)) {
                throw new RuntimeException();
            }
            return ((ak) this).field_w;
        }
        if (!(!((ak) this).field_u)) {
            throw new RuntimeException();
        }
        return ((ak) this).field_w;
    }

    final static void a(int[] param0, int param1, Object[] param2) {
        int var3 = 105 / ((param1 - 42) / 55);
        lr.a(0, param0.length - 1, param0, (byte) 78, param2);
    }

    static {
    }
}
