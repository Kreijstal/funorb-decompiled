/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static byte[] field_a;
    static i field_b;
    static cc field_c;
    static boolean[] field_d;
    static tf field_e;

    final static jc a(String param0, int param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jc var7 = null;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        var2 = param0.length();
        if (0 == var2) {
          return hm.field_a;
        } else {
          if ((var2 ^ -1) >= -256) {
            var3 = ji.a('.', (byte) 66, param0);
            if (2 > var3.length) {
              return hm.field_a;
            } else {
              var4 = var3;
              var5 = 0;
              L0: while (true) {
                if (var4.length > var5) {
                  var6 = var4[var5];
                  var7 = ga.a(param1 ^ -4549, var6);
                  if (var7 != null) {
                    return var7;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (param1 == -2734) {
                      break L1;
                    } else {
                      da.a((byte) 4);
                      break L1;
                    }
                  }
                  return oe.a((byte) 86, var3[var3.length + -1]);
                }
              }
            }
          } else {
            return ga.field_e;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -121) {
            field_d = null;
        }
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        fl.a(130, 256, 16694016, kc.field_s, 82 - -param0, (mm) (Object) w.field_kb);
        var2 = 145;
        fb.field_c[0][0].c(82 + param0, var2, 18, 18);
        var2 = var2 + (ga.a(188, 0, var2, cc.field_d, 16, 64, 16777215, (mm) (Object) se.field_S, (byte) -124, 0, 110 + param0) * 16 + 16);
        fb.field_c[1][3].c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(188, 0, var2, dn.field_q, 16, 64, 16777215, (mm) (Object) se.field_S, (byte) -125, 0, 110 - -param0) * 16));
        ri.a(var2, kk.field_n, gi.field_c, -115, 190 + param0, nf.field_e, 0);
        hk.g(309 + param0, 117, 242, 263172);
        var2 = 116;
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(var2 - -14, 256, 16694016, ug.field_n, 322 + param0, (mm) (Object) w.field_kb);
        var2 += 29;
        fl.a(13 + var2, 256, 16777215, vk.field_b[0], param0 + 322, (mm) (Object) se.field_S);
        ph.field_yb[0].c(param0 + 480, var2 - -1);
        var2 += 18;
        fl.a(13 + var2, 256, 16777215, vk.field_b[1], 322 - -param0, (mm) (Object) se.field_S);
        ph.field_yb[1].c(param0 + 480, var2 - -1);
        var2 += 34;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[2], param0 + 322, (mm) (Object) se.field_S);
        ph.field_yb[3].c(480 - -param0, var2 + 1);
        var2 += 18;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[3], param0 + 322, (mm) (Object) se.field_S);
        ph.field_yb[4].c(param0 + 480, var2 - -1);
        ed.a(16777215, 506 - -param0, vk.field_b[4], var2 + 13, (byte) 75, (mm) (Object) se.field_S);
        ph.field_yb[2].c(516 + param0, var2 - -1);
        var2 += 34;
        fl.a(var2 + 13, 256, 16777215, vk.field_b[5], 322 + param0, (mm) (Object) se.field_S);
        if (!param1) {
          return;
        } else {
          ph.field_yb[5].c(param0 + 480, var2 + 1);
          var2 += 34;
          fl.a(14 + var2, 256, 16694016, kc.field_q, param0 + 322, (mm) (Object) w.field_kb);
          var2 += 29;
          fl.a(13 + var2, 256, 16777215, vk.field_b[6], 322 - -param0, (mm) (Object) se.field_S);
          ph.field_yb[6].c(480 + param0, 1 + var2);
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        if (param0 != -109) {
            da.a((byte) -7);
        }
        db.a(-127, param1, param2, false);
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          var6 = -param5 + param0;
          var7 = 0;
          if (param2 == -8218) {
            break L0;
          } else {
            da.a(true, false);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var7 >= var6) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    var8 = param3.charAt(param5 + var7);
                    if (0 >= var8) {
                      break L5;
                    } else {
                      if (var8 < 128) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var8 < 160) {
                      break L6;
                    } else {
                      if (var8 <= 255) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 != 8364) {
                      break L7;
                    } else {
                      param4[param1 + var7] = (byte)-128;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var8 == 8218) {
                      break L8;
                    } else {
                      L9: {
                        if (var8 != 402) {
                          break L9;
                        } else {
                          param4[param1 + var7] = (byte)-125;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (8222 == var8) {
                          break L10;
                        } else {
                          L11: {
                            if (var8 != 8230) {
                              break L11;
                            } else {
                              param4[param1 + var7] = (byte)-123;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var8 == 8224) {
                              break L12;
                            } else {
                              L13: {
                                if (var8 == 8225) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (710 != var8) {
                                      break L14;
                                    } else {
                                      param4[param1 + var7] = (byte)-120;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (8240 == var8) {
                                      break L15;
                                    } else {
                                      L16: {
                                        if (var8 == 352) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if (var8 != 8249) {
                                              break L17;
                                            } else {
                                              param4[var7 + param1] = (byte)-117;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var8 == 338) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (381 != var8) {
                                                  break L19;
                                                } else {
                                                  param4[param1 + var7] = (byte)-114;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              L20: {
                                                if (var8 == 8216) {
                                                  break L20;
                                                } else {
                                                  L21: {
                                                    if (var8 == 8217) {
                                                      break L21;
                                                    } else {
                                                      L22: {
                                                        if (var8 != 8220) {
                                                          break L22;
                                                        } else {
                                                          param4[var7 + param1] = (byte)-109;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      L23: {
                                                        if (var8 != 8221) {
                                                          break L23;
                                                        } else {
                                                          param4[var7 + param1] = (byte)-108;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      L24: {
                                                        if (var8 == 8226) {
                                                          break L24;
                                                        } else {
                                                          L25: {
                                                            if (var8 != 8211) {
                                                              break L25;
                                                            } else {
                                                              param4[param1 + var7] = (byte)-106;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          L26: {
                                                            if (var8 != 8212) {
                                                              break L26;
                                                            } else {
                                                              param4[var7 + param1] = (byte)-105;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L27: {
                                                            if (var8 != 732) {
                                                              break L27;
                                                            } else {
                                                              param4[var7 + param1] = (byte)-104;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          L28: {
                                                            if (var8 == 8482) {
                                                              break L28;
                                                            } else {
                                                              L29: {
                                                                if (353 == var8) {
                                                                  break L29;
                                                                } else {
                                                                  L30: {
                                                                    if (var8 != 8250) {
                                                                      break L30;
                                                                    } else {
                                                                      param4[var7 + param1] = (byte)-101;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  L31: {
                                                                    if (var8 != 339) {
                                                                      break L31;
                                                                    } else {
                                                                      param4[var7 + param1] = (byte)-100;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                  }
                                                                  L32: {
                                                                    if (var8 == 382) {
                                                                      break L32;
                                                                    } else {
                                                                      L33: {
                                                                        if (376 == var8) {
                                                                          break L33;
                                                                        } else {
                                                                          param4[var7 + param1] = (byte)63;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[var7 + param1] = (byte)-97;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[param1 + var7] = (byte)-98;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              param4[param1 - -var7] = (byte)-102;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          param4[param1 - -var7] = (byte)-103;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      param4[param1 + var7] = (byte)-107;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  param4[var7 + param1] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              param4[var7 + param1] = (byte)-111;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          param4[var7 + param1] = (byte)-116;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      param4[param1 + var7] = (byte)-118;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  param4[param1 - -var7] = (byte)-119;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              param4[var7 + param1] = (byte)-121;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L12;
                              }
                            }
                          }
                          param4[param1 - -var7] = (byte)-122;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      param4[param1 + var7] = (byte)-124;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param4[param1 - -var7] = (byte)-126;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                param4[var7 + param1] = (byte)var8;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    final static void a(boolean param0, boolean param1) {
        he.a(param1, -95);
        if (param0) {
            return;
        }
        if (!(null == sl.field_g)) {
            qd.a(sl.field_g, -2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new i();
    }
}
