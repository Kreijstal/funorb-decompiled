/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_b;
    static sg[] field_a;

    final static void a(boolean param0, int param1) {
        oi var2 = null;
        int var3 = 0;
        jl var4 = null;
        qj stackIn_6_0 = null;
        qj stackIn_7_0 = null;
        qj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qj stackIn_15_0 = null;
        qj stackIn_16_0 = null;
        qj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qj stackOut_14_0 = null;
        qj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qj stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qj stackOut_5_0 = null;
        qj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        var4 = (jl) (Object) ll.field_T.a((byte) -95);
        L0: while (true) {
          if (var4 == null) {
            var2 = (oi) (Object) qd.field_d.a((byte) -95);
            if (param0) {
              eg.a((byte) 21);
              L1: while (true) {
                if (var2 != null) {
                  L2: {
                    de.a(var2, param1, 2);
                    stackOut_14_0 = qd.field_d;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (param0) {
                      stackOut_16_0 = (qj) (Object) stackIn_16_0;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L2;
                    } else {
                      stackOut_15_0 = (qj) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L2;
                    }
                  }
                  var2 = (oi) (Object) ((qj) (Object) stackIn_17_0).a(stackIn_17_1 != 0);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              L3: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L4: {
                    de.a(var2, param1, 2);
                    stackOut_5_0 = qd.field_d;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (param0) {
                      stackOut_7_0 = (qj) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L4;
                    } else {
                      stackOut_6_0 = (qj) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L4;
                    }
                  }
                  var2 = (oi) (Object) ((qj) (Object) stackIn_8_0).a(stackIn_8_1 != 0);
                  continue L3;
                }
              }
            }
          } else {
            sj.a(-7812, param1, var4);
            var4 = (jl) (Object) ll.field_T.a(true);
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
            Object var2 = null;
            String discarded$0 = eg.a(-121, (byte[]) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        vi.field_e = wh.a((byte) -122);
        ci.field_f = new da();
        wl.a(true, true, 170);
        if (param0 >= 54) {
            return;
        }
        eg.a((byte) -57);
    }

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (0 == (rd.field_f ^ -1)) {
          if ((el.field_d ^ -1) == 0) {
            L0: {
              L1: {
                el.field_d = bk.field_a;
                rd.field_f = oa.field_j;
                da.field_y = da.field_y + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) tj.field_v)) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (tj.field_v != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (lk.field_c) {
                    break L3;
                  } else {
                    if (da.field_y < bk.field_d) {
                      break L3;
                    } else {
                      if ((bk.field_d - -ek.field_g ^ -1) >= (da.field_y ^ -1)) {
                        break L3;
                      } else {
                        stackOut_103_0 = 1;
                        stackIn_105_0 = stackOut_103_0;
                        break L2;
                      }
                    }
                  }
                }
                stackOut_104_0 = 0;
                stackIn_105_0 = stackOut_104_0;
                break L2;
              }
              L4: {
                var2 = stackIn_105_0;
                if (param0 == null) {
                  da.field_y = 0;
                  break L4;
                } else {
                  if (lk.field_c) {
                    da.field_y = bk.field_d;
                    break L4;
                  } else {
                    if (var2 != 0) {
                      da.field_y = bk.field_d;
                      break L4;
                    } else {
                      da.field_y = 0;
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (param0 != null) {
                  lk.field_c = false;
                  break L5;
                } else {
                  if (var2 == 0) {
                    break L5;
                  } else {
                    lk.field_c = true;
                    break L5;
                  }
                }
              }
              qi.field_d = rd.field_f;
              og.field_e = el.field_d;
              break L0;
            }
            L6: {
              tj.field_v = param0;
              if (param1 > 121) {
                break L6;
              } else {
                field_b = -62;
                break L6;
              }
            }
            L7: {
              if (lk.field_c) {
                break L7;
              } else {
                if (da.field_y >= bk.field_d) {
                  break L7;
                } else {
                  if (!tl.field_a) {
                    break L7;
                  } else {
                    og.field_e = el.field_d;
                    qi.field_d = rd.field_f;
                    da.field_y = 0;
                    break L7;
                  }
                }
              }
            }
            L8: {
              rd.field_f = -1;
              if (!lk.field_c) {
                break L8;
              } else {
                if ((pi.field_j ^ -1) == (da.field_y ^ -1)) {
                  da.field_y = 0;
                  lk.field_c = false;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            el.field_d = -1;
            return;
          } else {
            L9: {
              da.field_y = da.field_y + 1;
              if (param0 != null) {
                if (!param0.equals((Object) (Object) tj.field_v)) {
                  break L9;
                } else {
                  L10: {
                    tj.field_v = param0;
                    if (param1 > 121) {
                      break L10;
                    } else {
                      field_b = -62;
                      break L10;
                    }
                  }
                  L11: {
                    if (lk.field_c) {
                      break L11;
                    } else {
                      if (da.field_y >= bk.field_d) {
                        break L11;
                      } else {
                        if (!tl.field_a) {
                          break L11;
                        } else {
                          og.field_e = el.field_d;
                          qi.field_d = rd.field_f;
                          da.field_y = 0;
                          break L11;
                        }
                      }
                    }
                  }
                  L12: {
                    rd.field_f = -1;
                    if (!lk.field_c) {
                      break L12;
                    } else {
                      if ((pi.field_j ^ -1) == (da.field_y ^ -1)) {
                        da.field_y = 0;
                        lk.field_c = false;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  el.field_d = -1;
                  return;
                }
              } else {
                if (tj.field_v == null) {
                  break L9;
                } else {
                  L13: {
                    tj.field_v = param0;
                    if (param1 > 121) {
                      break L13;
                    } else {
                      field_b = -62;
                      break L13;
                    }
                  }
                  L14: {
                    if (lk.field_c) {
                      break L14;
                    } else {
                      if (da.field_y >= bk.field_d) {
                        break L14;
                      } else {
                        if (!tl.field_a) {
                          break L14;
                        } else {
                          og.field_e = el.field_d;
                          qi.field_d = rd.field_f;
                          da.field_y = 0;
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    rd.field_f = -1;
                    if (!lk.field_c) {
                      break L15;
                    } else {
                      if ((pi.field_j ^ -1) == (da.field_y ^ -1)) {
                        da.field_y = 0;
                        lk.field_c = false;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  el.field_d = -1;
                  return;
                }
              }
            }
            L16: {
              L17: {
                if (lk.field_c) {
                  break L17;
                } else {
                  if (da.field_y < bk.field_d) {
                    break L17;
                  } else {
                    if ((bk.field_d - -ek.field_g ^ -1) >= (da.field_y ^ -1)) {
                      break L17;
                    } else {
                      stackOut_68_0 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      break L16;
                    }
                  }
                }
              }
              stackOut_69_0 = 0;
              stackIn_70_0 = stackOut_69_0;
              break L16;
            }
            L18: {
              var2 = stackIn_70_0;
              if (param0 == null) {
                da.field_y = 0;
                break L18;
              } else {
                if (lk.field_c) {
                  da.field_y = bk.field_d;
                  break L18;
                } else {
                  if (var2 != 0) {
                    da.field_y = bk.field_d;
                    break L18;
                  } else {
                    da.field_y = 0;
                    break L18;
                  }
                }
              }
            }
            L19: {
              if (param0 != null) {
                lk.field_c = false;
                qi.field_d = rd.field_f;
                og.field_e = el.field_d;
                break L19;
              } else {
                if (var2 == 0) {
                  qi.field_d = rd.field_f;
                  og.field_e = el.field_d;
                  break L19;
                } else {
                  lk.field_c = true;
                  qi.field_d = rd.field_f;
                  og.field_e = el.field_d;
                  break L19;
                }
              }
            }
            L20: {
              tj.field_v = param0;
              if (param1 > 121) {
                break L20;
              } else {
                field_b = -62;
                break L20;
              }
            }
            L21: {
              if (lk.field_c) {
                break L21;
              } else {
                if (da.field_y >= bk.field_d) {
                  break L21;
                } else {
                  if (!tl.field_a) {
                    break L21;
                  } else {
                    og.field_e = el.field_d;
                    qi.field_d = rd.field_f;
                    da.field_y = 0;
                    break L21;
                  }
                }
              }
            }
            L22: {
              rd.field_f = -1;
              if (!lk.field_c) {
                break L22;
              } else {
                if ((pi.field_j ^ -1) == (da.field_y ^ -1)) {
                  da.field_y = 0;
                  lk.field_c = false;
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            el.field_d = -1;
            return;
          }
        } else {
          L23: {
            L24: {
              da.field_y = da.field_y + 1;
              if (param0 != null) {
                if (param0.equals((Object) (Object) tj.field_v)) {
                  break L23;
                } else {
                  break L24;
                }
              } else {
                if (tj.field_v != null) {
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            L25: {
              L26: {
                if (lk.field_c) {
                  break L26;
                } else {
                  if (da.field_y < bk.field_d) {
                    break L26;
                  } else {
                    if ((bk.field_d - -ek.field_g ^ -1) >= (da.field_y ^ -1)) {
                      break L26;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L25;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L25;
            }
            L27: {
              var2 = stackIn_10_0;
              if (param0 == null) {
                da.field_y = 0;
                break L27;
              } else {
                if (lk.field_c) {
                  da.field_y = bk.field_d;
                  break L27;
                } else {
                  if (var2 != 0) {
                    da.field_y = bk.field_d;
                    break L27;
                  } else {
                    da.field_y = 0;
                    break L27;
                  }
                }
              }
            }
            if (param0 != null) {
              lk.field_c = false;
              qi.field_d = rd.field_f;
              og.field_e = el.field_d;
              break L23;
            } else {
              if (var2 == 0) {
                qi.field_d = rd.field_f;
                og.field_e = el.field_d;
                break L23;
              } else {
                lk.field_c = true;
                qi.field_d = rd.field_f;
                og.field_e = el.field_d;
                break L23;
              }
            }
          }
          L28: {
            tj.field_v = param0;
            if (param1 > 121) {
              break L28;
            } else {
              field_b = -62;
              break L28;
            }
          }
          L29: {
            if (lk.field_c) {
              break L29;
            } else {
              if (da.field_y >= bk.field_d) {
                break L29;
              } else {
                if (!tl.field_a) {
                  break L29;
                } else {
                  og.field_e = el.field_d;
                  qi.field_d = rd.field_f;
                  da.field_y = 0;
                  break L29;
                }
              }
            }
          }
          L30: {
            rd.field_f = -1;
            if (!lk.field_c) {
              el.field_d = -1;
              break L30;
            } else {
              if ((pi.field_j ^ -1) == (da.field_y ^ -1)) {
                da.field_y = 0;
                lk.field_c = false;
                el.field_d = -1;
                break L30;
              } else {
                el.field_d = -1;
                break L30;
              }
            }
          }
          return;
        }
    }

    final static String a(int param0, byte[] param1) {
        if (param0 < 82) {
            eg.a((byte) -117);
            return cc.a(0, 15923, param1.length, param1);
        }
        return cc.a(0, 15923, param1.length, param1);
    }

    static {
    }
}
