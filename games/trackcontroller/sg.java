/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    String field_g;
    kk field_c;
    String field_f;
    String field_b;
    int field_h;
    static ba field_d;
    static String field_e;
    static kk field_a;

    final static void a(java.awt.Frame param0, byte param1, uf param2) {
        ce var3 = null;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (param1 == -105) {
            break L0;
          } else {
            sg.a(97, 56, -128, -60, -109, -37);
            break L0;
          }
        }
        L1: while (true) {
          var3 = param2.a(param0, -59);
          L2: while (true) {
            if (var3.field_f != 0) {
              if (var3.field_f == 1) {
                param0.setVisible(false);
                param0.dispose();
                return;
              } else {
                wl.a(100L, false);
                continue L1;
              }
            } else {
              wl.a(10L, false);
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        ti.field_j[oe.field_c] = param1;
        lf.field_Y[oe.field_c] = oe.field_c;
        if (param5 != -733) {
          return;
        } else {
          L0: {
            g.field_u[oe.field_c] = param4;
            if (vi.field_d >= param4) {
              break L0;
            } else {
              sd.field_b = param4;
              break L0;
            }
          }
          L1: {
            if (fj.field_U > param4) {
              mj.field_d = param4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            ii.field_q[oe.field_c] = param0;
            qf.field_a[oe.field_c] = param2;
            qi.field_b[oe.field_c] = param3;
            var6 = param3 + (param2 + param0);
            if (var6 != 0) {
              stackOut_8_0 = param0 * 1000 / var6;
              stackIn_9_0 = stackOut_8_0;
              break L2;
            } else {
              stackOut_7_0 = 0;
              stackIn_9_0 = stackOut_7_0;
              break L2;
            }
          }
          L3: {
            var7 = stackIn_9_0;
            va.field_e[oe.field_c] = var7;
            if (var7 >= mj.field_d) {
              break L3;
            } else {
              mj.field_d = var7;
              break L3;
            }
          }
          L4: {
            oe.field_c = oe.field_c + 1;
            if (var7 <= sd.field_b) {
              break L4;
            } else {
              sd.field_b = var7;
              break L4;
            }
          }
          return;
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TrackController.field_F ? 1 : 0;
          if (param3 >= 68) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var6 = -param4 + param5;
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= var6) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var8 = param1.charAt(var7 + param4);
                      if ((var8 ^ -1) >= -1) {
                        break L6;
                      } else {
                        if (var8 < 128) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 < 160) {
                      break L4;
                    } else {
                      if (255 < var8) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param2[var7 + param0] = (byte)var8;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
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
                        param2[param0 + var7] = (byte)-126;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var8 != 402) {
                        break L9;
                      } else {
                        param2[param0 + var7] = (byte)-125;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var8 == 8222) {
                        break L10;
                      } else {
                        L11: {
                          if (var8 != 8230) {
                            break L11;
                          } else {
                            param2[var7 + param0] = (byte)-123;
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
                              if (8225 == var8) {
                                break L13;
                              } else {
                                L14: {
                                  if (710 == var8) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (var8 != 8240) {
                                        break L15;
                                      } else {
                                        param2[var7 + param0] = (byte)-119;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (352 != var8) {
                                        break L16;
                                      } else {
                                        param2[param0 - -var7] = (byte)-118;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var8 == 8249) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (338 == var8) {
                                            break L18;
                                          } else {
                                            L19: {
                                              if (var8 == 381) {
                                                break L19;
                                              } else {
                                                L20: {
                                                  if (var8 != 8216) {
                                                    break L20;
                                                  } else {
                                                    param2[param0 - -var7] = (byte)-111;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  if (8217 == var8) {
                                                    break L21;
                                                  } else {
                                                    L22: {
                                                      if (var8 == 8220) {
                                                        break L22;
                                                      } else {
                                                        L23: {
                                                          if (var8 != 8221) {
                                                            break L23;
                                                          } else {
                                                            param2[param0 - -var7] = (byte)-108;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        L24: {
                                                          if (8226 == var8) {
                                                            break L24;
                                                          } else {
                                                            L25: {
                                                              if (var8 != 8211) {
                                                                break L25;
                                                              } else {
                                                                param2[var7 + param0] = (byte)-106;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              }
                                                            }
                                                            L26: {
                                                              if (var8 == 8212) {
                                                                break L26;
                                                              } else {
                                                                L27: {
                                                                  if (var8 != 732) {
                                                                    break L27;
                                                                  } else {
                                                                    param2[param0 - -var7] = (byte)-104;
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
                                                                          if (var8 == 8250) {
                                                                            break L30;
                                                                          } else {
                                                                            L31: {
                                                                              if (339 != var8) {
                                                                                break L31;
                                                                              } else {
                                                                                param2[param0 - -var7] = (byte)-100;
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
                                                                                  if (376 != var8) {
                                                                                    break L33;
                                                                                  } else {
                                                                                    param2[param0 - -var7] = (byte)-97;
                                                                                    if (0 == 0) {
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L33;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                param2[var7 + param0] = (byte)63;
                                                                                if (0 == 0) {
                                                                                  break L3;
                                                                                } else {
                                                                                  break L32;
                                                                                }
                                                                              }
                                                                            }
                                                                            param2[var7 + param0] = (byte)-98;
                                                                            if (0 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L30;
                                                                            }
                                                                          }
                                                                        }
                                                                        param2[param0 + var7] = (byte)-101;
                                                                        if (0 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L29;
                                                                        }
                                                                      }
                                                                    }
                                                                    param2[param0 + var7] = (byte)-102;
                                                                    if (0 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                                param2[param0 - -var7] = (byte)-103;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                            param2[var7 + param0] = (byte)-105;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        param2[var7 + param0] = (byte)-107;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    param2[param0 - -var7] = (byte)-109;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                param2[var7 + param0] = (byte)-110;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            param2[var7 + param0] = (byte)-114;
                                            if (0 == 0) {
                                              break L3;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        param2[var7 + param0] = (byte)-116;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    param2[param0 - -var7] = (byte)-117;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                param2[param0 + var7] = (byte)-120;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            param2[var7 + param0] = (byte)-121;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L12;
                            }
                          }
                        }
                        param2[var7 + param0] = (byte)-122;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param2[param0 + var7] = (byte)-124;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  }
                }
                param2[param0 - -var7] = (byte)-128;
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

    private sg() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -8217) {
            sg.a(-34);
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ba();
        field_e = "Return to game";
    }
}
