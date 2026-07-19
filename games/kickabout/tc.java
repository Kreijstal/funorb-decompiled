/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends am {
    int[] field_n;
    boolean field_t;
    String field_r;
    int[] field_o;
    char[] field_p;
    static boolean field_s;
    char[] field_q;

    private final void a(int param0, boolean param1, iw param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char stackOut_10_2 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (-2 == (param0 ^ -1)) {
                this.field_r = param2.a(-118);
                break L1;
              } else {
                if (-3 == (param0 ^ -1)) {
                  var4_int = param2.h((byte) -105);
                  this.field_o = new int[var4_int];
                  this.field_q = new char[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      L3: {
                        this.field_o[var5] = param2.a((byte) 81);
                        var6 = param2.j((byte) -65);
                        stackOut_14_0 = this.field_q;
                        stackOut_14_1 = var5;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var6 != 0) {
                          stackOut_16_0 = (char[]) ((Object) stackIn_16_0);
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = nl.a(false, (byte) var6);
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L3;
                        } else {
                          stackOut_15_0 = (char[]) ((Object) stackIn_15_0);
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 0;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L3;
                        }
                      }
                      stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (3 == param0) {
                    var4_int = param2.h((byte) -109);
                    this.field_n = new int[var4_int];
                    this.field_p = new char[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L5: {
                          this.field_n[var5] = param2.a((byte) 81);
                          var6 = param2.j((byte) -81);
                          stackOut_8_0 = this.field_p;
                          stackOut_8_1 = var5;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (0 != var6) {
                            stackOut_10_0 = (char[]) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = nl.a(false, (byte) var6);
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L5;
                          } else {
                            stackOut_9_0 = (char[]) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 0;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L5;
                          }
                        }
                        stackIn_11_0[stackIn_11_1] = (char) stackIn_11_2;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if ((param0 ^ -1) != -5) {
                      break L1;
                    } else {
                      this.field_t = true;
                      break L1;
                    }
                  }
                }
              }
            }
            L6: {
              if (!param1) {
                break L6;
              } else {
                tc.a(true, 105, -26, -11);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var3 = Kickabout.field_G;
        if (param1 == 5464) {
          L0: {
            if (ua.field_l == param0) {
              break L0;
            } else {
              if (param0 > ua.field_l) {
                L1: {
                  var2 = (param0 - ua.field_l) / 10;
                  stackOut_69_0 = ua.field_l;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_70_0 = stackOut_69_0;
                  if (1 < var2) {
                    stackOut_71_0 = stackIn_71_0;
                    stackOut_71_1 = var2;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    break L1;
                  } else {
                    stackOut_70_0 = stackIn_70_0;
                    stackOut_70_1 = 1;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    break L1;
                  }
                }
                ua.field_l = stackIn_72_0 + stackIn_72_1;
                break L0;
              } else {
                L2: {
                  var2 = (param0 + -ua.field_l) / 10;
                  stackOut_52_0 = ua.field_l;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_53_0 = stackOut_52_0;
                  if (var2 >= -1) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = -1;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    break L2;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = var2;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    break L2;
                  }
                }
                L3: {
                  ua.field_l = stackIn_55_0 + stackIn_55_1;
                  if (cf.field_Db - -dc.field_d == param0) {
                    break L3;
                  } else {
                    dc.field_d = -cf.field_Db + param0;
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (dc.field_d ^ -1)) {
                    if (-2 <= (wm.field_s ^ -1)) {
                      break L4;
                    } else {
                      wm.field_s = wm.field_s - 1;
                      break L4;
                    }
                  } else {
                    if ((wm.field_s ^ -1) > -19) {
                      wm.field_s = wm.field_s + 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (wt.field_x <= qj.field_e) {
                    break L5;
                  } else {
                    if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                      break L5;
                    } else {
                      if (bi.field_i >= us.field_j) {
                        break L5;
                      } else {
                        if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                          break L5;
                        } else {
                          ka.a(dc.field_d, cf.field_Db, (byte) -113);
                          break L5;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          if (cf.field_Db - -dc.field_d == param0) {
            if (-1 == (dc.field_d ^ -1)) {
              if (-2 <= (wm.field_s ^ -1)) {
                L6: {
                  if (wt.field_x <= qj.field_e) {
                    break L6;
                  } else {
                    if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                      break L6;
                    } else {
                      if (bi.field_i >= us.field_j) {
                        break L6;
                      } else {
                        if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                          break L6;
                        } else {
                          ka.a(dc.field_d, cf.field_Db, (byte) -113);
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L7: {
                  wm.field_s = wm.field_s - 1;
                  if (wt.field_x <= qj.field_e) {
                    break L7;
                  } else {
                    if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                      break L7;
                    } else {
                      if (bi.field_i >= us.field_j) {
                        break L7;
                      } else {
                        if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                          break L7;
                        } else {
                          ka.a(dc.field_d, cf.field_Db, (byte) -113);
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              if ((wm.field_s ^ -1) > -19) {
                L8: {
                  wm.field_s = wm.field_s + 1;
                  if (wt.field_x <= qj.field_e) {
                    break L8;
                  } else {
                    if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                      break L8;
                    } else {
                      if (bi.field_i >= us.field_j) {
                        break L8;
                      } else {
                        if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                          break L8;
                        } else {
                          ka.a(dc.field_d, cf.field_Db, (byte) -113);
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L9: {
                  if (wt.field_x <= qj.field_e) {
                    break L9;
                  } else {
                    if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                      break L9;
                    } else {
                      if (bi.field_i >= us.field_j) {
                        break L9;
                      } else {
                        if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                          break L9;
                        } else {
                          ka.a(dc.field_d, cf.field_Db, (byte) -113);
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L10: {
              dc.field_d = -cf.field_Db + param0;
              if (-1 == (dc.field_d ^ -1)) {
                if (-2 <= (wm.field_s ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    wm.field_s = wm.field_s - 1;
                    if (wt.field_x <= qj.field_e) {
                      break L11;
                    } else {
                      if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                        break L11;
                      } else {
                        if (bi.field_i >= us.field_j) {
                          break L11;
                        } else {
                          if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                            break L11;
                          } else {
                            ka.a(dc.field_d, cf.field_Db, (byte) -113);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                if ((wm.field_s ^ -1) > -19) {
                  L12: {
                    wm.field_s = wm.field_s + 1;
                    if (wt.field_x <= qj.field_e) {
                      break L12;
                    } else {
                      if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                        break L12;
                      } else {
                        if (bi.field_i >= us.field_j) {
                          break L12;
                        } else {
                          if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                            break L12;
                          } else {
                            ka.a(dc.field_d, cf.field_Db, (byte) -113);
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  break L10;
                }
              }
            }
            if (wt.field_x > qj.field_e) {
              if (vo.field_cb.field_q + qj.field_e > wt.field_x) {
                L13: {
                  if (bi.field_i >= us.field_j) {
                    break L13;
                  } else {
                    if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                      break L13;
                    } else {
                      ka.a(dc.field_d, cf.field_Db, (byte) -113);
                      return;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_s = false;
          if (ua.field_l != param0) {
            L14: {
              if (param0 > ua.field_l) {
                L15: {
                  var2 = (param0 - ua.field_l) / 10;
                  stackOut_21_0 = ua.field_l;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (1 < var2) {
                    stackOut_23_0 = stackIn_23_0;
                    stackOut_23_1 = var2;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L15;
                  } else {
                    stackOut_22_0 = stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L15;
                  }
                }
                ua.field_l = stackIn_24_0 + stackIn_24_1;
                break L14;
              } else {
                L16: {
                  var2 = (param0 + -ua.field_l) / 10;
                  stackOut_17_0 = ua.field_l;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var2 >= -1) {
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = -1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L16;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = var2;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L16;
                  }
                }
                ua.field_l = stackIn_20_0 + stackIn_20_1;
                break L14;
              }
            }
            if (cf.field_Db - -dc.field_d != param0) {
              L17: {
                dc.field_d = -cf.field_Db + param0;
                if (-1 == (dc.field_d ^ -1)) {
                  if (-2 <= (wm.field_s ^ -1)) {
                    break L17;
                  } else {
                    wm.field_s = wm.field_s - 1;
                    break L17;
                  }
                } else {
                  if ((wm.field_s ^ -1) > -19) {
                    wm.field_s = wm.field_s + 1;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (wt.field_x <= qj.field_e) {
                  break L18;
                } else {
                  if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                    break L18;
                  } else {
                    if (bi.field_i >= us.field_j) {
                      break L18;
                    } else {
                      if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                        break L18;
                      } else {
                        ka.a(dc.field_d, cf.field_Db, (byte) -113);
                        break L18;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              L19: {
                if (-1 == (dc.field_d ^ -1)) {
                  if (-2 <= (wm.field_s ^ -1)) {
                    break L19;
                  } else {
                    wm.field_s = wm.field_s - 1;
                    break L19;
                  }
                } else {
                  if ((wm.field_s ^ -1) > -19) {
                    wm.field_s = wm.field_s + 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if (wt.field_x <= qj.field_e) {
                  break L20;
                } else {
                  if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                    break L20;
                  } else {
                    if (bi.field_i >= us.field_j) {
                      break L20;
                    } else {
                      if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                        break L20;
                      } else {
                        ka.a(dc.field_d, cf.field_Db, (byte) -113);
                        break L20;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L21: {
              if (cf.field_Db - -dc.field_d == param0) {
                break L21;
              } else {
                dc.field_d = -cf.field_Db + param0;
                break L21;
              }
            }
            L22: {
              if (-1 == (dc.field_d ^ -1)) {
                if (-2 <= (wm.field_s ^ -1)) {
                  break L22;
                } else {
                  wm.field_s = wm.field_s - 1;
                  break L22;
                }
              } else {
                if ((wm.field_s ^ -1) > -19) {
                  wm.field_s = wm.field_s + 1;
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              if (wt.field_x <= qj.field_e) {
                break L23;
              } else {
                if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
                  break L23;
                } else {
                  if (bi.field_i >= us.field_j) {
                    break L23;
                  } else {
                    if (nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) <= us.field_j) {
                      break L23;
                    } else {
                      ka.a(dc.field_d, cf.field_Db, (byte) -113);
                      break L23;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final static boolean a(int param0, byte param1, int param2, nl param3, int param4) {
        RuntimeException var5 = null;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        nl stackIn_22_0 = null;
        nl stackIn_23_0 = null;
        nl stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        nl stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        nl stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        nl stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        nl stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        nl stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        nl stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        nl stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        nl stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        nl stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        nl stackOut_21_0 = null;
        nl stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        nl stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        nl stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        nl stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        nl stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        nl stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        nl stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        nl stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        nl stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        nl stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        nl stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_33_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              if ((param3.field_G & 8) == 0) {
                break L1;
              } else {
                if (param2 < param3.field_M) {
                  param3.field_M = param2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((4 & param3.field_G) == 0) {
                break L2;
              } else {
                if (param3.field_w < param4) {
                  param3.field_w = param4;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((2 & param3.field_G) == 0) {
                break L3;
              } else {
                if (param2 <= param3.field_M) {
                  break L3;
                } else {
                  param3.field_M = param2;
                  break L3;
                }
              }
            }
            L4: {
              if (-1 == (param3.field_G & 1 ^ -1)) {
                break L4;
              } else {
                if (param3.field_w <= param4) {
                  break L4;
                } else {
                  param3.field_w = param4;
                  break L4;
                }
              }
            }
            if (param1 > 80) {
              L5: {
                if (param2 != param3.field_M) {
                  break L5;
                } else {
                  if (param3.field_w != param4) {
                    break L5;
                  } else {
                    param3.field_G = 0;
                    param3.a(param0, 26214);
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L6: {
                stackOut_21_0 = (nl) (param3);
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (param4 > param3.field_w) {
                  stackOut_23_0 = (nl) ((Object) stackIn_23_0);
                  stackOut_23_1 = 1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L6;
                } else {
                  stackOut_22_0 = (nl) ((Object) stackIn_22_0);
                  stackOut_22_1 = 0;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L6;
                }
              }
              L7: {
                stackOut_24_0 = (nl) ((Object) stackIn_24_0);
                stackOut_24_1 = stackIn_24_1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param3.field_M >= param2) {
                  stackOut_26_0 = (nl) ((Object) stackIn_26_0);
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L7;
                } else {
                  stackOut_25_0 = (nl) ((Object) stackIn_25_0);
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = 8;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L7;
                }
              }
              L8: {
                stackOut_27_0 = (nl) ((Object) stackIn_27_0);
                stackOut_27_1 = stackIn_27_1;
                stackOut_27_2 = stackIn_27_2;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_29_2 = stackOut_27_2;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                if (param3.field_M <= param2) {
                  stackOut_29_0 = (nl) ((Object) stackIn_29_0);
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = stackIn_29_2;
                  stackOut_29_3 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  stackIn_30_3 = stackOut_29_3;
                  break L8;
                } else {
                  stackOut_28_0 = (nl) ((Object) stackIn_28_0);
                  stackOut_28_1 = stackIn_28_1;
                  stackOut_28_2 = stackIn_28_2;
                  stackOut_28_3 = 2;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  stackIn_30_3 = stackOut_28_3;
                  break L8;
                }
              }
              L9: {
                stackOut_30_0 = (nl) ((Object) stackIn_30_0);
                stackOut_30_1 = stackIn_30_1 | (stackIn_30_2 | stackIn_30_3);
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (param3.field_w > param4) {
                  stackOut_32_0 = (nl) ((Object) stackIn_32_0);
                  stackOut_32_1 = stackIn_32_1;
                  stackOut_32_2 = 4;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L9;
                } else {
                  stackOut_31_0 = (nl) ((Object) stackIn_31_0);
                  stackOut_31_1 = stackIn_31_1;
                  stackOut_31_2 = 0;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  break L9;
                }
              }
              stackIn_33_0.field_G = stackIn_33_1 | stackIn_33_2;
              stackOut_33_0 = 0;
              stackIn_34_0 = stackOut_33_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var5);
            stackOut_35_1 = new StringBuilder().append("tc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_20_0 != 0;
          } else {
            return stackIn_34_0 != 0;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (!(param0)) {
            param3 = 0;
        }
        ir.a(rv.field_c[param2][param3][2], -88, rv.field_c[param2][param3][5], rv.field_c[param2][param3][4], rv.field_c[param2][param3][1], rv.field_c[param2][param3][0], rv.field_c[param2][param3][3]);
        ic.a(rv.field_c[param2][param3][4], rv.field_c[param2][param3][5], rv.field_c[param2][param3][3], rv.field_c[param2][param3][0], rv.field_c[param2][param3][2], (byte) -113, rv.field_c[param2][param3][1]);
        if (param1 != 8710) {
            nl var5 = (nl) null;
            discarded$0 = tc.a(117, (byte) -18, -15, (nl) null, 51);
            return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Kickabout.field_G;
        if (null != this.field_n) {
          var2 = 0;
          L0: while (true) {
            if (this.field_n.length <= var2) {
              if (param0 < -81) {
                if (null != this.field_o) {
                  var4 = 0;
                  var2 = var4;
                  L1: while (true) {
                    if (var4 >= this.field_o.length) {
                      return;
                    } else {
                      this.field_o[var4] = hf.a(this.field_o[var4], 32768);
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_n[var2] = hf.a(this.field_n[var2], 32768);
              var2++;
              continue L0;
            }
          }
        } else {
          if (param0 < -81) {
            if (null != this.field_o) {
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 < this.field_o.length) {
                  this.field_o[var4] = hf.a(this.field_o[var4], 32768);
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(iw param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.h((byte) -125);
              if (var3_int != 0) {
                this.a(var3_int, false, param0);
                continue L1;
              } else {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    this.field_r = (String) null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("tc.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    tc() {
        this.field_t = false;
    }

    static {
        field_s = false;
    }
}
