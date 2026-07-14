/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static ea field_c;
    static int field_b;
    static int[] field_a;
    static wh field_d;

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = fe.a((byte) 74, param0, var10);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 - -1;
        }
        if (!param1) {
            field_a = null;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    public static void b(boolean param0) {
        if (!param0) {
            h.a(true);
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        ri.a((byte) -112, bm.c(-125));
        if (param0) {
            h.b(true);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = MinerDisturbance.field_ab;
          if (param4 < 0) {
            break L0;
          } else {
            if (param1 >= dj.field_f) {
              break L0;
            } else {
              L1: {
                if (param8 >= 0) {
                  break L1;
                } else {
                  if (param3 >= 0) {
                    break L1;
                  } else {
                    if (param5 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (dj.field_b > param8) {
                  break L2;
                } else {
                  if (dj.field_b > param3) {
                    break L2;
                  } else {
                    if (param5 >= dj.field_b) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = param4 - param1;
                  if (param1 != param0) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (param1 != param4) {
                          break L6;
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param3 << -1114714096;
                          var9 = param8 << 2126563632;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var15 = param4 + -param0;
                        if (param8 >= param3) {
                          break L7;
                        } else {
                          var12 = (-param3 + param5 << -2022037648) / var15;
                          var11 = (param5 - param8 << -1657970416) / var14;
                          var10 = param3 << 1854380592;
                          var9 = param8 << 47978576;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = (param5 - param3 << -2094796368) / var15;
                      var12 = (-param8 + param5 << -566298672) / var14;
                      var10 = param8 << -126586000;
                      var9 = param3 << 1344885200;
                      break L5;
                    }
                    var13 = 0;
                    if (param1 < 0) {
                      param1 = Math.min(-param1, param0 + -param1);
                      var10 = var10 + var12 * param1;
                      var9 = var9 + var11 * param1;
                      param1 = 0;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L8: {
                  L9: {
                    var10 = param8 << -1974104400;
                    var9 = param8 << -1974104400;
                    var15 = param0 - param1;
                    var12 = (-param8 + param5 << 2102393680) / var14;
                    var11 = (-param8 + param3 << 2017400976) / var15;
                    if (var12 > var11) {
                      break L9;
                    } else {
                      var13 = 1;
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      if (0 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var13 = 0;
                  break L8;
                }
                L10: {
                  L11: {
                    if (param1 >= 0) {
                      break L11;
                    } else {
                      L12: {
                        if (param0 < 0) {
                          break L12;
                        } else {
                          param1 = -param1;
                          var9 = var9 + var11 * param1;
                          var10 = var10 + var12 * param1;
                          param1 = 0;
                          if (0 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      param1 = -param1 + param0;
                      var9 = var9 + var11 * param1;
                      var10 = var10 + param1 * var12;
                      param1 = param0;
                      if (0 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var16 = dj.field_a[param1];
                  L13: while (true) {
                    if (param1 >= param0) {
                      break L10;
                    } else {
                      L14: {
                        var17 = var9 >> -1688898736;
                        if (dj.field_b > var17) {
                          L15: {
                            var18 = -(var9 >> 33404176) + (var10 >> 1428959280);
                            if (var18 != 0) {
                              break L15;
                            } else {
                              if (var17 < 0) {
                                break L14;
                              } else {
                                if (var17 >= dj.field_b) {
                                  break L14;
                                } else {
                                  s.a(param2, param6 ^ 13611, var17 - -var16, param7, var18);
                                  if (0 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                          }
                          L16: {
                            if (dj.field_b <= var18 + var17) {
                              var18 = -var17 + (dj.field_b - 1);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (0 > var17) {
                              break L17;
                            } else {
                              s.a(param2, -1, var17 - -var16, param7, var18);
                              if (0 == 0) {
                                break L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                          s.a(param2, -1, var16, param7, var17 + var18);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      param1++;
                      if (param1 < dj.field_f) {
                        var9 = var9 + var11;
                        var10 = var10 + var12;
                        var16 = var16 + eh.field_g;
                        if (0 == 0) {
                          continue L13;
                        } else {
                          break L10;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L18: {
                  var16 = -param0 + param4;
                  if (var16 != 0) {
                    break L18;
                  } else {
                    var12 = 0;
                    var11 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  L20: {
                    if (var13 != 0) {
                      break L20;
                    } else {
                      var9 = param3 << -1720407056;
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  var10 = param3 << -250482480;
                  break L19;
                }
                var17 = param5 << -994634000;
                var11 = (var17 - var9) / var16;
                var12 = (-var10 + var17) / var16;
                break L3;
              }
              if (param6 == -13612) {
                L21: {
                  if (0 > param1) {
                    param1 = -param1;
                    var10 = var10 + param1 * var12;
                    var9 = var9 + param1 * var11;
                    param1 = 0;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  var15 = dj.field_a[param1];
                  if (param4 <= param1) {
                    break L22;
                  } else {
                    L23: {
                      var16 = var9 >> -1759816432;
                      if (var16 < dj.field_b) {
                        L24: {
                          var17 = (var10 >> 1440157136) - (var9 >> -887921776);
                          if (var17 == 0) {
                            break L24;
                          } else {
                            L25: {
                              if (var16 + var17 >= dj.field_b) {
                                var17 = -1 + (dj.field_b - var16);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (0 <= var16) {
                                break L26;
                              } else {
                                s.a(param2, -1, var15, param7, var17 - -var16);
                                if (0 == 0) {
                                  break L23;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            s.a(param2, -1, var15 + var16, param7, var17);
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (var16 < 0) {
                          break L23;
                        } else {
                          if (var16 >= dj.field_b) {
                            break L23;
                          } else {
                            s.a(param2, param6 + 13611, var16 - -var15, param7, var17);
                            break L23;
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                    param1++;
                    if (param1 >= dj.field_f) {
                      return;
                    } else {
                      var15 = var15 + eh.field_g;
                      var10 = var10 + var12;
                      var9 = var9 + var11;
                      break L22;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (!oc.d(param0 + 59)) {
            return;
        }
        qd.a(126, false, param0);
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hf var4_ref_hf = null;
        byte[] var5 = null;
        int var6 = 0;
        Object var7 = null;
        byte[] var8 = null;
        af var9 = null;
        ld var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        L0: {
          var6 = MinerDisturbance.field_ab;
          var10 = kj.field_a;
          if (param0 > 105) {
            break L0;
          } else {
            var7 = null;
            h.a(66, 0, (int[]) null, -109, -10, 74, -76, 25, -33);
            break L0;
          }
        }
        L1: {
          var2 = var10.d((byte) -54);
          if (0 == var2) {
            var9 = (af) (Object) ag.field_b.b(108);
            if (var9 != null) {
              L2: {
                var4 = var10.d((byte) -54);
                if (0 != var4) {
                  var14 = new byte[var4];
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var8 = var11;
                  var5 = var8;
                  var10.a(var14, (byte) -120, 0, var4);
                  break L2;
                } else {
                  var5 = null;
                  break L2;
                }
              }
              var10.field_o = var10.field_o + 4;
              if (!var10.f(0)) {
                si.a(-56);
                return;
              } else {
                var9.field_t = var5;
                var9.field_q = true;
                var9.b(34);
                break L1;
              }
            } else {
              si.a(-37);
              return;
            }
          } else {
            if (-2 == (var2 ^ -1)) {
              var3 = var10.b((byte) 119);
              var4_ref_hf = (hf) (Object) kk.field_a.b(109);
              L3: while (true) {
                L4: {
                  if (var4_ref_hf == null) {
                    break L4;
                  } else {
                    if (var3 != var4_ref_hf.field_o) {
                      var4_ref_hf = (hf) (Object) kk.field_a.b((byte) 56);
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var4_ref_hf == null) {
                  si.a(-60);
                  return;
                } else {
                  var4_ref_hf.b(34);
                  break L1;
                }
              }
            } else {
              di.a((Throwable) null, 1, "A1: " + hj.a((byte) 118));
              si.a(-56);
              break L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = new int[8192];
    }
}
