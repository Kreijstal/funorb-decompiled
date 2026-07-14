/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class mf extends ml {
    private fj field_s;
    static nq field_x;
    static boolean field_r;
    static String field_u;
    static nk[] field_o;
    static String[] field_w;
    static sq[] field_q;
    static String field_v;
    private boolean field_n;
    private String field_t;
    static boolean field_p;

    final static th a(int param0, int param1, bc param2, bc param3, int param4) {
        if (vd.a(param1, param2, param0, 2)) {
          if (param4 > -83) {
            mf.e(87);
            return in.a(15, param3.a(param1, -1, param0));
          } else {
            return in.a(15, param3.a(param1, -1, param0));
          }
        } else {
          return null;
        }
    }

    final static lp a(qk[] param0, boolean param1) {
        lp var2 = null;
        int var3 = 0;
        int var4 = 0;
        lp var5 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = new lp(0, 0, 182, param0.length * rs.field_Cb.field_J);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (param0.length <= var3) {
            if (!param1) {
              return null;
            } else {
              return var2;
            }
          } else {
            param0[var3].a((byte) 119, 0, rs.field_Cb.field_J * var3);
            var5.a((vd) (Object) param0[var3], 8);
            var3++;
            continue L0;
          }
        }
    }

    final String a(boolean param0, String param1) {
        if (!(((mf) this).field_s.b(-11196, param1) != tj.field_b)) {
            return ((mf) this).field_s.a(false, param1);
        }
        if (param0) {
            return null;
        }
        if (!(((mf) this).b(-11196, param1) != tj.field_b)) {
            return ab.field_d;
        }
        return dn.field_g;
    }

    final u b(int param0, String param1) {
        ks var3 = null;
        if (((mf) this).field_s.b(param0, param1) == tj.field_b) {
            return tj.field_b;
        }
        if (!(param1.equals((Object) (Object) ((mf) this).field_t))) {
            var3 = os.a(202, param1);
            if (var3.b(14)) {
                ((mf) this).field_t = param1;
                ((mf) this).field_n = var3.a(true);
                return ((mf) this).field_n ? p.field_g : tj.field_b;
            }
            return lm.field_d;
        }
        return ((mf) this).field_n ? p.field_g : tj.field_b;
    }

    final static void a(boolean param0, boolean param1) {
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
          ti.field_e = false;
          if (param1) {
            if (0 < qa.field_t) {
              qa.field_t = qa.field_t - 1;
              if (!param0) {
                field_q = null;
                return;
              } else {
                return;
              }
            } else {
              if (-1 <= (bc.field_b ^ -1)) {
                if (0 < ee.field_k) {
                  ee.field_k = ee.field_k - 1;
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                bc.field_b = bc.field_b - 1;
                if (!param0) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (np.field_a == null) {
              if (null == he.field_p) {
                ti.field_e = false;
                if (-1 <= (bc.field_b ^ -1)) {
                  if (0 >= ee.field_k) {
                    if (ed.field_f > qa.field_t) {
                      in.a((byte) -83);
                      qa.field_t = qa.field_t + 1;
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (!param0) {
                      field_q = null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (qa.field_t <= 0) {
                  if (ee.field_k <= 0) {
                    if (ed.field_f > bc.field_b) {
                      L0: {
                        if (0 == bc.field_b) {
                          tc.a(true, true);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      bc.field_b = bc.field_b + 1;
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (!param0) {
                      field_q = null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  qa.field_t = qa.field_t - 1;
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (0 < qa.field_t) {
                qa.field_t = qa.field_t - 1;
                if (!param0) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              } else {
                L1: {
                  if (-1 > (bc.field_b ^ -1)) {
                    bc.field_b = bc.field_b - 1;
                    break L1;
                  } else {
                    if (ee.field_k < ed.field_f) {
                      L2: {
                        if (0 == ee.field_k) {
                          tc.a(true, false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ee.field_k = ee.field_k + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!param0) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (np.field_a == null) {
            ti.field_e = false;
            if (param1) {
              if (0 < qa.field_t) {
                qa.field_t = qa.field_t - 1;
                if (!param0) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (-1 <= (bc.field_b ^ -1)) {
                  if (0 < ee.field_k) {
                    ee.field_k = ee.field_k - 1;
                    if (!param0) {
                      field_q = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!param0) {
                      field_q = null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (np.field_a == null) {
                if (null == he.field_p) {
                  ti.field_e = false;
                  if (-1 <= (bc.field_b ^ -1)) {
                    if (0 >= ee.field_k) {
                      if (ed.field_f > qa.field_t) {
                        in.a((byte) -83);
                        qa.field_t = qa.field_t + 1;
                        if (!param0) {
                          field_q = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (!param0) {
                          field_q = null;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      ee.field_k = ee.field_k - 1;
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    bc.field_b = bc.field_b - 1;
                    if (!param0) {
                      field_q = null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (qa.field_t <= 0) {
                    if (ee.field_k <= 0) {
                      if (ed.field_f > bc.field_b) {
                        L3: {
                          if (0 == bc.field_b) {
                            tc.a(true, true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        bc.field_b = bc.field_b + 1;
                        if (!param0) {
                          field_q = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (!param0) {
                          field_q = null;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      ee.field_k = ee.field_k - 1;
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    qa.field_t = qa.field_t - 1;
                    if (!param0) {
                      field_q = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (0 < qa.field_t) {
                  qa.field_t = qa.field_t - 1;
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    if (-1 > (bc.field_b ^ -1)) {
                      bc.field_b = bc.field_b - 1;
                      break L4;
                    } else {
                      if (ee.field_k < ed.field_f) {
                        L5: {
                          if (0 == ee.field_k) {
                            tc.a(true, false);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ee.field_k = ee.field_k + 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    field_q = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (np.field_a == null) {
              if (null == he.field_p) {
                ti.field_e = false;
                if (-1 <= (bc.field_b ^ -1)) {
                  if (0 >= ee.field_k) {
                    if (ed.field_f > qa.field_t) {
                      in.a((byte) -83);
                      qa.field_t = qa.field_t + 1;
                      if (!param0) {
                        field_q = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0) {
                        return;
                      } else {
                        field_q = null;
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (param0) {
                      return;
                    } else {
                      field_q = null;
                      return;
                    }
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                  if (param0) {
                    return;
                  } else {
                    field_q = null;
                    return;
                  }
                }
              } else {
                if (qa.field_t <= 0) {
                  if (ee.field_k <= 0) {
                    if (ed.field_f > bc.field_b) {
                      L6: {
                        if (0 == bc.field_b) {
                          tc.a(true, true);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      bc.field_b = bc.field_b + 1;
                      if (param0) {
                        return;
                      } else {
                        field_q = null;
                        return;
                      }
                    } else {
                      if (param0) {
                        return;
                      } else {
                        field_q = null;
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (param0) {
                      return;
                    } else {
                      field_q = null;
                      return;
                    }
                  }
                } else {
                  qa.field_t = qa.field_t - 1;
                  if (param0) {
                    return;
                  } else {
                    field_q = null;
                    return;
                  }
                }
              }
            } else {
              if (0 < qa.field_t) {
                qa.field_t = qa.field_t - 1;
                if (param0) {
                  return;
                } else {
                  field_q = null;
                  return;
                }
              } else {
                L7: {
                  if (-1 > (bc.field_b ^ -1)) {
                    bc.field_b = bc.field_b - 1;
                    break L7;
                  } else {
                    if (ee.field_k < ed.field_f) {
                      L8: {
                        if (0 == ee.field_k) {
                          tc.a(true, false);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ee.field_k = ee.field_k + 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                if (!param0) {
                  field_q = null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_u = null;
        field_o = null;
        if (param0 != 0) {
          field_p = true;
          field_x = null;
          field_w = null;
          field_q = null;
          field_v = null;
          return;
        } else {
          field_x = null;
          field_w = null;
          field_q = null;
          field_v = null;
          return;
        }
    }

    mf(go param0, go param1) {
        super(param0);
        ((mf) this).field_n = false;
        ((mf) this).field_t = "";
        ((mf) this).field_s = new fj(param0, param1);
    }

    final static void e(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = uo.field_h;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 > 92) {
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var3 > var2) {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          mf.e(20);
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var3 > var2) {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static bi a(bc param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        bi stackIn_3_0 = null;
        bi stackIn_3_1 = null;
        byte[] stackIn_3_2 = null;
        bi stackIn_4_0 = null;
        bi stackIn_4_1 = null;
        byte[] stackIn_4_2 = null;
        bi stackIn_5_0 = null;
        bi stackIn_5_1 = null;
        byte[] stackIn_5_2 = null;
        Object stackIn_5_3 = null;
        bi stackIn_7_0 = null;
        bi stackIn_7_1 = null;
        byte[] stackIn_7_2 = null;
        bi stackIn_8_0 = null;
        bi stackIn_8_1 = null;
        byte[] stackIn_8_2 = null;
        bi stackIn_9_0 = null;
        bi stackIn_9_1 = null;
        byte[] stackIn_9_2 = null;
        Object stackIn_9_3 = null;
        bi stackIn_15_0 = null;
        bi stackIn_15_1 = null;
        byte[] stackIn_15_2 = null;
        bi stackIn_16_0 = null;
        bi stackIn_16_1 = null;
        byte[] stackIn_16_2 = null;
        bi stackIn_17_0 = null;
        bi stackIn_17_1 = null;
        byte[] stackIn_17_2 = null;
        Object stackIn_17_3 = null;
        bi stackIn_19_0 = null;
        bi stackIn_19_1 = null;
        byte[] stackIn_19_2 = null;
        bi stackIn_20_0 = null;
        bi stackIn_20_1 = null;
        byte[] stackIn_20_2 = null;
        bi stackIn_21_0 = null;
        bi stackIn_21_1 = null;
        byte[] stackIn_21_2 = null;
        Object stackIn_21_3 = null;
        bi stackOut_18_0 = null;
        bi stackOut_18_1 = null;
        byte[] stackOut_18_2 = null;
        bi stackOut_20_0 = null;
        bi stackOut_20_1 = null;
        byte[] stackOut_20_2 = null;
        java.awt.Canvas stackOut_20_3 = null;
        bi stackOut_19_0 = null;
        bi stackOut_19_1 = null;
        byte[] stackOut_19_2 = null;
        eb stackOut_19_3 = null;
        bi stackOut_14_0 = null;
        bi stackOut_14_1 = null;
        byte[] stackOut_14_2 = null;
        bi stackOut_16_0 = null;
        bi stackOut_16_1 = null;
        byte[] stackOut_16_2 = null;
        java.awt.Canvas stackOut_16_3 = null;
        bi stackOut_15_0 = null;
        bi stackOut_15_1 = null;
        byte[] stackOut_15_2 = null;
        eb stackOut_15_3 = null;
        bi stackOut_6_0 = null;
        bi stackOut_6_1 = null;
        byte[] stackOut_6_2 = null;
        bi stackOut_8_0 = null;
        bi stackOut_8_1 = null;
        byte[] stackOut_8_2 = null;
        java.awt.Canvas stackOut_8_3 = null;
        bi stackOut_7_0 = null;
        bi stackOut_7_1 = null;
        byte[] stackOut_7_2 = null;
        eb stackOut_7_3 = null;
        bi stackOut_2_0 = null;
        bi stackOut_2_1 = null;
        byte[] stackOut_2_2 = null;
        bi stackOut_4_0 = null;
        bi stackOut_4_1 = null;
        byte[] stackOut_4_2 = null;
        java.awt.Canvas stackOut_4_3 = null;
        bi stackOut_3_0 = null;
        bi stackOut_3_1 = null;
        byte[] stackOut_3_2 = null;
        eb stackOut_3_3 = null;
        if (!param0.a((byte) 96, param2, param1)) {
          param2 = param2 + ".jpg";
          if (param0.a((byte) 127, param2, param1)) {
            var5 = param0.a(true, param2, param1);
            var4 = var5;
            if (param3) {
              L0: {
                mf.a(false, true);
                stackOut_18_0 = null;
                stackOut_18_1 = null;
                stackOut_18_2 = (byte[]) var5;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_20_2 = stackOut_18_2;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                if (null == bj.field_K) {
                  stackOut_20_0 = null;
                  stackOut_20_1 = null;
                  stackOut_20_2 = (byte[]) (Object) stackIn_20_2;
                  stackOut_20_3 = tm.field_i;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  stackIn_21_3 = (Object) (Object) stackOut_20_3;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackOut_19_1 = null;
                  stackOut_19_2 = (byte[]) (Object) stackIn_19_2;
                  stackOut_19_3 = bj.field_K;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  stackIn_21_3 = (Object) (Object) stackOut_19_3;
                  break L0;
                }
              }
              new bi(stackIn_21_2, (java.awt.Component) (Object) stackIn_21_3);
              return stackIn_21_0;
            } else {
              L1: {
                stackOut_14_0 = null;
                stackOut_14_1 = null;
                stackOut_14_2 = (byte[]) var5;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                if (null == bj.field_K) {
                  stackOut_16_0 = null;
                  stackOut_16_1 = null;
                  stackOut_16_2 = (byte[]) (Object) stackIn_16_2;
                  stackOut_16_3 = tm.field_i;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = (Object) (Object) stackOut_16_3;
                  break L1;
                } else {
                  stackOut_15_0 = null;
                  stackOut_15_1 = null;
                  stackOut_15_2 = (byte[]) (Object) stackIn_15_2;
                  stackOut_15_3 = bj.field_K;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_17_3 = (Object) (Object) stackOut_15_3;
                  break L1;
                }
              }
              new bi(stackIn_17_2, (java.awt.Component) (Object) stackIn_17_3);
              return stackIn_17_0;
            }
          } else {
            return null;
          }
        } else {
          var5 = param0.a(true, param2, param1);
          var4 = var5;
          if (param3) {
            L2: {
              mf.a(false, true);
              stackOut_6_0 = null;
              stackOut_6_1 = null;
              stackOut_6_2 = (byte[]) var5;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              if (null == bj.field_K) {
                stackOut_8_0 = null;
                stackOut_8_1 = null;
                stackOut_8_2 = (byte[]) (Object) stackIn_8_2;
                stackOut_8_3 = tm.field_i;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = (Object) (Object) stackOut_8_3;
                break L2;
              } else {
                stackOut_7_0 = null;
                stackOut_7_1 = null;
                stackOut_7_2 = (byte[]) (Object) stackIn_7_2;
                stackOut_7_3 = bj.field_K;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = (Object) (Object) stackOut_7_3;
                break L2;
              }
            }
            new bi(stackIn_9_2, (java.awt.Component) (Object) stackIn_9_3);
            return stackIn_9_0;
          } else {
            L3: {
              stackOut_2_0 = null;
              stackOut_2_1 = null;
              stackOut_2_2 = (byte[]) var5;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              if (null == bj.field_K) {
                stackOut_4_0 = null;
                stackOut_4_1 = null;
                stackOut_4_2 = (byte[]) (Object) stackIn_4_2;
                stackOut_4_3 = tm.field_i;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = (Object) (Object) stackOut_4_3;
                break L3;
              } else {
                stackOut_3_0 = null;
                stackOut_3_1 = null;
                stackOut_3_2 = (byte[]) (Object) stackIn_3_2;
                stackOut_3_3 = bj.field_K;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = (Object) (Object) stackOut_3_3;
                break L3;
              }
            }
            new bi(stackIn_5_2, (java.awt.Component) (Object) stackIn_5_3);
            return stackIn_5_0;
          }
        }
    }

    final static void d(int param0) {
        mj var1 = null;
        fb var1_ref = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = (mj) (Object) gr.field_p.d(0);
        if (param0 < 4) {
          mf.a(true, true);
          L0: while (true) {
            if (var1 == null) {
              var1_ref = (fb) (Object) kj.field_a.d(0);
              L1: while (true) {
                if (var1_ref == null) {
                  var1 = (mj) (Object) uo.field_a.d(0);
                  L2: while (true) {
                    if (var1 != null) {
                      L3: {
                        if (var1.field_Gb <= 0) {
                          break L3;
                        } else {
                          var1.field_Gb = var1.field_Gb - 1;
                          if (-1 == (var1.field_Gb ^ -1)) {
                            var1.field_Eb = 0;
                            if (var1.h(-96)) {
                              var1.b((byte) -108);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var1 = (mj) (Object) uo.field_a.a((byte) -71);
                            continue L2;
                          }
                        }
                      }
                      var1 = (mj) (Object) uo.field_a.a((byte) -71);
                      continue L2;
                    } else {
                      return;
                    }
                  }
                } else {
                  L4: {
                    if (0 < var1_ref.field_Nb) {
                      var1_ref.field_Nb = var1_ref.field_Nb - 1;
                      if (-1 == (var1_ref.field_Nb ^ -1)) {
                        var1_ref.field_hc = 0;
                        if (var1_ref.f((byte) -78)) {
                          var1_ref.b((byte) -58);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var1_ref = (fb) (Object) kj.field_a.a((byte) -71);
                  continue L1;
                }
              }
            } else {
              L5: {
                if (0 >= var1.field_Gb) {
                  break L5;
                } else {
                  var1.field_Gb = var1.field_Gb - 1;
                  if (-1 == (var1.field_Gb ^ -1)) {
                    var1.field_Eb = 0;
                    if (!var1.h(-122)) {
                      break L5;
                    } else {
                      var1.b((byte) -58);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var1 = (mj) (Object) gr.field_p.a((byte) -71);
              continue L0;
            }
          }
        } else {
          L6: while (true) {
            if (var1 == null) {
              var1_ref = (fb) (Object) kj.field_a.d(0);
              L7: while (true) {
                if (var1_ref == null) {
                  var1 = (mj) (Object) uo.field_a.d(0);
                  L8: while (true) {
                    if (var1 != null) {
                      L9: {
                        if (var1.field_Gb <= 0) {
                          break L9;
                        } else {
                          var1.field_Gb = var1.field_Gb - 1;
                          if (-1 == (var1.field_Gb ^ -1)) {
                            var1.field_Eb = 0;
                            if (var1.h(-96)) {
                              var1.b((byte) -108);
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            var1 = (mj) (Object) uo.field_a.a((byte) -71);
                            continue L8;
                          }
                        }
                      }
                      var1 = (mj) (Object) uo.field_a.a((byte) -71);
                      continue L8;
                    } else {
                      return;
                    }
                  }
                } else {
                  L10: {
                    if (0 < var1_ref.field_Nb) {
                      var1_ref.field_Nb = var1_ref.field_Nb - 1;
                      if (-1 == (var1_ref.field_Nb ^ -1)) {
                        var1_ref.field_hc = 0;
                        if (var1_ref.f((byte) -78)) {
                          var1_ref.b((byte) -58);
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  var1_ref = (fb) (Object) kj.field_a.a((byte) -71);
                  continue L7;
                }
              }
            } else {
              L11: {
                if (0 >= var1.field_Gb) {
                  break L11;
                } else {
                  var1.field_Gb = var1.field_Gb - 1;
                  if (-1 == (var1.field_Gb ^ -1)) {
                    var1.field_Eb = 0;
                    if (!var1.h(-122)) {
                      break L11;
                    } else {
                      var1.b((byte) -58);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              var1 = (mj) (Object) gr.field_p.a((byte) -71);
              continue L6;
            }
          }
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param1.length;
        var8 = new int[var2];
        var7 = var8;
        var3 = var7;
        if (param0 != 74) {
          mf.e(40);
          var4 = 1;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var5 = var4;
              L1: while (true) {
                L2: {
                  var5--;
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (param1[var8[var5]] >= param1[var4]) {
                      break L2;
                    } else {
                      var3[var5 + 1] = var8[var5];
                      continue L1;
                    }
                  }
                }
                var3[1 + var5] = var4;
                var4++;
                continue L0;
              }
            }
          }
        } else {
          var4 = 1;
          L3: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var5 = var4;
              L4: while (true) {
                L5: {
                  var5--;
                  if (0 > var5) {
                    break L5;
                  } else {
                    if (param1[var8[var5]] >= param1[var4]) {
                      break L5;
                    } else {
                      var3[var5 + 1] = var8[var5];
                      continue L4;
                    }
                  }
                }
                var3[1 + var5] = var4;
                var4++;
                continue L3;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "You have offered a Non-Agression Pact to <%0>.";
        field_v = "READY";
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
