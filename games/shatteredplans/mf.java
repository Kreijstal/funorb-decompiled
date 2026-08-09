/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException var5 = null;
        th stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.a(param1, param2, param0, 2)) {
              L1: {
                if (param4 <= -83) {
                  break L1;
                } else {
                  mf.e(87);
                  break L1;
                }
              }
              stackIn_6_0 = in.a(15, param3.a(param1, -1, param0));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("mf.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    final static lp a(qk[] param0, boolean param1) {
        lp var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        lp var5 = null;
        lp stackIn_6_0 = null;
        lp stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new lp(0, 0, 182, param0.length * rs.field_Cb.field_J);
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (param0.length <= var3) {
                if (param1) {
                  stackIn_8_0 = (lp) (var2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = (lp) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                param0[var3].a((byte) 119, 0, rs.field_Cb.field_J * var3);
                var5.a(param0[var3], 8);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("mf.R(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_s.b(-11196, param1) == tj.field_b) {
              stackIn_3_0 = this.field_s.a(false, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0) {
                if (this.b(-11196, param1) == tj.field_b) {
                  stackIn_10_0 = ab.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return dn.field_g;
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("mf.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final u b(int param0, String param1) {
        ks var3 = null;
        RuntimeException var3_ref = null;
        u stackIn_2_0 = null;
        u stackIn_7_0 = null;
        u stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_s.b(param0, param1) != tj.field_b) {
              L1: {
                if (!param1.equals(this.field_t)) {
                  var3 = os.a(202, param1);
                  if (var3.b(14)) {
                    this.field_t = param1;
                    this.field_n = var3.a(true);
                    break L1;
                  } else {
                    stackIn_7_0 = lm.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_n) {
                  stackIn_12_0 = tj.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = p.field_g;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = tj.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("mf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
          ti.field_e = false;
          if (param1) {
            if (0 < qa.field_t) {
              qa.field_t = qa.field_t - 1;
              if (!param0) {
                field_q = (sq[]) null;
                return;
              } else {
                return;
              }
            } else {
              if (-1 <= (bc.field_b ^ -1)) {
                if (0 < ee.field_k) {
                  ee.field_k = ee.field_k - 1;
                  if (!param0) {
                    field_q = (sq[]) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!param0) {
                    field_q = (sq[]) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                bc.field_b = bc.field_b - 1;
                if (!param0) {
                  field_q = (sq[]) null;
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
                      L0: {
                        if (qa.field_t == 0) {
                          in.a((byte) -83);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      qa.field_t = qa.field_t + 1;
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (!param0) {
                      field_q = (sq[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                  if (!param0) {
                    field_q = (sq[]) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (qa.field_t <= 0) {
                  if (ee.field_k <= 0) {
                    if (ed.field_f > bc.field_b) {
                      L1: {
                        if (0 == bc.field_b) {
                          tc.a(true, true);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      bc.field_b = bc.field_b + 1;
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (!param0) {
                      field_q = (sq[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  qa.field_t = qa.field_t - 1;
                  if (!param0) {
                    field_q = (sq[]) null;
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
                  field_q = (sq[]) null;
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  if (-1 > (bc.field_b ^ -1)) {
                    bc.field_b = bc.field_b - 1;
                    break L2;
                  } else {
                    if (ee.field_k < ed.field_f) {
                      L3: {
                        if (0 == ee.field_k) {
                          tc.a(true, false);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ee.field_k = ee.field_k + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!param0) {
                  field_q = (sq[]) null;
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
                  field_q = (sq[]) null;
                  return;
                } else {
                  return;
                }
              } else {
                if (-1 <= (bc.field_b ^ -1)) {
                  if (0 < ee.field_k) {
                    ee.field_k = ee.field_k - 1;
                    if (!param0) {
                      field_q = (sq[]) null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!param0) {
                      field_q = (sq[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                  if (!param0) {
                    field_q = (sq[]) null;
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
                        L4: {
                          if (qa.field_t == 0) {
                            in.a((byte) -83);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        qa.field_t = qa.field_t + 1;
                        if (!param0) {
                          field_q = (sq[]) null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (!param0) {
                          field_q = (sq[]) null;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      ee.field_k = ee.field_k - 1;
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    bc.field_b = bc.field_b - 1;
                    if (!param0) {
                      field_q = (sq[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (qa.field_t <= 0) {
                    if (ee.field_k <= 0) {
                      if (ed.field_f > bc.field_b) {
                        L5: {
                          if (0 == bc.field_b) {
                            tc.a(true, true);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        bc.field_b = bc.field_b + 1;
                        if (!param0) {
                          field_q = (sq[]) null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (!param0) {
                          field_q = (sq[]) null;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      ee.field_k = ee.field_k - 1;
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    qa.field_t = qa.field_t - 1;
                    if (!param0) {
                      field_q = (sq[]) null;
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
                    field_q = (sq[]) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    if (-1 > (bc.field_b ^ -1)) {
                      bc.field_b = bc.field_b - 1;
                      break L6;
                    } else {
                      if (ee.field_k < ed.field_f) {
                        L7: {
                          if (0 == ee.field_k) {
                            tc.a(true, false);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ee.field_k = ee.field_k + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (!param0) {
                    field_q = (sq[]) null;
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
                      L8: {
                        if (qa.field_t == 0) {
                          in.a((byte) -83);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      qa.field_t = qa.field_t + 1;
                      if (!param0) {
                        field_q = (sq[]) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0) {
                        return;
                      } else {
                        field_q = (sq[]) null;
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (param0) {
                      return;
                    } else {
                      field_q = (sq[]) null;
                      return;
                    }
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                  if (param0) {
                    return;
                  } else {
                    field_q = (sq[]) null;
                    return;
                  }
                }
              } else {
                if (qa.field_t <= 0) {
                  if (ee.field_k <= 0) {
                    if (ed.field_f > bc.field_b) {
                      L9: {
                        if (0 == bc.field_b) {
                          tc.a(true, true);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      bc.field_b = bc.field_b + 1;
                      if (param0) {
                        return;
                      } else {
                        field_q = (sq[]) null;
                        return;
                      }
                    } else {
                      if (param0) {
                        return;
                      } else {
                        field_q = (sq[]) null;
                        return;
                      }
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                    if (param0) {
                      return;
                    } else {
                      field_q = (sq[]) null;
                      return;
                    }
                  }
                } else {
                  qa.field_t = qa.field_t - 1;
                  if (param0) {
                    return;
                  } else {
                    field_q = (sq[]) null;
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
                  field_q = (sq[]) null;
                  return;
                }
              } else {
                L10: {
                  if (-1 > (bc.field_b ^ -1)) {
                    bc.field_b = bc.field_b - 1;
                    break L10;
                  } else {
                    if (ee.field_k < ed.field_f) {
                      L11: {
                        if (0 == ee.field_k) {
                          tc.a(true, false);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      ee.field_k = ee.field_k + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (!param0) {
                  field_q = (sq[]) null;
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
        this.field_n = false;
        this.field_t = "";
        try {
            this.field_s = new fj(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = uo.field_h;
              var1 = var5;
              if (param0 > 92) {
                break L1;
              } else {
                mf.e(20);
                break L1;
              }
            }
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "mf.O(" + param0 + ')');
        }
    }

    final static bi a(bc param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        Object stackIn_3_0 = null;
        bi stackIn_8_0 = null;
        bi stackIn_8_1 = null;
        byte[] stackIn_8_2 = null;
        bi stackIn_9_0;
        bi stackIn_9_1;
        byte[] stackIn_9_2;
        Object stackIn_9_3;
        bi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.a((byte) 96, param2, param1)) {
                break L1;
              } else {
                param2 = param2 + ".jpg";
                if (param0.a((byte) 127, param2, param1)) {
                  break L1;
                } else {
                  stackIn_3_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              var5 = param0.a(true, param2, param1);
              var4 = var5;
              if (!param3) {
                break L2;
              } else {
                mf.a(false, true);
                break L2;
              }
            }
            L3: {
              stackIn_8_0 = null;

              stackIn_8_1 = null;

              stackIn_8_2 = (byte[]) (var5);

              if (null == bj.field_K) {
                stackIn_9_0 = null;
                stackIn_9_1 = null;
                stackIn_9_2 = (byte[]) ((Object) stackIn_8_2);
                stackIn_9_3 = tm.field_i;
                break L3;
              } else {
                stackIn_9_0 = null;
                stackIn_9_1 = null;
                stackIn_9_2 = (byte[]) ((Object) stackIn_8_2);
                stackIn_9_3 = bj.field_K;
                break L3;
              }
            }
            stackIn_10_0 = new bi(stackIn_9_2, (java.awt.Component) ((Object) stackIn_9_3));
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("mf.S(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bi) ((Object) stackIn_3_0);
        } else {
          return stackIn_10_0;
        }
    }

    final static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        mj var1 = null;
        fb var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = (mj) ((Object) gr.field_p.d(0));
              if (param0 >= 4) {
                break L1;
              } else {
                mf.a(true, true);
                break L1;
              }
            }
            L2: while (true) {
              if (var1 == null) {
                var1_ref = (fb) ((Object) kj.field_a.d(0));
                L3: while (true) {
                  if (var1_ref == null) {
                    var1 = (mj) ((Object) uo.field_a.d(0));
                    L4: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L5: {
                          if (var1.field_Gb <= 0) {
                            break L5;
                          } else {
                            var1.field_Gb = var1.field_Gb - 1;
                            if (-1 == (var1.field_Gb ^ -1)) {
                              var1.field_Eb = 0;
                              if (var1.h(-96)) {
                                var1.b((byte) -108);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              var1 = (mj) ((Object) uo.field_a.a((byte) -71));
                              continue L4;
                            }
                          }
                        }
                        var1 = (mj) ((Object) uo.field_a.a((byte) -71));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (0 < var1_ref.field_Nb) {
                        var1_ref.field_Nb = var1_ref.field_Nb - 1;
                        if (-1 == (var1_ref.field_Nb ^ -1)) {
                          var1_ref.field_hc = 0;
                          if (var1_ref.f((byte) -78)) {
                            var1_ref.b((byte) -58);
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref = (fb) ((Object) kj.field_a.a((byte) -71));
                    continue L3;
                  }
                }
              } else {
                L7: {
                  if (0 >= var1.field_Gb) {
                    break L7;
                  } else {
                    var1.field_Gb = var1.field_Gb - 1;
                    if (-1 == (var1.field_Gb ^ -1)) {
                      var1.field_Eb = 0;
                      if (!var1.h(-122)) {
                        break L7;
                      } else {
                        var1.b((byte) -58);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                var1 = (mj) ((Object) gr.field_p.a((byte) -71));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref2), "mf.V(" + param0 + ')');
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new int[var2_int];
              if (param0 == 74) {
                break L1;
              } else {
                mf.e(40);
                break L1;
              }
            }
            var4 = 1;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_11_0 = (int[]) (var3);
                break L0;
              } else {
                var5 = var4;
                L3: while (true) {
                  L4: {
                    var5--;
                    if (0 > var5) {
                      break L4;
                    } else {
                      if (param1[var3[var5]] >= param1[var4]) {
                        break L4;
                      } else {
                        var3[var5 + 1] = var3[var5];
                        continue L3;
                      }
                    }
                  }
                  var3[1 + var5] = var4;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("mf.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        field_u = "You have offered a Non-Agression Pact to <%0>.";
        field_v = "READY";
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
