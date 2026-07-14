/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static wb field_a;
    int field_c;
    int field_e;
    int field_j;
    int field_f;
    byte[] field_g;
    byte[] field_h;
    int field_b;
    int field_i;
    int field_d;

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 8230) {
            break L0;
          } else {
            var4 = null;
            mq.a((fr) null, (byte) 109);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (param1 > var2) {
            if (!wm.field_f[var2]) {
              return false;
            } else {
              var2++;
              continue L1;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 89) {
            field_a = null;
        }
    }

    final static void a(fr param0, byte param1) {
        ip var8 = null;
        byte[] var14 = null;
        qb var10 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        int var2 = 71 / ((param1 - 40) / 59);
        if (!(null != ic.field_b)) {
            var8 = new ip();
            var14 = var8.a((byte) 10, 128, 128, 16);
            ic.field_b = aj.a((byte) -123, var14, false);
        }
        if (qu.field_j == null) {
            var10 = new qb();
            var15 = var10.a(16, (byte) -8, 128, 128);
            qu.field_j = aj.a((byte) -117, var15, false);
        }
        b var12 = param0.field_Sb;
        if (var12.b((byte) -101)) {
            if (!(null != dj.field_m)) {
                var16 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, (ab) (Object) new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
                dj.field_m = aj.a((byte) -126, var16, false);
            }
        }
    }

    final static int a(int param0, byte[] param1, byte param2, CharSequence param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          var6 = -param0 + param4;
          var7 = 0;
          if (param2 < -106) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var6 <= var7) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    var8 = param3.charAt(var7 + param0);
                    if ((var8 ^ -1) >= -1) {
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
                    if (var8 == 8364) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 != 8218) {
                          break L8;
                        } else {
                          param1[var7 + param5] = (byte)-126;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (402 != var8) {
                          break L9;
                        } else {
                          param1[param5 - -var7] = (byte)-125;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var8 != 8222) {
                          break L10;
                        } else {
                          param1[param5 - -var7] = (byte)-124;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var8 == 8230) {
                          break L11;
                        } else {
                          L12: {
                            if (var8 == 8224) {
                              break L12;
                            } else {
                              L13: {
                                if (8225 != var8) {
                                  break L13;
                                } else {
                                  param1[var7 + param5] = (byte)-121;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (710 != var8) {
                                  break L14;
                                } else {
                                  param1[param5 - -var7] = (byte)-120;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L15: {
                                if (var8 == 8240) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (var8 == 352) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (var8 == 8249) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (338 == var8) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (var8 != 381) {
                                                  break L19;
                                                } else {
                                                  param1[var7 + param5] = (byte)-114;
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
                                                        if (8220 == var8) {
                                                          break L22;
                                                        } else {
                                                          L23: {
                                                            if (var8 == 8221) {
                                                              break L23;
                                                            } else {
                                                              L24: {
                                                                if (var8 != 8226) {
                                                                  break L24;
                                                                } else {
                                                                  param1[var7 + param5] = (byte)-107;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L24;
                                                                  }
                                                                }
                                                              }
                                                              L25: {
                                                                if (var8 == 8211) {
                                                                  break L25;
                                                                } else {
                                                                  L26: {
                                                                    if (8212 != var8) {
                                                                      break L26;
                                                                    } else {
                                                                      param1[var7 + param5] = (byte)-105;
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
                                                                      param1[param5 + var7] = (byte)-104;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  L28: {
                                                                    if (8482 != var8) {
                                                                      break L28;
                                                                    } else {
                                                                      param1[param5 - -var7] = (byte)-103;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L28;
                                                                      }
                                                                    }
                                                                  }
                                                                  L29: {
                                                                    if (var8 == 353) {
                                                                      break L29;
                                                                    } else {
                                                                      L30: {
                                                                        if (var8 == 8250) {
                                                                          break L30;
                                                                        } else {
                                                                          L31: {
                                                                            if (var8 == 339) {
                                                                              break L31;
                                                                            } else {
                                                                              L32: {
                                                                                if (var8 != 382) {
                                                                                  break L32;
                                                                                } else {
                                                                                  param1[param5 + var7] = (byte)-98;
                                                                                  if (0 == 0) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    break L32;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L33: {
                                                                                if (376 != var8) {
                                                                                  break L33;
                                                                                } else {
                                                                                  param1[param5 + var7] = (byte)-97;
                                                                                  if (0 == 0) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param1[param5 + var7] = (byte)63;
                                                                              if (0 == 0) {
                                                                                break L3;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          param1[param5 - -var7] = (byte)-100;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      param1[var7 + param5] = (byte)-101;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  param1[param5 + var7] = (byte)-102;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              param1[var7 + param5] = (byte)-106;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          param1[param5 - -var7] = (byte)-108;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      param1[var7 + param5] = (byte)-109;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  param1[var7 + param5] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              param1[param5 + var7] = (byte)-111;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          param1[param5 - -var7] = (byte)-116;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      param1[var7 + param5] = (byte)-117;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  param1[var7 + param5] = (byte)-118;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              param1[var7 + param5] = (byte)-119;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L12;
                              }
                            }
                          }
                          param1[var7 + param5] = (byte)-122;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L11;
                          }
                        }
                      }
                      param1[param5 - -var7] = (byte)-123;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1[var7 + param5] = (byte)-128;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                param1[param5 + var7] = (byte)var8;
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

    static {
    }
}
