/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String[] field_b;
    static String field_c;
    static int field_a;

    final static void a(vr param0, boolean param1, ln param2, byte param3) {
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param3 == -2) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        if (param0.field_k) {
          param2.field_N = 0;
          return;
        } else {
          if (!param0.field_l) {
            param2.field_N = 0;
            var8 = param2.field_D;
            var4 = var8;
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                return;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (param2.field_y != var6.field_y) {
                    break L2;
                  } else {
                    if (param1) {
                      if (ec.field_r[var6.field_p]) {
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                param2.field_N = param2.field_N + 1;
                var5++;
                continue L1;
              }
            }
          } else {
            param2.field_N = 1;
            return;
          }
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, byte[] param4, CharSequence param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = -param1 + param0;
        if (param2 == -97) {
          var7 = 0;
          L0: while (true) {
            L1: {
              if (var7 >= var6) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param5.charAt(param1 + var7);
                      if (-1 <= (var8 ^ -1)) {
                        break L4;
                      } else {
                        if (var8 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var8) {
                        break L5;
                      } else {
                        if (var8 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 != 8364) {
                        break L6;
                      } else {
                        param4[param3 - -var7] = (byte)-128;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var8 != 8218) {
                        break L7;
                      } else {
                        param4[var7 + param3] = (byte)-126;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var8 == 402) {
                        break L8;
                      } else {
                        L9: {
                          if (var8 == 8222) {
                            break L9;
                          } else {
                            L10: {
                              if (var8 == 8230) {
                                break L10;
                              } else {
                                L11: {
                                  if (var8 != 8224) {
                                    break L11;
                                  } else {
                                    param4[var7 + param3] = (byte)-122;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (8225 == var8) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (var8 != 710) {
                                        break L13;
                                      } else {
                                        param4[param3 - -var7] = (byte)-120;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (var8 != 8240) {
                                        break L14;
                                      } else {
                                        param4[var7 + param3] = (byte)-119;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (var8 != 352) {
                                        break L15;
                                      } else {
                                        param4[param3 + var7] = (byte)-118;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (var8 != 8249) {
                                        break L16;
                                      } else {
                                        param4[param3 + var7] = (byte)-117;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var8 == 338) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (var8 != 381) {
                                            break L18;
                                          } else {
                                            param4[var7 + param3] = (byte)-114;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        L19: {
                                          if (var8 == 8216) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (var8 != 8217) {
                                                break L20;
                                              } else {
                                                param4[var7 + param3] = (byte)-110;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (var8 == 8220) {
                                                break L21;
                                              } else {
                                                L22: {
                                                  if (8221 == var8) {
                                                    break L22;
                                                  } else {
                                                    L23: {
                                                      if (8226 != var8) {
                                                        break L23;
                                                      } else {
                                                        param4[var7 + param3] = (byte)-107;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (var8 == 8211) {
                                                        break L24;
                                                      } else {
                                                        L25: {
                                                          if (var8 == 8212) {
                                                            break L25;
                                                          } else {
                                                            L26: {
                                                              if (var8 != 732) {
                                                                break L26;
                                                              } else {
                                                                param4[var7 + param3] = (byte)-104;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                            L27: {
                                                              if (var8 == 8482) {
                                                                break L27;
                                                              } else {
                                                                L28: {
                                                                  if (353 != var8) {
                                                                    break L28;
                                                                  } else {
                                                                    param4[var7 + param3] = (byte)-102;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                                L29: {
                                                                  if (8250 == var8) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if (var8 == 339) {
                                                                        break L30;
                                                                      } else {
                                                                        L31: {
                                                                          if (382 == var8) {
                                                                            break L31;
                                                                          } else {
                                                                            L32: {
                                                                              if (376 != var8) {
                                                                                break L32;
                                                                              } else {
                                                                                param4[param3 - -var7] = (byte)-97;
                                                                                if (0 == 0) {
                                                                                  break L2;
                                                                                } else {
                                                                                  break L32;
                                                                                }
                                                                              }
                                                                            }
                                                                            param4[var7 + param3] = (byte)63;
                                                                            if (0 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L31;
                                                                            }
                                                                          }
                                                                        }
                                                                        param4[var7 + param3] = (byte)-98;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                    }
                                                                    param4[param3 - -var7] = (byte)-100;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                param4[param3 + var7] = (byte)-101;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            param4[param3 - -var7] = (byte)-103;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        param4[var7 + param3] = (byte)-105;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    param4[param3 - -var7] = (byte)-106;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                param4[var7 + param3] = (byte)-108;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            param4[param3 - -var7] = (byte)-109;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        param4[var7 + param3] = (byte)-111;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    param4[param3 - -var7] = (byte)-116;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                param4[var7 + param3] = (byte)-121;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param4[param3 - -var7] = (byte)-123;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param4[var7 + param3] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param4[param3 - -var7] = (byte)-125;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  param4[var7 + param3] = (byte)var8;
                  break L2;
                }
                var7++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var6;
          }
        } else {
          return -19;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        v var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        v stackIn_44_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        v stackOut_43_0 = null;
        v stackOut_42_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == -119) {
          L0: {
            var1 = uq.field_k;
            var2 = 0;
            if (2 == eh.field_C) {
              var3_long = pr.a(14274) + -br.field_p;
              var2 = (int)((10999L + -var3_long) / 1000L);
              if ((var2 ^ -1) > -1) {
                var2 = 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= kr.field_f.length) {
              return;
            } else {
              L2: {
                var4 = ss.field_a[var3];
                if (0 <= var4) {
                  if (dc.field_l.field_c == var4) {
                    var5 = es.field_n;
                    break L2;
                  } else {
                    var5 = ah.field_P;
                    break L2;
                  }
                } else {
                  var5 = rm.field_b;
                  break L2;
                }
              }
              L3: {
                var6 = kr.field_f[var3];
                if (eh.field_C != -3) {
                  break L3;
                } else {
                  if (-2 != var2) {
                    break L3;
                  } else {
                    L4: {
                      if (kp.field_o.length >= el.field_d.length) {
                        stackOut_18_0 = kp.field_o.length;
                        stackIn_19_0 = stackOut_18_0;
                        break L4;
                      } else {
                        stackOut_17_0 = el.field_d.length;
                        stackIn_19_0 = stackOut_17_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_19_0;
                      if (hm.field_p.length > field_b.length) {
                        stackOut_21_0 = hm.field_p.length;
                        stackIn_22_0 = stackOut_21_0;
                        break L5;
                      } else {
                        stackOut_20_0 = field_b.length;
                        stackIn_22_0 = stackOut_20_0;
                        break L5;
                      }
                    }
                    L6: {
                      var8 = stackIn_22_0;
                      if (-7 < var3) {
                        break L6;
                      } else {
                        if (var3 < var7 + 6) {
                          L7: {
                            if (-1 > kp.field_o.length + var3 + (-6 - var7)) {
                              stackOut_27_0 = "";
                              stackIn_28_0 = stackOut_27_0;
                              break L7;
                            } else {
                              stackOut_26_0 = kp.field_o[-6 + var3 - (-kp.field_o.length + var7)];
                              stackIn_28_0 = stackOut_26_0;
                              break L7;
                            }
                          }
                          var6_ref = stackIn_28_0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var7 + 7 > var3) {
                      break L3;
                    } else {
                      if (var3 >= var8 + 7 - -var7) {
                        break L3;
                      } else {
                        L8: {
                          if (-var7 + (var3 + -7) < field_b.length) {
                            stackOut_33_0 = field_b[-7 + (var3 + -var7)];
                            stackIn_34_0 = stackOut_33_0;
                            break L8;
                          } else {
                            stackOut_32_0 = "";
                            stackIn_34_0 = stackOut_32_0;
                            break L8;
                          }
                        }
                        var6_ref = stackIn_34_0;
                        break L3;
                      }
                    }
                  }
                }
              }
              L9: {
                if (-2 != var4) {
                  break L9;
                } else {
                  var6_ref = Integer.toString(var2);
                  break L9;
                }
              }
              L10: {
                stackOut_37_0 = (String) var6_ref;
                stackOut_37_1 = 0;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if ((var4 ^ -1) > -1) {
                  stackOut_39_0 = (String) (Object) stackIn_39_0;
                  stackOut_39_1 = stackIn_39_1;
                  stackOut_39_2 = 0;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L10;
                } else {
                  stackOut_38_0 = (String) (Object) stackIn_38_0;
                  stackOut_38_1 = stackIn_38_1;
                  stackOut_38_2 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L10;
                }
              }
              L11: {
                var7 = vm.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0);
                var8 = -(var7 >> 1623923713) + cn.field_w;
                if (0 > var4) {
                  break L11;
                } else {
                  L12: {
                    var1 = var1 + sm.field_b;
                    if (dc.field_l.field_c == var4) {
                      stackOut_43_0 = cs.field_l;
                      stackIn_44_0 = stackOut_43_0;
                      break L12;
                    } else {
                      stackOut_42_0 = kr.field_a;
                      stackIn_44_0 = stackOut_42_0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = stackIn_44_0;
                    if (var9 != null) {
                      var9.a((ar.field_i << 1355242081) + id.field_b, -tr.field_Lb + var8, var1, (tr.field_Lb << 1477060257) + var7, -106);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var1 = var1 + ar.field_i;
                  break L11;
                }
              }
              if (0 <= var4) {
                ql.field_n.d(var6_ref, var8, var1 - -je.field_g, var5, -1);
                var1 = var1 + (id.field_b + (sm.field_b + ar.field_i));
                var3++;
                continue L1;
              } else {
                um.field_c.d(var6_ref, var8, dp.field_v + var1, var5, -1);
                var1 = var1 + e.field_d;
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 74) {
            kd.a((byte) -48);
        }
    }

    final static void a(int param0, int param1) {
        if (ah.field_U >= param1) {
            return;
        }
        if (param0 != 23299) {
            field_c = null;
        }
        u.field_c = new int[param1];
        cb.field_o = new int[param1];
        ah.field_U = param1;
        wb.field_b = new int[param1];
        rl.field_b = new boolean[param1];
        ol.field_a = new int[param1];
        hs.field_i = new int[param1];
        oe.field_i = new int[param1];
        u.field_d = new int[param1];
        ei.field_d = new int[param1];
        ig.field_c = new int[param1];
        ue.field_e = new int[param1];
        ja.field_i = new int[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Offer draw";
    }
}
