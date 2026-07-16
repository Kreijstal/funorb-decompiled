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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        char[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        char[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        char[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        char[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        char stackOut_22_2 = 0;
        char[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        var7 = Kickabout.field_G;
        if (-2 == (param0 ^ -1)) {
          ((tc) this).field_r = param2.a(-118);
          if (!param1) {
            return;
          } else {
            tc.a(true, 105, -26, -11);
            return;
          }
        } else {
          L0: {
            if (-3 == (param0 ^ -1)) {
              var4 = param2.h((byte) -105);
              ((tc) this).field_o = new int[var4];
              ((tc) this).field_q = new char[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  L2: {
                    ((tc) this).field_o[var5] = param2.a((byte) 81);
                    var6 = param2.j((byte) -65);
                    stackOut_20_0 = ((tc) this).field_q;
                    stackOut_20_1 = var5;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (var6 != 0) {
                      stackOut_22_0 = (char[]) (Object) stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = nl.a(false, (byte) var6);
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      break L2;
                    } else {
                      stackOut_21_0 = (char[]) (Object) stackIn_21_0;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = 0;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      break L2;
                    }
                  }
                  stackIn_23_0[stackIn_23_1] = (char) stackIn_23_2;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (3 == param0) {
                var4 = param2.h((byte) -109);
                ((tc) this).field_n = new int[var4];
                ((tc) this).field_p = new char[var4];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    L4: {
                      ((tc) this).field_n[var5] = param2.a((byte) 81);
                      var6 = param2.j((byte) -81);
                      stackOut_14_0 = ((tc) this).field_p;
                      stackOut_14_1 = var5;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (0 != var6) {
                        stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = nl.a(false, (byte) var6);
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L4;
                      } else {
                        stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L4;
                      }
                    }
                    stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if ((param0 ^ -1) == -5) {
                  ((tc) this).field_t = true;
                  if (param1) {
                    tc.a(true, 105, -26, -11);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!param1) {
                    return;
                  } else {
                    tc.a(true, 105, -26, -11);
                    return;
                  }
                }
              }
            }
          }
          if (!param1) {
            return;
          } else {
            tc.a(true, 105, -26, -11);
            return;
          }
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
              if ((param0 ^ -1) < (ua.field_l ^ -1)) {
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
                  if ((cf.field_Db - -dc.field_d ^ -1) == (param0 ^ -1)) {
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
                    if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                      break L5;
                    } else {
                      if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
          if ((cf.field_Db - -dc.field_d ^ -1) == (param0 ^ -1)) {
            if (-1 == (dc.field_d ^ -1)) {
              if (-2 <= (wm.field_s ^ -1)) {
                L6: {
                  if (wt.field_x <= qj.field_e) {
                    break L6;
                  } else {
                    if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                      break L6;
                    } else {
                      if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
                    if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                      break L7;
                    } else {
                      if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
                    if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                      break L8;
                    } else {
                      if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
                    if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                      break L9;
                    } else {
                      if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
                      if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                        break L11;
                      } else {
                        if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
                      if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                        break L12;
                      } else {
                        if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
              if ((vo.field_cb.field_q + qj.field_e ^ -1) < (wt.field_x ^ -1)) {
                L13: {
                  if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
              if ((param0 ^ -1) < (ua.field_l ^ -1)) {
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
            if ((cf.field_Db - -dc.field_d ^ -1) != (param0 ^ -1)) {
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
                  if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                    break L18;
                  } else {
                    if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
                  if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                    break L20;
                  } else {
                    if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
              if ((cf.field_Db - -dc.field_d ^ -1) == (param0 ^ -1)) {
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
                if ((vo.field_cb.field_q + qj.field_e ^ -1) >= (wt.field_x ^ -1)) {
                  break L23;
                } else {
                  if ((bi.field_i ^ -1) <= (us.field_j ^ -1)) {
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
        nl stackIn_19_0 = null;
        nl stackIn_20_0 = null;
        nl stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        nl stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        nl stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        nl stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        nl stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        nl stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        nl stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        nl stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        nl stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        nl stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        nl stackIn_44_0 = null;
        nl stackIn_45_0 = null;
        nl stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        nl stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        nl stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        nl stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        nl stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        nl stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        nl stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        nl stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        nl stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        nl stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        nl stackIn_66_0 = null;
        nl stackIn_67_0 = null;
        nl stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        nl stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        nl stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        nl stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        nl stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        nl stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        nl stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        nl stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        nl stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        nl stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        nl stackIn_86_0 = null;
        nl stackIn_87_0 = null;
        nl stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        nl stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        nl stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        nl stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        nl stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        nl stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        nl stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        nl stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        nl stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        nl stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        nl stackIn_104_0 = null;
        nl stackIn_105_0 = null;
        nl stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        nl stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        nl stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        nl stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        nl stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        nl stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        nl stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        nl stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        nl stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        nl stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        nl stackIn_126_0 = null;
        nl stackIn_127_0 = null;
        nl stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        nl stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        nl stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        nl stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        nl stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        nl stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        nl stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        nl stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        nl stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        nl stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        nl stackIn_144_0 = null;
        nl stackIn_145_0 = null;
        nl stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        nl stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        nl stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        nl stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        nl stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        nl stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int stackIn_151_2 = 0;
        nl stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        int stackIn_152_3 = 0;
        nl stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        nl stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        nl stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        nl stackIn_164_0 = null;
        nl stackIn_165_0 = null;
        nl stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        nl stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        nl stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        nl stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        int stackIn_169_2 = 0;
        nl stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        int stackIn_170_2 = 0;
        nl stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        int stackIn_171_2 = 0;
        nl stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        int stackIn_172_2 = 0;
        int stackIn_172_3 = 0;
        nl stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        nl stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        nl stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        int stackIn_175_2 = 0;
        nl stackIn_183_0 = null;
        nl stackIn_184_0 = null;
        nl stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        nl stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        nl stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        nl stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        nl stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        int stackIn_189_2 = 0;
        nl stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        nl stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        int stackIn_191_2 = 0;
        int stackIn_191_3 = 0;
        nl stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        nl stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        nl stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        int stackIn_194_2 = 0;
        nl stackIn_201_0 = null;
        nl stackIn_202_0 = null;
        nl stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        nl stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        nl stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        nl stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        nl stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        nl stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        nl stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        int stackIn_209_2 = 0;
        int stackIn_209_3 = 0;
        nl stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        nl stackIn_211_0 = null;
        int stackIn_211_1 = 0;
        nl stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        int stackIn_212_2 = 0;
        nl stackIn_221_0 = null;
        nl stackIn_222_0 = null;
        nl stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        nl stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        nl stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        nl stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        int stackIn_226_2 = 0;
        nl stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        int stackIn_227_2 = 0;
        nl stackIn_228_0 = null;
        int stackIn_228_1 = 0;
        int stackIn_228_2 = 0;
        nl stackIn_229_0 = null;
        int stackIn_229_1 = 0;
        int stackIn_229_2 = 0;
        int stackIn_229_3 = 0;
        nl stackIn_230_0 = null;
        int stackIn_230_1 = 0;
        nl stackIn_231_0 = null;
        int stackIn_231_1 = 0;
        nl stackIn_232_0 = null;
        int stackIn_232_1 = 0;
        int stackIn_232_2 = 0;
        nl stackIn_239_0 = null;
        nl stackIn_240_0 = null;
        nl stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        nl stackIn_242_0 = null;
        int stackIn_242_1 = 0;
        nl stackIn_243_0 = null;
        int stackIn_243_1 = 0;
        nl stackIn_244_0 = null;
        int stackIn_244_1 = 0;
        int stackIn_244_2 = 0;
        nl stackIn_245_0 = null;
        int stackIn_245_1 = 0;
        int stackIn_245_2 = 0;
        nl stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        nl stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        int stackIn_247_2 = 0;
        int stackIn_247_3 = 0;
        nl stackIn_248_0 = null;
        int stackIn_248_1 = 0;
        nl stackIn_249_0 = null;
        int stackIn_249_1 = 0;
        nl stackIn_250_0 = null;
        int stackIn_250_1 = 0;
        int stackIn_250_2 = 0;
        nl stackOut_18_0 = null;
        nl stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        nl stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        nl stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        nl stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        nl stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        nl stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        nl stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        nl stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        nl stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        nl stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        nl stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        nl stackOut_85_0 = null;
        nl stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        nl stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        nl stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        nl stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        nl stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        nl stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        nl stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        nl stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        nl stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        nl stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        nl stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        nl stackOut_103_0 = null;
        nl stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        nl stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        nl stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        nl stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        nl stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        nl stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        nl stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        nl stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        nl stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        nl stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        nl stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        nl stackOut_65_0 = null;
        nl stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        nl stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        nl stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        nl stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        nl stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        nl stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        nl stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        nl stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        nl stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        nl stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        nl stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        nl stackOut_43_0 = null;
        nl stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        nl stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        nl stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        nl stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        nl stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        nl stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        nl stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        nl stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        nl stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        nl stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        nl stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        nl stackOut_220_0 = null;
        nl stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        nl stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        nl stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        nl stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        int stackOut_225_2 = 0;
        nl stackOut_224_0 = null;
        int stackOut_224_1 = 0;
        int stackOut_224_2 = 0;
        nl stackOut_226_0 = null;
        int stackOut_226_1 = 0;
        int stackOut_226_2 = 0;
        nl stackOut_228_0 = null;
        int stackOut_228_1 = 0;
        int stackOut_228_2 = 0;
        int stackOut_228_3 = 0;
        nl stackOut_227_0 = null;
        int stackOut_227_1 = 0;
        int stackOut_227_2 = 0;
        int stackOut_227_3 = 0;
        nl stackOut_229_0 = null;
        int stackOut_229_1 = 0;
        nl stackOut_231_0 = null;
        int stackOut_231_1 = 0;
        int stackOut_231_2 = 0;
        nl stackOut_230_0 = null;
        int stackOut_230_1 = 0;
        int stackOut_230_2 = 0;
        nl stackOut_238_0 = null;
        nl stackOut_240_0 = null;
        int stackOut_240_1 = 0;
        nl stackOut_239_0 = null;
        int stackOut_239_1 = 0;
        nl stackOut_241_0 = null;
        int stackOut_241_1 = 0;
        nl stackOut_243_0 = null;
        int stackOut_243_1 = 0;
        int stackOut_243_2 = 0;
        nl stackOut_242_0 = null;
        int stackOut_242_1 = 0;
        int stackOut_242_2 = 0;
        nl stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        int stackOut_244_2 = 0;
        nl stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        int stackOut_246_2 = 0;
        int stackOut_246_3 = 0;
        nl stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        int stackOut_245_2 = 0;
        int stackOut_245_3 = 0;
        nl stackOut_247_0 = null;
        int stackOut_247_1 = 0;
        nl stackOut_249_0 = null;
        int stackOut_249_1 = 0;
        int stackOut_249_2 = 0;
        nl stackOut_248_0 = null;
        int stackOut_248_1 = 0;
        int stackOut_248_2 = 0;
        nl stackOut_200_0 = null;
        nl stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        nl stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        nl stackOut_203_0 = null;
        int stackOut_203_1 = 0;
        nl stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        nl stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        nl stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        nl stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        int stackOut_208_2 = 0;
        int stackOut_208_3 = 0;
        nl stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        int stackOut_207_3 = 0;
        nl stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        nl stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        int stackOut_211_2 = 0;
        nl stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        int stackOut_210_2 = 0;
        nl stackOut_182_0 = null;
        nl stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        nl stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        nl stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        nl stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        nl stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        nl stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        nl stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        int stackOut_190_2 = 0;
        int stackOut_190_3 = 0;
        nl stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        int stackOut_189_3 = 0;
        nl stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        nl stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        int stackOut_193_2 = 0;
        nl stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        int stackOut_192_2 = 0;
        nl stackOut_163_0 = null;
        nl stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        nl stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        nl stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        nl stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        int stackOut_168_2 = 0;
        nl stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        nl stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        int stackOut_169_2 = 0;
        nl stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        int stackOut_171_2 = 0;
        int stackOut_171_3 = 0;
        nl stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        int stackOut_170_2 = 0;
        int stackOut_170_3 = 0;
        nl stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        nl stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        nl stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        int stackOut_173_2 = 0;
        nl stackOut_125_0 = null;
        nl stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        nl stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        nl stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        nl stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        nl stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        nl stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        nl stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        nl stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        nl stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        nl stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        nl stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        nl stackOut_143_0 = null;
        nl stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        nl stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        nl stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        nl stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        nl stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        nl stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        nl stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_151_2 = 0;
        int stackOut_151_3 = 0;
        nl stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        int stackOut_150_3 = 0;
        nl stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        nl stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        nl stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        L0: {
          if ((param3.field_G & 8) == 0) {
            break L0;
          } else {
            if (param2 < param3.field_M) {
              param3.field_M = param2;
              break L0;
            } else {
              L1: {
                if ((4 & param3.field_G) == 0) {
                  if ((2 & param3.field_G) == 0) {
                    break L1;
                  } else {
                    if (param2 <= param3.field_M) {
                      break L1;
                    } else {
                      param3.field_M = param2;
                      break L1;
                    }
                  }
                } else {
                  if ((2 & param3.field_G) == 0) {
                    break L1;
                  } else {
                    if (param2 <= param3.field_M) {
                      break L1;
                    } else {
                      param3.field_M = param2;
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (-1 == (param3.field_G & 1 ^ -1)) {
                  break L2;
                } else {
                  if (param3.field_w <= param4) {
                    break L2;
                  } else {
                    param3.field_w = param4;
                    break L2;
                  }
                }
              }
              if (param1 > 80) {
                L3: {
                  if (param2 != param3.field_M) {
                    break L3;
                  } else {
                    if (param3.field_w != param4) {
                      break L3;
                    } else {
                      param3.field_G = 0;
                      param3.a(param0, 26214);
                      return true;
                    }
                  }
                }
                L4: {
                  stackOut_18_0 = (nl) param3;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (param4 > param3.field_w) {
                    stackOut_20_0 = (nl) (Object) stackIn_20_0;
                    stackOut_20_1 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L4;
                  } else {
                    stackOut_19_0 = (nl) (Object) stackIn_19_0;
                    stackOut_19_1 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L4;
                  }
                }
                L5: {
                  stackOut_21_0 = (nl) (Object) stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (param3.field_M >= param2) {
                    stackOut_23_0 = (nl) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    break L5;
                  } else {
                    stackOut_22_0 = (nl) (Object) stackIn_22_0;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = 8;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    break L5;
                  }
                }
                L6: {
                  stackOut_24_0 = (nl) (Object) stackIn_24_0;
                  stackOut_24_1 = stackIn_24_1;
                  stackOut_24_2 = stackIn_24_2;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  if (param3.field_M <= param2) {
                    stackOut_26_0 = (nl) (Object) stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    break L6;
                  } else {
                    stackOut_25_0 = (nl) (Object) stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = 2;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    break L6;
                  }
                }
                L7: {
                  stackOut_27_0 = (nl) (Object) stackIn_27_0;
                  stackOut_27_1 = stackIn_27_1 | (stackIn_27_2 | stackIn_27_3);
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (param3.field_w > param4) {
                    stackOut_29_0 = (nl) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = 4;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    break L7;
                  } else {
                    stackOut_28_0 = (nl) (Object) stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 0;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    break L7;
                  }
                }
                stackIn_30_0.field_G = stackIn_30_1 | stackIn_30_2;
                return false;
              } else {
                return true;
              }
            }
          }
        }
        L8: {
          if ((4 & param3.field_G) == 0) {
            break L8;
          } else {
            if (param3.field_w < param4) {
              param3.field_w = param4;
              break L8;
            } else {
              if ((2 & param3.field_G) != 0) {
                if (param2 > param3.field_M) {
                  L9: {
                    param3.field_M = param2;
                    if (-1 == (param3.field_G & 1 ^ -1)) {
                      break L9;
                    } else {
                      if (param3.field_w <= param4) {
                        break L9;
                      } else {
                        param3.field_w = param4;
                        if (param1 > 80) {
                          L10: {
                            if (param2 != param3.field_M) {
                              break L10;
                            } else {
                              if (param3.field_w != param4) {
                                break L10;
                              } else {
                                param3.field_G = 0;
                                param3.a(param0, 26214);
                                return true;
                              }
                            }
                          }
                          L11: {
                            stackOut_85_0 = (nl) param3;
                            stackIn_87_0 = stackOut_85_0;
                            stackIn_86_0 = stackOut_85_0;
                            if (param4 > param3.field_w) {
                              stackOut_87_0 = (nl) (Object) stackIn_87_0;
                              stackOut_87_1 = 1;
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              break L11;
                            } else {
                              stackOut_86_0 = (nl) (Object) stackIn_86_0;
                              stackOut_86_1 = 0;
                              stackIn_88_0 = stackOut_86_0;
                              stackIn_88_1 = stackOut_86_1;
                              break L11;
                            }
                          }
                          L12: {
                            stackOut_88_0 = (nl) (Object) stackIn_88_0;
                            stackOut_88_1 = stackIn_88_1;
                            stackIn_90_0 = stackOut_88_0;
                            stackIn_90_1 = stackOut_88_1;
                            stackIn_89_0 = stackOut_88_0;
                            stackIn_89_1 = stackOut_88_1;
                            if (param3.field_M >= param2) {
                              stackOut_90_0 = (nl) (Object) stackIn_90_0;
                              stackOut_90_1 = stackIn_90_1;
                              stackOut_90_2 = 0;
                              stackIn_91_0 = stackOut_90_0;
                              stackIn_91_1 = stackOut_90_1;
                              stackIn_91_2 = stackOut_90_2;
                              break L12;
                            } else {
                              stackOut_89_0 = (nl) (Object) stackIn_89_0;
                              stackOut_89_1 = stackIn_89_1;
                              stackOut_89_2 = 8;
                              stackIn_91_0 = stackOut_89_0;
                              stackIn_91_1 = stackOut_89_1;
                              stackIn_91_2 = stackOut_89_2;
                              break L12;
                            }
                          }
                          L13: {
                            stackOut_91_0 = (nl) (Object) stackIn_91_0;
                            stackOut_91_1 = stackIn_91_1;
                            stackOut_91_2 = stackIn_91_2;
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            stackIn_93_2 = stackOut_91_2;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            stackIn_92_2 = stackOut_91_2;
                            if (param3.field_M <= param2) {
                              stackOut_93_0 = (nl) (Object) stackIn_93_0;
                              stackOut_93_1 = stackIn_93_1;
                              stackOut_93_2 = stackIn_93_2;
                              stackOut_93_3 = 0;
                              stackIn_94_0 = stackOut_93_0;
                              stackIn_94_1 = stackOut_93_1;
                              stackIn_94_2 = stackOut_93_2;
                              stackIn_94_3 = stackOut_93_3;
                              break L13;
                            } else {
                              stackOut_92_0 = (nl) (Object) stackIn_92_0;
                              stackOut_92_1 = stackIn_92_1;
                              stackOut_92_2 = stackIn_92_2;
                              stackOut_92_3 = 2;
                              stackIn_94_0 = stackOut_92_0;
                              stackIn_94_1 = stackOut_92_1;
                              stackIn_94_2 = stackOut_92_2;
                              stackIn_94_3 = stackOut_92_3;
                              break L13;
                            }
                          }
                          L14: {
                            stackOut_94_0 = (nl) (Object) stackIn_94_0;
                            stackOut_94_1 = stackIn_94_1 | (stackIn_94_2 | stackIn_94_3);
                            stackIn_96_0 = stackOut_94_0;
                            stackIn_96_1 = stackOut_94_1;
                            stackIn_95_0 = stackOut_94_0;
                            stackIn_95_1 = stackOut_94_1;
                            if (param3.field_w > param4) {
                              stackOut_96_0 = (nl) (Object) stackIn_96_0;
                              stackOut_96_1 = stackIn_96_1;
                              stackOut_96_2 = 4;
                              stackIn_97_0 = stackOut_96_0;
                              stackIn_97_1 = stackOut_96_1;
                              stackIn_97_2 = stackOut_96_2;
                              break L14;
                            } else {
                              stackOut_95_0 = (nl) (Object) stackIn_95_0;
                              stackOut_95_1 = stackIn_95_1;
                              stackOut_95_2 = 0;
                              stackIn_97_0 = stackOut_95_0;
                              stackIn_97_1 = stackOut_95_1;
                              stackIn_97_2 = stackOut_95_2;
                              break L14;
                            }
                          }
                          stackIn_97_0.field_G = stackIn_97_1 | stackIn_97_2;
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  if (param1 > 80) {
                    L15: {
                      if (param2 != param3.field_M) {
                        break L15;
                      } else {
                        if (param3.field_w != param4) {
                          break L15;
                        } else {
                          param3.field_G = 0;
                          param3.a(param0, 26214);
                          return true;
                        }
                      }
                    }
                    L16: {
                      stackOut_103_0 = (nl) param3;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_104_0 = stackOut_103_0;
                      if (param4 > param3.field_w) {
                        stackOut_105_0 = (nl) (Object) stackIn_105_0;
                        stackOut_105_1 = 1;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        break L16;
                      } else {
                        stackOut_104_0 = (nl) (Object) stackIn_104_0;
                        stackOut_104_1 = 0;
                        stackIn_106_0 = stackOut_104_0;
                        stackIn_106_1 = stackOut_104_1;
                        break L16;
                      }
                    }
                    L17: {
                      stackOut_106_0 = (nl) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      if (param3.field_M >= param2) {
                        stackOut_108_0 = (nl) (Object) stackIn_108_0;
                        stackOut_108_1 = stackIn_108_1;
                        stackOut_108_2 = 0;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        stackIn_109_2 = stackOut_108_2;
                        break L17;
                      } else {
                        stackOut_107_0 = (nl) (Object) stackIn_107_0;
                        stackOut_107_1 = stackIn_107_1;
                        stackOut_107_2 = 8;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        stackIn_109_2 = stackOut_107_2;
                        break L17;
                      }
                    }
                    L18: {
                      stackOut_109_0 = (nl) (Object) stackIn_109_0;
                      stackOut_109_1 = stackIn_109_1;
                      stackOut_109_2 = stackIn_109_2;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      stackIn_111_2 = stackOut_109_2;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      stackIn_110_2 = stackOut_109_2;
                      if (param3.field_M <= param2) {
                        stackOut_111_0 = (nl) (Object) stackIn_111_0;
                        stackOut_111_1 = stackIn_111_1;
                        stackOut_111_2 = stackIn_111_2;
                        stackOut_111_3 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        break L18;
                      } else {
                        stackOut_110_0 = (nl) (Object) stackIn_110_0;
                        stackOut_110_1 = stackIn_110_1;
                        stackOut_110_2 = stackIn_110_2;
                        stackOut_110_3 = 2;
                        stackIn_112_0 = stackOut_110_0;
                        stackIn_112_1 = stackOut_110_1;
                        stackIn_112_2 = stackOut_110_2;
                        stackIn_112_3 = stackOut_110_3;
                        break L18;
                      }
                    }
                    L19: {
                      stackOut_112_0 = (nl) (Object) stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1 | (stackIn_112_2 | stackIn_112_3);
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      if (param3.field_w > param4) {
                        stackOut_114_0 = (nl) (Object) stackIn_114_0;
                        stackOut_114_1 = stackIn_114_1;
                        stackOut_114_2 = 4;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        stackIn_115_2 = stackOut_114_2;
                        break L19;
                      } else {
                        stackOut_113_0 = (nl) (Object) stackIn_113_0;
                        stackOut_113_1 = stackIn_113_1;
                        stackOut_113_2 = 0;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        stackIn_115_2 = stackOut_113_2;
                        break L19;
                      }
                    }
                    stackIn_115_0.field_G = stackIn_115_1 | stackIn_115_2;
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  L20: {
                    if (-1 == (param3.field_G & 1 ^ -1)) {
                      break L20;
                    } else {
                      if (param3.field_w <= param4) {
                        break L20;
                      } else {
                        param3.field_w = param4;
                        break L20;
                      }
                    }
                  }
                  if (param1 > 80) {
                    L21: {
                      if (param2 != param3.field_M) {
                        break L21;
                      } else {
                        if (param3.field_w != param4) {
                          break L21;
                        } else {
                          param3.field_G = 0;
                          param3.a(param0, 26214);
                          return true;
                        }
                      }
                    }
                    L22: {
                      stackOut_65_0 = (nl) param3;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      if (param4 > param3.field_w) {
                        stackOut_67_0 = (nl) (Object) stackIn_67_0;
                        stackOut_67_1 = 1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        break L22;
                      } else {
                        stackOut_66_0 = (nl) (Object) stackIn_66_0;
                        stackOut_66_1 = 0;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        break L22;
                      }
                    }
                    L23: {
                      stackOut_68_0 = (nl) (Object) stackIn_68_0;
                      stackOut_68_1 = stackIn_68_1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      if (param3.field_M >= param2) {
                        stackOut_70_0 = (nl) (Object) stackIn_70_0;
                        stackOut_70_1 = stackIn_70_1;
                        stackOut_70_2 = 0;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        stackIn_71_2 = stackOut_70_2;
                        break L23;
                      } else {
                        stackOut_69_0 = (nl) (Object) stackIn_69_0;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = 8;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        stackIn_71_2 = stackOut_69_2;
                        break L23;
                      }
                    }
                    L24: {
                      stackOut_71_0 = (nl) (Object) stackIn_71_0;
                      stackOut_71_1 = stackIn_71_1;
                      stackOut_71_2 = stackIn_71_2;
                      stackIn_73_0 = stackOut_71_0;
                      stackIn_73_1 = stackOut_71_1;
                      stackIn_73_2 = stackOut_71_2;
                      stackIn_72_0 = stackOut_71_0;
                      stackIn_72_1 = stackOut_71_1;
                      stackIn_72_2 = stackOut_71_2;
                      if (param3.field_M <= param2) {
                        stackOut_73_0 = (nl) (Object) stackIn_73_0;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = stackIn_73_2;
                        stackOut_73_3 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        stackIn_74_3 = stackOut_73_3;
                        break L24;
                      } else {
                        stackOut_72_0 = (nl) (Object) stackIn_72_0;
                        stackOut_72_1 = stackIn_72_1;
                        stackOut_72_2 = stackIn_72_2;
                        stackOut_72_3 = 2;
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_74_1 = stackOut_72_1;
                        stackIn_74_2 = stackOut_72_2;
                        stackIn_74_3 = stackOut_72_3;
                        break L24;
                      }
                    }
                    L25: {
                      stackOut_74_0 = (nl) (Object) stackIn_74_0;
                      stackOut_74_1 = stackIn_74_1 | (stackIn_74_2 | stackIn_74_3);
                      stackIn_76_0 = stackOut_74_0;
                      stackIn_76_1 = stackOut_74_1;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      if (param3.field_w > param4) {
                        stackOut_76_0 = (nl) (Object) stackIn_76_0;
                        stackOut_76_1 = stackIn_76_1;
                        stackOut_76_2 = 4;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        stackIn_77_2 = stackOut_76_2;
                        break L25;
                      } else {
                        stackOut_75_0 = (nl) (Object) stackIn_75_0;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = 0;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        stackIn_77_2 = stackOut_75_2;
                        break L25;
                      }
                    }
                    stackIn_77_0.field_G = stackIn_77_1 | stackIn_77_2;
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                L26: {
                  if (-1 == (param3.field_G & 1 ^ -1)) {
                    break L26;
                  } else {
                    if (param3.field_w <= param4) {
                      break L26;
                    } else {
                      param3.field_w = param4;
                      break L26;
                    }
                  }
                }
                if (param1 > 80) {
                  L27: {
                    if (param2 != param3.field_M) {
                      break L27;
                    } else {
                      if (param3.field_w != param4) {
                        break L27;
                      } else {
                        param3.field_G = 0;
                        param3.a(param0, 26214);
                        return true;
                      }
                    }
                  }
                  L28: {
                    stackOut_43_0 = (nl) param3;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (param4 > param3.field_w) {
                      stackOut_45_0 = (nl) (Object) stackIn_45_0;
                      stackOut_45_1 = 1;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      break L28;
                    } else {
                      stackOut_44_0 = (nl) (Object) stackIn_44_0;
                      stackOut_44_1 = 0;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      break L28;
                    }
                  }
                  L29: {
                    stackOut_46_0 = (nl) (Object) stackIn_46_0;
                    stackOut_46_1 = stackIn_46_1;
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (param3.field_M >= param2) {
                      stackOut_48_0 = (nl) (Object) stackIn_48_0;
                      stackOut_48_1 = stackIn_48_1;
                      stackOut_48_2 = 0;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      stackIn_49_2 = stackOut_48_2;
                      break L29;
                    } else {
                      stackOut_47_0 = (nl) (Object) stackIn_47_0;
                      stackOut_47_1 = stackIn_47_1;
                      stackOut_47_2 = 8;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_49_2 = stackOut_47_2;
                      break L29;
                    }
                  }
                  L30: {
                    stackOut_49_0 = (nl) (Object) stackIn_49_0;
                    stackOut_49_1 = stackIn_49_1;
                    stackOut_49_2 = stackIn_49_2;
                    stackIn_51_0 = stackOut_49_0;
                    stackIn_51_1 = stackOut_49_1;
                    stackIn_51_2 = stackOut_49_2;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    if (param3.field_M <= param2) {
                      stackOut_51_0 = (nl) (Object) stackIn_51_0;
                      stackOut_51_1 = stackIn_51_1;
                      stackOut_51_2 = stackIn_51_2;
                      stackOut_51_3 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      stackIn_52_2 = stackOut_51_2;
                      stackIn_52_3 = stackOut_51_3;
                      break L30;
                    } else {
                      stackOut_50_0 = (nl) (Object) stackIn_50_0;
                      stackOut_50_1 = stackIn_50_1;
                      stackOut_50_2 = stackIn_50_2;
                      stackOut_50_3 = 2;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_52_2 = stackOut_50_2;
                      stackIn_52_3 = stackOut_50_3;
                      break L30;
                    }
                  }
                  L31: {
                    stackOut_52_0 = (nl) (Object) stackIn_52_0;
                    stackOut_52_1 = stackIn_52_1 | (stackIn_52_2 | stackIn_52_3);
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    if (param3.field_w > param4) {
                      stackOut_54_0 = (nl) (Object) stackIn_54_0;
                      stackOut_54_1 = stackIn_54_1;
                      stackOut_54_2 = 4;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      stackIn_55_2 = stackOut_54_2;
                      break L31;
                    } else {
                      stackOut_53_0 = (nl) (Object) stackIn_53_0;
                      stackOut_53_1 = stackIn_53_1;
                      stackOut_53_2 = 0;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_55_1 = stackOut_53_1;
                      stackIn_55_2 = stackOut_53_2;
                      break L31;
                    }
                  }
                  stackIn_55_0.field_G = stackIn_55_1 | stackIn_55_2;
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        }
        if ((2 & param3.field_G) != 0) {
          if (param2 > param3.field_M) {
            L32: {
              param3.field_M = param2;
              if (-1 == (param3.field_G & 1 ^ -1)) {
                break L32;
              } else {
                if (param3.field_w <= param4) {
                  break L32;
                } else {
                  param3.field_w = param4;
                  if (param1 > 80) {
                    L33: {
                      if (param2 != param3.field_M) {
                        break L33;
                      } else {
                        if (param3.field_w != param4) {
                          break L33;
                        } else {
                          param3.field_G = 0;
                          param3.a(param0, 26214);
                          return true;
                        }
                      }
                    }
                    L34: {
                      stackOut_220_0 = (nl) param3;
                      stackIn_222_0 = stackOut_220_0;
                      stackIn_221_0 = stackOut_220_0;
                      if (param4 > param3.field_w) {
                        stackOut_222_0 = (nl) (Object) stackIn_222_0;
                        stackOut_222_1 = 1;
                        stackIn_223_0 = stackOut_222_0;
                        stackIn_223_1 = stackOut_222_1;
                        break L34;
                      } else {
                        stackOut_221_0 = (nl) (Object) stackIn_221_0;
                        stackOut_221_1 = 0;
                        stackIn_223_0 = stackOut_221_0;
                        stackIn_223_1 = stackOut_221_1;
                        break L34;
                      }
                    }
                    L35: {
                      stackOut_223_0 = (nl) (Object) stackIn_223_0;
                      stackOut_223_1 = stackIn_223_1;
                      stackIn_225_0 = stackOut_223_0;
                      stackIn_225_1 = stackOut_223_1;
                      stackIn_224_0 = stackOut_223_0;
                      stackIn_224_1 = stackOut_223_1;
                      if (param3.field_M >= param2) {
                        stackOut_225_0 = (nl) (Object) stackIn_225_0;
                        stackOut_225_1 = stackIn_225_1;
                        stackOut_225_2 = 0;
                        stackIn_226_0 = stackOut_225_0;
                        stackIn_226_1 = stackOut_225_1;
                        stackIn_226_2 = stackOut_225_2;
                        break L35;
                      } else {
                        stackOut_224_0 = (nl) (Object) stackIn_224_0;
                        stackOut_224_1 = stackIn_224_1;
                        stackOut_224_2 = 8;
                        stackIn_226_0 = stackOut_224_0;
                        stackIn_226_1 = stackOut_224_1;
                        stackIn_226_2 = stackOut_224_2;
                        break L35;
                      }
                    }
                    L36: {
                      stackOut_226_0 = (nl) (Object) stackIn_226_0;
                      stackOut_226_1 = stackIn_226_1;
                      stackOut_226_2 = stackIn_226_2;
                      stackIn_228_0 = stackOut_226_0;
                      stackIn_228_1 = stackOut_226_1;
                      stackIn_228_2 = stackOut_226_2;
                      stackIn_227_0 = stackOut_226_0;
                      stackIn_227_1 = stackOut_226_1;
                      stackIn_227_2 = stackOut_226_2;
                      if (param3.field_M <= param2) {
                        stackOut_228_0 = (nl) (Object) stackIn_228_0;
                        stackOut_228_1 = stackIn_228_1;
                        stackOut_228_2 = stackIn_228_2;
                        stackOut_228_3 = 0;
                        stackIn_229_0 = stackOut_228_0;
                        stackIn_229_1 = stackOut_228_1;
                        stackIn_229_2 = stackOut_228_2;
                        stackIn_229_3 = stackOut_228_3;
                        break L36;
                      } else {
                        stackOut_227_0 = (nl) (Object) stackIn_227_0;
                        stackOut_227_1 = stackIn_227_1;
                        stackOut_227_2 = stackIn_227_2;
                        stackOut_227_3 = 2;
                        stackIn_229_0 = stackOut_227_0;
                        stackIn_229_1 = stackOut_227_1;
                        stackIn_229_2 = stackOut_227_2;
                        stackIn_229_3 = stackOut_227_3;
                        break L36;
                      }
                    }
                    L37: {
                      stackOut_229_0 = (nl) (Object) stackIn_229_0;
                      stackOut_229_1 = stackIn_229_1 | (stackIn_229_2 | stackIn_229_3);
                      stackIn_231_0 = stackOut_229_0;
                      stackIn_231_1 = stackOut_229_1;
                      stackIn_230_0 = stackOut_229_0;
                      stackIn_230_1 = stackOut_229_1;
                      if (param3.field_w > param4) {
                        stackOut_231_0 = (nl) (Object) stackIn_231_0;
                        stackOut_231_1 = stackIn_231_1;
                        stackOut_231_2 = 4;
                        stackIn_232_0 = stackOut_231_0;
                        stackIn_232_1 = stackOut_231_1;
                        stackIn_232_2 = stackOut_231_2;
                        break L37;
                      } else {
                        stackOut_230_0 = (nl) (Object) stackIn_230_0;
                        stackOut_230_1 = stackIn_230_1;
                        stackOut_230_2 = 0;
                        stackIn_232_0 = stackOut_230_0;
                        stackIn_232_1 = stackOut_230_1;
                        stackIn_232_2 = stackOut_230_2;
                        break L37;
                      }
                    }
                    stackIn_232_0.field_G = stackIn_232_1 | stackIn_232_2;
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param1 > 80) {
              L38: {
                if (param2 != param3.field_M) {
                  break L38;
                } else {
                  if (param3.field_w != param4) {
                    break L38;
                  } else {
                    param3.field_G = 0;
                    param3.a(param0, 26214);
                    return true;
                  }
                }
              }
              L39: {
                stackOut_238_0 = (nl) param3;
                stackIn_240_0 = stackOut_238_0;
                stackIn_239_0 = stackOut_238_0;
                if (param4 > param3.field_w) {
                  stackOut_240_0 = (nl) (Object) stackIn_240_0;
                  stackOut_240_1 = 1;
                  stackIn_241_0 = stackOut_240_0;
                  stackIn_241_1 = stackOut_240_1;
                  break L39;
                } else {
                  stackOut_239_0 = (nl) (Object) stackIn_239_0;
                  stackOut_239_1 = 0;
                  stackIn_241_0 = stackOut_239_0;
                  stackIn_241_1 = stackOut_239_1;
                  break L39;
                }
              }
              L40: {
                stackOut_241_0 = (nl) (Object) stackIn_241_0;
                stackOut_241_1 = stackIn_241_1;
                stackIn_243_0 = stackOut_241_0;
                stackIn_243_1 = stackOut_241_1;
                stackIn_242_0 = stackOut_241_0;
                stackIn_242_1 = stackOut_241_1;
                if (param3.field_M >= param2) {
                  stackOut_243_0 = (nl) (Object) stackIn_243_0;
                  stackOut_243_1 = stackIn_243_1;
                  stackOut_243_2 = 0;
                  stackIn_244_0 = stackOut_243_0;
                  stackIn_244_1 = stackOut_243_1;
                  stackIn_244_2 = stackOut_243_2;
                  break L40;
                } else {
                  stackOut_242_0 = (nl) (Object) stackIn_242_0;
                  stackOut_242_1 = stackIn_242_1;
                  stackOut_242_2 = 8;
                  stackIn_244_0 = stackOut_242_0;
                  stackIn_244_1 = stackOut_242_1;
                  stackIn_244_2 = stackOut_242_2;
                  break L40;
                }
              }
              L41: {
                stackOut_244_0 = (nl) (Object) stackIn_244_0;
                stackOut_244_1 = stackIn_244_1;
                stackOut_244_2 = stackIn_244_2;
                stackIn_246_0 = stackOut_244_0;
                stackIn_246_1 = stackOut_244_1;
                stackIn_246_2 = stackOut_244_2;
                stackIn_245_0 = stackOut_244_0;
                stackIn_245_1 = stackOut_244_1;
                stackIn_245_2 = stackOut_244_2;
                if (param3.field_M <= param2) {
                  stackOut_246_0 = (nl) (Object) stackIn_246_0;
                  stackOut_246_1 = stackIn_246_1;
                  stackOut_246_2 = stackIn_246_2;
                  stackOut_246_3 = 0;
                  stackIn_247_0 = stackOut_246_0;
                  stackIn_247_1 = stackOut_246_1;
                  stackIn_247_2 = stackOut_246_2;
                  stackIn_247_3 = stackOut_246_3;
                  break L41;
                } else {
                  stackOut_245_0 = (nl) (Object) stackIn_245_0;
                  stackOut_245_1 = stackIn_245_1;
                  stackOut_245_2 = stackIn_245_2;
                  stackOut_245_3 = 2;
                  stackIn_247_0 = stackOut_245_0;
                  stackIn_247_1 = stackOut_245_1;
                  stackIn_247_2 = stackOut_245_2;
                  stackIn_247_3 = stackOut_245_3;
                  break L41;
                }
              }
              L42: {
                stackOut_247_0 = (nl) (Object) stackIn_247_0;
                stackOut_247_1 = stackIn_247_1 | (stackIn_247_2 | stackIn_247_3);
                stackIn_249_0 = stackOut_247_0;
                stackIn_249_1 = stackOut_247_1;
                stackIn_248_0 = stackOut_247_0;
                stackIn_248_1 = stackOut_247_1;
                if (param3.field_w > param4) {
                  stackOut_249_0 = (nl) (Object) stackIn_249_0;
                  stackOut_249_1 = stackIn_249_1;
                  stackOut_249_2 = 4;
                  stackIn_250_0 = stackOut_249_0;
                  stackIn_250_1 = stackOut_249_1;
                  stackIn_250_2 = stackOut_249_2;
                  break L42;
                } else {
                  stackOut_248_0 = (nl) (Object) stackIn_248_0;
                  stackOut_248_1 = stackIn_248_1;
                  stackOut_248_2 = 0;
                  stackIn_250_0 = stackOut_248_0;
                  stackIn_250_1 = stackOut_248_1;
                  stackIn_250_2 = stackOut_248_2;
                  break L42;
                }
              }
              stackIn_250_0.field_G = stackIn_250_1 | stackIn_250_2;
              return false;
            } else {
              return true;
            }
          } else {
            if (-1 != (param3.field_G & 1 ^ -1)) {
              if (param3.field_w > param4) {
                param3.field_w = param4;
                if (param1 > 80) {
                  L43: {
                    if (param2 != param3.field_M) {
                      break L43;
                    } else {
                      if (param3.field_w != param4) {
                        break L43;
                      } else {
                        param3.field_G = 0;
                        param3.a(param0, 26214);
                        return true;
                      }
                    }
                  }
                  L44: {
                    stackOut_200_0 = (nl) param3;
                    stackIn_202_0 = stackOut_200_0;
                    stackIn_201_0 = stackOut_200_0;
                    if (param4 > param3.field_w) {
                      stackOut_202_0 = (nl) (Object) stackIn_202_0;
                      stackOut_202_1 = 1;
                      stackIn_203_0 = stackOut_202_0;
                      stackIn_203_1 = stackOut_202_1;
                      break L44;
                    } else {
                      stackOut_201_0 = (nl) (Object) stackIn_201_0;
                      stackOut_201_1 = 0;
                      stackIn_203_0 = stackOut_201_0;
                      stackIn_203_1 = stackOut_201_1;
                      break L44;
                    }
                  }
                  L45: {
                    stackOut_203_0 = (nl) (Object) stackIn_203_0;
                    stackOut_203_1 = stackIn_203_1;
                    stackIn_205_0 = stackOut_203_0;
                    stackIn_205_1 = stackOut_203_1;
                    stackIn_204_0 = stackOut_203_0;
                    stackIn_204_1 = stackOut_203_1;
                    if (param3.field_M >= param2) {
                      stackOut_205_0 = (nl) (Object) stackIn_205_0;
                      stackOut_205_1 = stackIn_205_1;
                      stackOut_205_2 = 0;
                      stackIn_206_0 = stackOut_205_0;
                      stackIn_206_1 = stackOut_205_1;
                      stackIn_206_2 = stackOut_205_2;
                      break L45;
                    } else {
                      stackOut_204_0 = (nl) (Object) stackIn_204_0;
                      stackOut_204_1 = stackIn_204_1;
                      stackOut_204_2 = 8;
                      stackIn_206_0 = stackOut_204_0;
                      stackIn_206_1 = stackOut_204_1;
                      stackIn_206_2 = stackOut_204_2;
                      break L45;
                    }
                  }
                  L46: {
                    stackOut_206_0 = (nl) (Object) stackIn_206_0;
                    stackOut_206_1 = stackIn_206_1;
                    stackOut_206_2 = stackIn_206_2;
                    stackIn_208_0 = stackOut_206_0;
                    stackIn_208_1 = stackOut_206_1;
                    stackIn_208_2 = stackOut_206_2;
                    stackIn_207_0 = stackOut_206_0;
                    stackIn_207_1 = stackOut_206_1;
                    stackIn_207_2 = stackOut_206_2;
                    if (param3.field_M <= param2) {
                      stackOut_208_0 = (nl) (Object) stackIn_208_0;
                      stackOut_208_1 = stackIn_208_1;
                      stackOut_208_2 = stackIn_208_2;
                      stackOut_208_3 = 0;
                      stackIn_209_0 = stackOut_208_0;
                      stackIn_209_1 = stackOut_208_1;
                      stackIn_209_2 = stackOut_208_2;
                      stackIn_209_3 = stackOut_208_3;
                      break L46;
                    } else {
                      stackOut_207_0 = (nl) (Object) stackIn_207_0;
                      stackOut_207_1 = stackIn_207_1;
                      stackOut_207_2 = stackIn_207_2;
                      stackOut_207_3 = 2;
                      stackIn_209_0 = stackOut_207_0;
                      stackIn_209_1 = stackOut_207_1;
                      stackIn_209_2 = stackOut_207_2;
                      stackIn_209_3 = stackOut_207_3;
                      break L46;
                    }
                  }
                  L47: {
                    stackOut_209_0 = (nl) (Object) stackIn_209_0;
                    stackOut_209_1 = stackIn_209_1 | (stackIn_209_2 | stackIn_209_3);
                    stackIn_211_0 = stackOut_209_0;
                    stackIn_211_1 = stackOut_209_1;
                    stackIn_210_0 = stackOut_209_0;
                    stackIn_210_1 = stackOut_209_1;
                    if (param3.field_w > param4) {
                      stackOut_211_0 = (nl) (Object) stackIn_211_0;
                      stackOut_211_1 = stackIn_211_1;
                      stackOut_211_2 = 4;
                      stackIn_212_0 = stackOut_211_0;
                      stackIn_212_1 = stackOut_211_1;
                      stackIn_212_2 = stackOut_211_2;
                      break L47;
                    } else {
                      stackOut_210_0 = (nl) (Object) stackIn_210_0;
                      stackOut_210_1 = stackIn_210_1;
                      stackOut_210_2 = 0;
                      stackIn_212_0 = stackOut_210_0;
                      stackIn_212_1 = stackOut_210_1;
                      stackIn_212_2 = stackOut_210_2;
                      break L47;
                    }
                  }
                  stackIn_212_0.field_G = stackIn_212_1 | stackIn_212_2;
                  return false;
                } else {
                  return true;
                }
              } else {
                if (param1 > 80) {
                  L48: {
                    if (param2 != param3.field_M) {
                      break L48;
                    } else {
                      if (param3.field_w != param4) {
                        break L48;
                      } else {
                        param3.field_G = 0;
                        param3.a(param0, 26214);
                        return true;
                      }
                    }
                  }
                  L49: {
                    stackOut_182_0 = (nl) param3;
                    stackIn_184_0 = stackOut_182_0;
                    stackIn_183_0 = stackOut_182_0;
                    if (param4 > param3.field_w) {
                      stackOut_184_0 = (nl) (Object) stackIn_184_0;
                      stackOut_184_1 = 1;
                      stackIn_185_0 = stackOut_184_0;
                      stackIn_185_1 = stackOut_184_1;
                      break L49;
                    } else {
                      stackOut_183_0 = (nl) (Object) stackIn_183_0;
                      stackOut_183_1 = 0;
                      stackIn_185_0 = stackOut_183_0;
                      stackIn_185_1 = stackOut_183_1;
                      break L49;
                    }
                  }
                  L50: {
                    stackOut_185_0 = (nl) (Object) stackIn_185_0;
                    stackOut_185_1 = stackIn_185_1;
                    stackIn_187_0 = stackOut_185_0;
                    stackIn_187_1 = stackOut_185_1;
                    stackIn_186_0 = stackOut_185_0;
                    stackIn_186_1 = stackOut_185_1;
                    if (param3.field_M >= param2) {
                      stackOut_187_0 = (nl) (Object) stackIn_187_0;
                      stackOut_187_1 = stackIn_187_1;
                      stackOut_187_2 = 0;
                      stackIn_188_0 = stackOut_187_0;
                      stackIn_188_1 = stackOut_187_1;
                      stackIn_188_2 = stackOut_187_2;
                      break L50;
                    } else {
                      stackOut_186_0 = (nl) (Object) stackIn_186_0;
                      stackOut_186_1 = stackIn_186_1;
                      stackOut_186_2 = 8;
                      stackIn_188_0 = stackOut_186_0;
                      stackIn_188_1 = stackOut_186_1;
                      stackIn_188_2 = stackOut_186_2;
                      break L50;
                    }
                  }
                  L51: {
                    stackOut_188_0 = (nl) (Object) stackIn_188_0;
                    stackOut_188_1 = stackIn_188_1;
                    stackOut_188_2 = stackIn_188_2;
                    stackIn_190_0 = stackOut_188_0;
                    stackIn_190_1 = stackOut_188_1;
                    stackIn_190_2 = stackOut_188_2;
                    stackIn_189_0 = stackOut_188_0;
                    stackIn_189_1 = stackOut_188_1;
                    stackIn_189_2 = stackOut_188_2;
                    if (param3.field_M <= param2) {
                      stackOut_190_0 = (nl) (Object) stackIn_190_0;
                      stackOut_190_1 = stackIn_190_1;
                      stackOut_190_2 = stackIn_190_2;
                      stackOut_190_3 = 0;
                      stackIn_191_0 = stackOut_190_0;
                      stackIn_191_1 = stackOut_190_1;
                      stackIn_191_2 = stackOut_190_2;
                      stackIn_191_3 = stackOut_190_3;
                      break L51;
                    } else {
                      stackOut_189_0 = (nl) (Object) stackIn_189_0;
                      stackOut_189_1 = stackIn_189_1;
                      stackOut_189_2 = stackIn_189_2;
                      stackOut_189_3 = 2;
                      stackIn_191_0 = stackOut_189_0;
                      stackIn_191_1 = stackOut_189_1;
                      stackIn_191_2 = stackOut_189_2;
                      stackIn_191_3 = stackOut_189_3;
                      break L51;
                    }
                  }
                  L52: {
                    stackOut_191_0 = (nl) (Object) stackIn_191_0;
                    stackOut_191_1 = stackIn_191_1 | (stackIn_191_2 | stackIn_191_3);
                    stackIn_193_0 = stackOut_191_0;
                    stackIn_193_1 = stackOut_191_1;
                    stackIn_192_0 = stackOut_191_0;
                    stackIn_192_1 = stackOut_191_1;
                    if (param3.field_w > param4) {
                      stackOut_193_0 = (nl) (Object) stackIn_193_0;
                      stackOut_193_1 = stackIn_193_1;
                      stackOut_193_2 = 4;
                      stackIn_194_0 = stackOut_193_0;
                      stackIn_194_1 = stackOut_193_1;
                      stackIn_194_2 = stackOut_193_2;
                      break L52;
                    } else {
                      stackOut_192_0 = (nl) (Object) stackIn_192_0;
                      stackOut_192_1 = stackIn_192_1;
                      stackOut_192_2 = 0;
                      stackIn_194_0 = stackOut_192_0;
                      stackIn_194_1 = stackOut_192_1;
                      stackIn_194_2 = stackOut_192_2;
                      break L52;
                    }
                  }
                  stackIn_194_0.field_G = stackIn_194_1 | stackIn_194_2;
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              if (param1 > 80) {
                L53: {
                  if (param2 != param3.field_M) {
                    break L53;
                  } else {
                    if (param3.field_w != param4) {
                      break L53;
                    } else {
                      param3.field_G = 0;
                      param3.a(param0, 26214);
                      return true;
                    }
                  }
                }
                L54: {
                  stackOut_163_0 = (nl) param3;
                  stackIn_165_0 = stackOut_163_0;
                  stackIn_164_0 = stackOut_163_0;
                  if (param4 > param3.field_w) {
                    stackOut_165_0 = (nl) (Object) stackIn_165_0;
                    stackOut_165_1 = 1;
                    stackIn_166_0 = stackOut_165_0;
                    stackIn_166_1 = stackOut_165_1;
                    break L54;
                  } else {
                    stackOut_164_0 = (nl) (Object) stackIn_164_0;
                    stackOut_164_1 = 0;
                    stackIn_166_0 = stackOut_164_0;
                    stackIn_166_1 = stackOut_164_1;
                    break L54;
                  }
                }
                L55: {
                  stackOut_166_0 = (nl) (Object) stackIn_166_0;
                  stackOut_166_1 = stackIn_166_1;
                  stackIn_168_0 = stackOut_166_0;
                  stackIn_168_1 = stackOut_166_1;
                  stackIn_167_0 = stackOut_166_0;
                  stackIn_167_1 = stackOut_166_1;
                  if (param3.field_M >= param2) {
                    stackOut_168_0 = (nl) (Object) stackIn_168_0;
                    stackOut_168_1 = stackIn_168_1;
                    stackOut_168_2 = 0;
                    stackIn_169_0 = stackOut_168_0;
                    stackIn_169_1 = stackOut_168_1;
                    stackIn_169_2 = stackOut_168_2;
                    break L55;
                  } else {
                    stackOut_167_0 = (nl) (Object) stackIn_167_0;
                    stackOut_167_1 = stackIn_167_1;
                    stackOut_167_2 = 8;
                    stackIn_169_0 = stackOut_167_0;
                    stackIn_169_1 = stackOut_167_1;
                    stackIn_169_2 = stackOut_167_2;
                    break L55;
                  }
                }
                L56: {
                  stackOut_169_0 = (nl) (Object) stackIn_169_0;
                  stackOut_169_1 = stackIn_169_1;
                  stackOut_169_2 = stackIn_169_2;
                  stackIn_171_0 = stackOut_169_0;
                  stackIn_171_1 = stackOut_169_1;
                  stackIn_171_2 = stackOut_169_2;
                  stackIn_170_0 = stackOut_169_0;
                  stackIn_170_1 = stackOut_169_1;
                  stackIn_170_2 = stackOut_169_2;
                  if (param3.field_M <= param2) {
                    stackOut_171_0 = (nl) (Object) stackIn_171_0;
                    stackOut_171_1 = stackIn_171_1;
                    stackOut_171_2 = stackIn_171_2;
                    stackOut_171_3 = 0;
                    stackIn_172_0 = stackOut_171_0;
                    stackIn_172_1 = stackOut_171_1;
                    stackIn_172_2 = stackOut_171_2;
                    stackIn_172_3 = stackOut_171_3;
                    break L56;
                  } else {
                    stackOut_170_0 = (nl) (Object) stackIn_170_0;
                    stackOut_170_1 = stackIn_170_1;
                    stackOut_170_2 = stackIn_170_2;
                    stackOut_170_3 = 2;
                    stackIn_172_0 = stackOut_170_0;
                    stackIn_172_1 = stackOut_170_1;
                    stackIn_172_2 = stackOut_170_2;
                    stackIn_172_3 = stackOut_170_3;
                    break L56;
                  }
                }
                L57: {
                  stackOut_172_0 = (nl) (Object) stackIn_172_0;
                  stackOut_172_1 = stackIn_172_1 | (stackIn_172_2 | stackIn_172_3);
                  stackIn_174_0 = stackOut_172_0;
                  stackIn_174_1 = stackOut_172_1;
                  stackIn_173_0 = stackOut_172_0;
                  stackIn_173_1 = stackOut_172_1;
                  if (param3.field_w > param4) {
                    stackOut_174_0 = (nl) (Object) stackIn_174_0;
                    stackOut_174_1 = stackIn_174_1;
                    stackOut_174_2 = 4;
                    stackIn_175_0 = stackOut_174_0;
                    stackIn_175_1 = stackOut_174_1;
                    stackIn_175_2 = stackOut_174_2;
                    break L57;
                  } else {
                    stackOut_173_0 = (nl) (Object) stackIn_173_0;
                    stackOut_173_1 = stackIn_173_1;
                    stackOut_173_2 = 0;
                    stackIn_175_0 = stackOut_173_0;
                    stackIn_175_1 = stackOut_173_1;
                    stackIn_175_2 = stackOut_173_2;
                    break L57;
                  }
                }
                stackIn_175_0.field_G = stackIn_175_1 | stackIn_175_2;
                return false;
              } else {
                return true;
              }
            }
          }
        } else {
          L58: {
            if (-1 == (param3.field_G & 1 ^ -1)) {
              break L58;
            } else {
              if (param3.field_w <= param4) {
                break L58;
              } else {
                param3.field_w = param4;
                if (param1 > 80) {
                  L59: {
                    if (param2 != param3.field_M) {
                      break L59;
                    } else {
                      if (param3.field_w != param4) {
                        break L59;
                      } else {
                        param3.field_G = 0;
                        param3.a(param0, 26214);
                        return true;
                      }
                    }
                  }
                  L60: {
                    stackOut_125_0 = (nl) param3;
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_126_0 = stackOut_125_0;
                    if (param4 > param3.field_w) {
                      stackOut_127_0 = (nl) (Object) stackIn_127_0;
                      stackOut_127_1 = 1;
                      stackIn_128_0 = stackOut_127_0;
                      stackIn_128_1 = stackOut_127_1;
                      break L60;
                    } else {
                      stackOut_126_0 = (nl) (Object) stackIn_126_0;
                      stackOut_126_1 = 0;
                      stackIn_128_0 = stackOut_126_0;
                      stackIn_128_1 = stackOut_126_1;
                      break L60;
                    }
                  }
                  L61: {
                    stackOut_128_0 = (nl) (Object) stackIn_128_0;
                    stackOut_128_1 = stackIn_128_1;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    if (param3.field_M >= param2) {
                      stackOut_130_0 = (nl) (Object) stackIn_130_0;
                      stackOut_130_1 = stackIn_130_1;
                      stackOut_130_2 = 0;
                      stackIn_131_0 = stackOut_130_0;
                      stackIn_131_1 = stackOut_130_1;
                      stackIn_131_2 = stackOut_130_2;
                      break L61;
                    } else {
                      stackOut_129_0 = (nl) (Object) stackIn_129_0;
                      stackOut_129_1 = stackIn_129_1;
                      stackOut_129_2 = 8;
                      stackIn_131_0 = stackOut_129_0;
                      stackIn_131_1 = stackOut_129_1;
                      stackIn_131_2 = stackOut_129_2;
                      break L61;
                    }
                  }
                  L62: {
                    stackOut_131_0 = (nl) (Object) stackIn_131_0;
                    stackOut_131_1 = stackIn_131_1;
                    stackOut_131_2 = stackIn_131_2;
                    stackIn_133_0 = stackOut_131_0;
                    stackIn_133_1 = stackOut_131_1;
                    stackIn_133_2 = stackOut_131_2;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    stackIn_132_2 = stackOut_131_2;
                    if (param3.field_M <= param2) {
                      stackOut_133_0 = (nl) (Object) stackIn_133_0;
                      stackOut_133_1 = stackIn_133_1;
                      stackOut_133_2 = stackIn_133_2;
                      stackOut_133_3 = 0;
                      stackIn_134_0 = stackOut_133_0;
                      stackIn_134_1 = stackOut_133_1;
                      stackIn_134_2 = stackOut_133_2;
                      stackIn_134_3 = stackOut_133_3;
                      break L62;
                    } else {
                      stackOut_132_0 = (nl) (Object) stackIn_132_0;
                      stackOut_132_1 = stackIn_132_1;
                      stackOut_132_2 = stackIn_132_2;
                      stackOut_132_3 = 2;
                      stackIn_134_0 = stackOut_132_0;
                      stackIn_134_1 = stackOut_132_1;
                      stackIn_134_2 = stackOut_132_2;
                      stackIn_134_3 = stackOut_132_3;
                      break L62;
                    }
                  }
                  L63: {
                    stackOut_134_0 = (nl) (Object) stackIn_134_0;
                    stackOut_134_1 = stackIn_134_1 | (stackIn_134_2 | stackIn_134_3);
                    stackIn_136_0 = stackOut_134_0;
                    stackIn_136_1 = stackOut_134_1;
                    stackIn_135_0 = stackOut_134_0;
                    stackIn_135_1 = stackOut_134_1;
                    if (param3.field_w > param4) {
                      stackOut_136_0 = (nl) (Object) stackIn_136_0;
                      stackOut_136_1 = stackIn_136_1;
                      stackOut_136_2 = 4;
                      stackIn_137_0 = stackOut_136_0;
                      stackIn_137_1 = stackOut_136_1;
                      stackIn_137_2 = stackOut_136_2;
                      break L63;
                    } else {
                      stackOut_135_0 = (nl) (Object) stackIn_135_0;
                      stackOut_135_1 = stackIn_135_1;
                      stackOut_135_2 = 0;
                      stackIn_137_0 = stackOut_135_0;
                      stackIn_137_1 = stackOut_135_1;
                      stackIn_137_2 = stackOut_135_2;
                      break L63;
                    }
                  }
                  stackIn_137_0.field_G = stackIn_137_1 | stackIn_137_2;
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
          if (param1 > 80) {
            L64: {
              if (param2 != param3.field_M) {
                break L64;
              } else {
                if (param3.field_w != param4) {
                  break L64;
                } else {
                  param3.field_G = 0;
                  param3.a(param0, 26214);
                  return true;
                }
              }
            }
            L65: {
              stackOut_143_0 = (nl) param3;
              stackIn_145_0 = stackOut_143_0;
              stackIn_144_0 = stackOut_143_0;
              if (param4 > param3.field_w) {
                stackOut_145_0 = (nl) (Object) stackIn_145_0;
                stackOut_145_1 = 1;
                stackIn_146_0 = stackOut_145_0;
                stackIn_146_1 = stackOut_145_1;
                break L65;
              } else {
                stackOut_144_0 = (nl) (Object) stackIn_144_0;
                stackOut_144_1 = 0;
                stackIn_146_0 = stackOut_144_0;
                stackIn_146_1 = stackOut_144_1;
                break L65;
              }
            }
            L66: {
              stackOut_146_0 = (nl) (Object) stackIn_146_0;
              stackOut_146_1 = stackIn_146_1;
              stackIn_148_0 = stackOut_146_0;
              stackIn_148_1 = stackOut_146_1;
              stackIn_147_0 = stackOut_146_0;
              stackIn_147_1 = stackOut_146_1;
              if (param3.field_M >= param2) {
                stackOut_148_0 = (nl) (Object) stackIn_148_0;
                stackOut_148_1 = stackIn_148_1;
                stackOut_148_2 = 0;
                stackIn_149_0 = stackOut_148_0;
                stackIn_149_1 = stackOut_148_1;
                stackIn_149_2 = stackOut_148_2;
                break L66;
              } else {
                stackOut_147_0 = (nl) (Object) stackIn_147_0;
                stackOut_147_1 = stackIn_147_1;
                stackOut_147_2 = 8;
                stackIn_149_0 = stackOut_147_0;
                stackIn_149_1 = stackOut_147_1;
                stackIn_149_2 = stackOut_147_2;
                break L66;
              }
            }
            L67: {
              stackOut_149_0 = (nl) (Object) stackIn_149_0;
              stackOut_149_1 = stackIn_149_1;
              stackOut_149_2 = stackIn_149_2;
              stackIn_151_0 = stackOut_149_0;
              stackIn_151_1 = stackOut_149_1;
              stackIn_151_2 = stackOut_149_2;
              stackIn_150_0 = stackOut_149_0;
              stackIn_150_1 = stackOut_149_1;
              stackIn_150_2 = stackOut_149_2;
              if (param3.field_M <= param2) {
                stackOut_151_0 = (nl) (Object) stackIn_151_0;
                stackOut_151_1 = stackIn_151_1;
                stackOut_151_2 = stackIn_151_2;
                stackOut_151_3 = 0;
                stackIn_152_0 = stackOut_151_0;
                stackIn_152_1 = stackOut_151_1;
                stackIn_152_2 = stackOut_151_2;
                stackIn_152_3 = stackOut_151_3;
                break L67;
              } else {
                stackOut_150_0 = (nl) (Object) stackIn_150_0;
                stackOut_150_1 = stackIn_150_1;
                stackOut_150_2 = stackIn_150_2;
                stackOut_150_3 = 2;
                stackIn_152_0 = stackOut_150_0;
                stackIn_152_1 = stackOut_150_1;
                stackIn_152_2 = stackOut_150_2;
                stackIn_152_3 = stackOut_150_3;
                break L67;
              }
            }
            L68: {
              stackOut_152_0 = (nl) (Object) stackIn_152_0;
              stackOut_152_1 = stackIn_152_1 | (stackIn_152_2 | stackIn_152_3);
              stackIn_154_0 = stackOut_152_0;
              stackIn_154_1 = stackOut_152_1;
              stackIn_153_0 = stackOut_152_0;
              stackIn_153_1 = stackOut_152_1;
              if (param3.field_w > param4) {
                stackOut_154_0 = (nl) (Object) stackIn_154_0;
                stackOut_154_1 = stackIn_154_1;
                stackOut_154_2 = 4;
                stackIn_155_0 = stackOut_154_0;
                stackIn_155_1 = stackOut_154_1;
                stackIn_155_2 = stackOut_154_2;
                break L68;
              } else {
                stackOut_153_0 = (nl) (Object) stackIn_153_0;
                stackOut_153_1 = stackIn_153_1;
                stackOut_153_2 = 0;
                stackIn_155_0 = stackOut_153_0;
                stackIn_155_1 = stackOut_153_1;
                stackIn_155_2 = stackOut_153_2;
                break L68;
              }
            }
            stackIn_155_0.field_G = stackIn_155_1 | stackIn_155_2;
            return false;
          } else {
            return true;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (!(param0)) {
            param3 = 0;
        }
        ir.a(rv.field_c[param2][param3][2], -88, rv.field_c[param2][param3][5], rv.field_c[param2][param3][4], rv.field_c[param2][param3][1], rv.field_c[param2][param3][0], rv.field_c[param2][param3][3]);
        ic.a(rv.field_c[param2][param3][4], rv.field_c[param2][param3][5], rv.field_c[param2][param3][3], rv.field_c[param2][param3][0], rv.field_c[param2][param3][2], (byte) -113, rv.field_c[param2][param3][1]);
        if (param1 != 8710) {
            Object var5 = null;
            boolean discarded$0 = tc.a(117, (byte) -18, -15, (nl) null, 51);
            return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Kickabout.field_G;
        if (null != ((tc) this).field_n) {
          var2 = 0;
          L0: while (true) {
            if (((tc) this).field_n.length <= var2) {
              if (param0 < -81) {
                if (null != ((tc) this).field_o) {
                  var4 = 0;
                  var2 = var4;
                  L1: while (true) {
                    if (var4 >= ((tc) this).field_o.length) {
                      return;
                    } else {
                      ((tc) this).field_o[var4] = hf.a(((tc) this).field_o[var4], 32768);
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
              ((tc) this).field_n[var2] = hf.a(((tc) this).field_n[var2], 32768);
              var2++;
              continue L0;
            }
          }
        } else {
          if (param0 < -81) {
            if (null != ((tc) this).field_o) {
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 < ((tc) this).field_o.length) {
                  ((tc) this).field_o[var4] = hf.a(((tc) this).field_o[var4], 32768);
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
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        L0: while (true) {
          var3 = param0.h((byte) -125);
          if (var3 != 0) {
            this.a(var3, false, param0);
            continue L0;
          } else {
            if (param1 == 0) {
              return;
            } else {
              ((tc) this).field_r = null;
              return;
            }
          }
        }
    }

    tc() {
        ((tc) this).field_t = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = false;
    }
}
