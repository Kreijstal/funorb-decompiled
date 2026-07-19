/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_g;
    static int[] field_i;
    static int field_f;
    static wh field_j;
    static lf field_d;
    static ci field_e;
    static String field_h;
    static int field_c;
    static se field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        ud var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_9_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            wc.field_a = param1;
            var2 = (ud) ((Object) uc.field_j.a((byte) 51));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2.field_m.a(false);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0) {
                            break L5;
                          } else {
                            var2.c(10);
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var2.field_h.h(wc.field_a * var2.field_l + 128 >> -249698456);
                        break L4;
                      }
                      var2 = (ud) ((Object) uc.field_j.b(-78));
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = param0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L6: {
                if (stackIn_10_0 < -48) {
                  break L6;
                } else {
                  ah.a(false, -78);
                  break L6;
                }
              }
              L7: {
                if (la.field_j != null) {
                  var2 = (ud) ((Object) la.field_j.a((byte) 51));
                  L8: while (true) {
                    if (var2 == null) {
                      break L7;
                    } else {
                      if (var3 == 0) {
                        L9: {
                          if (!var2.field_m.a(false)) {
                            var2.c(10);
                            break L9;
                          } else {
                            var2.field_h.h(wc.field_a * var2.field_l - -128 >> 548518056);
                            if (var3 == 0) {
                              break L9;
                            } else {
                              var2.c(10);
                              break L9;
                            }
                          }
                        }
                        var2 = (ud) ((Object) la.field_j.b(-33));
                        continue L8;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "ah.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(o param0, boolean param1) {
        try {
            if (param1) {
                field_i = (int[]) null;
            }
            dc.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ah.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_i = null;
        field_a = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_j = null;
        if (!param0) {
            o var2 = (o) null;
            ah.a((o) null, false);
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = SolKnight.field_L ? 1 : 0;
            var2 = -wd.field_c + 320;
            var3 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
            if (param0) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (f.field_d == 0) {
                    break L3;
                  } else {
                    if ((f.field_d % 10 ^ -1) <= -6) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ak.field_e[kb.field_b].a(128, var3, 90, 0, var2);
                if (var6 == 0) {
                  L4: {
                    var4 = kb.field_b << 2057858019;
                    var5 = -1;
                    if (-1 != (kb.field_b ^ -1)) {
                      break L4;
                    } else {
                      var5 = 7 - (1 + wb.field_b) / 2;
                      break L4;
                    }
                  }
                  L5: {
                    if ((kb.field_b ^ -1) == -2) {
                      var5 = 7 - (1 + wb.field_b) / 2;
                      var4 = 16;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((kb.field_b ^ -1) != -3) {
                      break L6;
                    } else {
                      var4 = 8;
                      var5 = 7 + -((wb.field_b + 1) / 2);
                      break L6;
                    }
                  }
                  L7: {
                    if (-4 == (kb.field_b ^ -1)) {
                      var5 = -((wb.field_b + 5) / 6) + 7;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (4 == kb.field_b) {
                    L8: {
                      L9: {
                        if (6 <= wb.field_b) {
                          break L9;
                        } else {
                          var5 = 5 - wb.field_b;
                          if (var6 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var5 = -wb.field_b + 13;
                      break L8;
                    }
                    L10: {
                      if (-6 != (kb.field_b ^ -1)) {
                        break L10;
                      } else {
                        var5 = 7 - wb.field_b;
                        break L10;
                      }
                    }
                    if (kb.field_b == 6) {
                      L11: {
                        var5 = 4;
                        if ((wb.field_b ^ -1) < -6) {
                          var5 = 3;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (wb.field_b <= 10) {
                          break L12;
                        } else {
                          var5 = 2;
                          break L12;
                        }
                      }
                      L13: {
                        if (wb.field_b <= 15) {
                          break L13;
                        } else {
                          var5 = 1;
                          break L13;
                        }
                      }
                      L14: {
                        if (wb.field_b <= 20) {
                          break L14;
                        } else {
                          var5 = 0;
                          break L14;
                        }
                      }
                      L15: {
                        if (-41 <= (wb.field_b ^ -1)) {
                          break L15;
                        } else {
                          L16: {
                            var5 = 7;
                            if (wb.field_b % 10 <= 2) {
                              break L16;
                            } else {
                              var5 = 6;
                              break L16;
                            }
                          }
                          if (-6 <= (wb.field_b % 10 ^ -1)) {
                            break L15;
                          } else {
                            var5 = 5;
                            break L15;
                          }
                        }
                      }
                      if ((kb.field_b ^ -1) == -8) {
                        L17: {
                          var5 = 0;
                          if (wb.field_b > 0) {
                            var5 = wb.field_b / 2 % 2 + 6;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (-51 <= (wb.field_b ^ -1)) {
                            break L18;
                          } else {
                            var5 = 5;
                            break L18;
                          }
                        }
                        L19: {
                          if ((wb.field_b ^ -1) < -76) {
                            var5 = 4;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          if (-101 <= (wb.field_b ^ -1)) {
                            break L20;
                          } else {
                            var5 = 3;
                            break L20;
                          }
                        }
                        L21: {
                          if (-126 <= (wb.field_b ^ -1)) {
                            break L21;
                          } else {
                            var5 = 2;
                            break L21;
                          }
                        }
                        L22: {
                          if ((wb.field_b ^ -1) >= -151) {
                            break L22;
                          } else {
                            var5 = 1;
                            break L22;
                          }
                        }
                        L23: {
                          if (var5 >= 0) {
                            break L23;
                          } else {
                            var5 = 0;
                            break L23;
                          }
                        }
                        L24: {
                          if (var5 > 7) {
                            var5 = 7;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
                        if (var6 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        L25: {
                          if (var5 >= 0) {
                            break L25;
                          } else {
                            var5 = 0;
                            break L25;
                          }
                        }
                        L26: {
                          if (var5 > 7) {
                            var5 = 7;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
                          if (var6 == 0) {
                            break L27;
                          } else {
                            L28: {
                              var4 = kd.field_b[kb.field_b];
                              if ((kb.field_b ^ -1) == -2) {
                                var4 = var4 * 3 / 4;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            L29: {
                              if (kb.field_b != 2) {
                                break L29;
                              } else {
                                var4 = 3 * var4 / 4;
                                break L29;
                              }
                            }
                            L30: {
                              if (3 != kb.field_b) {
                                break L30;
                              } else {
                                var4 = var4 * 2 / 4;
                                break L30;
                              }
                            }
                            L31: {
                              if (4 == kb.field_b) {
                                var4 = 2 * var4 / 4;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            of.field_d.c(-var4 + var2, var3 - var4 - -k.field_c, 2 * var4, var4 * 2);
                            if ((k.field_c ^ -1) < -11) {
                              ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
                              break L27;
                            } else {
                              L32: {
                                if (param1 == 7) {
                                  break L32;
                                } else {
                                  ah.b(true);
                                  break L32;
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (param1 == 7) {
                          return;
                        } else {
                          ah.b(true);
                          return;
                        }
                      }
                    } else {
                      L33: {
                        if ((kb.field_b ^ -1) == -8) {
                          L34: {
                            var5 = 0;
                            if (wb.field_b > 0) {
                              var5 = wb.field_b / 2 % 2 + 6;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (-51 <= (wb.field_b ^ -1)) {
                              break L35;
                            } else {
                              var5 = 5;
                              break L35;
                            }
                          }
                          L36: {
                            if ((wb.field_b ^ -1) < -76) {
                              var5 = 4;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (-101 <= (wb.field_b ^ -1)) {
                              break L37;
                            } else {
                              var5 = 3;
                              break L37;
                            }
                          }
                          L38: {
                            if (-126 <= (wb.field_b ^ -1)) {
                              break L38;
                            } else {
                              var5 = 2;
                              break L38;
                            }
                          }
                          if ((wb.field_b ^ -1) >= -151) {
                            break L33;
                          } else {
                            var5 = 1;
                            break L33;
                          }
                        } else {
                          break L33;
                        }
                      }
                      L39: {
                        if (var5 >= 0) {
                          break L39;
                        } else {
                          var5 = 0;
                          break L39;
                        }
                      }
                      L40: {
                        if (var5 > 7) {
                          var5 = 7;
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
                      if (var6 != 0) {
                        L41: {
                          var4 = kd.field_b[kb.field_b];
                          if ((kb.field_b ^ -1) == -2) {
                            var4 = var4 * 3 / 4;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        L42: {
                          if (kb.field_b != 2) {
                            break L42;
                          } else {
                            var4 = 3 * var4 / 4;
                            break L42;
                          }
                        }
                        L43: {
                          if (3 != kb.field_b) {
                            break L43;
                          } else {
                            var4 = var4 * 2 / 4;
                            break L43;
                          }
                        }
                        L44: {
                          if (4 == kb.field_b) {
                            var4 = 2 * var4 / 4;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          of.field_d.c(-var4 + var2, var3 - var4 - -k.field_c, 2 * var4, var4 * 2);
                          if ((k.field_c ^ -1) < -11) {
                            ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        if (param1 == 7) {
                          return;
                        } else {
                          ah.b(true);
                          return;
                        }
                      } else {
                        L46: {
                          if (param1 == 7) {
                            break L46;
                          } else {
                            ah.b(true);
                            break L46;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L47: {
                      if (-6 != (kb.field_b ^ -1)) {
                        break L47;
                      } else {
                        var5 = 7 - wb.field_b;
                        break L47;
                      }
                    }
                    L48: {
                      if (kb.field_b == 6) {
                        L49: {
                          var5 = 4;
                          if ((wb.field_b ^ -1) < -6) {
                            var5 = 3;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        L50: {
                          if (wb.field_b <= 10) {
                            break L50;
                          } else {
                            var5 = 2;
                            break L50;
                          }
                        }
                        L51: {
                          if (wb.field_b <= 15) {
                            break L51;
                          } else {
                            var5 = 1;
                            break L51;
                          }
                        }
                        L52: {
                          if (wb.field_b <= 20) {
                            break L52;
                          } else {
                            var5 = 0;
                            break L52;
                          }
                        }
                        if (-41 <= (wb.field_b ^ -1)) {
                          break L48;
                        } else {
                          L53: {
                            var5 = 7;
                            if (wb.field_b % 10 <= 2) {
                              break L53;
                            } else {
                              var5 = 6;
                              break L53;
                            }
                          }
                          if (-6 <= (wb.field_b % 10 ^ -1)) {
                            break L48;
                          } else {
                            var5 = 5;
                            break L48;
                          }
                        }
                      } else {
                        break L48;
                      }
                    }
                    L54: {
                      if ((kb.field_b ^ -1) == -8) {
                        L55: {
                          var5 = 0;
                          if (wb.field_b > 0) {
                            var5 = wb.field_b / 2 % 2 + 6;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        L56: {
                          if (-51 <= (wb.field_b ^ -1)) {
                            break L56;
                          } else {
                            var5 = 5;
                            break L56;
                          }
                        }
                        L57: {
                          if ((wb.field_b ^ -1) < -76) {
                            var5 = 4;
                            break L57;
                          } else {
                            break L57;
                          }
                        }
                        L58: {
                          if (-101 <= (wb.field_b ^ -1)) {
                            break L58;
                          } else {
                            var5 = 3;
                            break L58;
                          }
                        }
                        L59: {
                          if (-126 <= (wb.field_b ^ -1)) {
                            break L59;
                          } else {
                            var5 = 2;
                            break L59;
                          }
                        }
                        if ((wb.field_b ^ -1) >= -151) {
                          break L54;
                        } else {
                          var5 = 1;
                          break L54;
                        }
                      } else {
                        break L54;
                      }
                    }
                    L60: {
                      if (var5 >= 0) {
                        break L60;
                      } else {
                        var5 = 0;
                        break L60;
                      }
                    }
                    L61: {
                      if (var5 > 7) {
                        var5 = 7;
                        break L61;
                      } else {
                        break L61;
                      }
                    }
                    L62: {
                      td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
                      if (var6 == 0) {
                        break L62;
                      } else {
                        L63: {
                          var4 = kd.field_b[kb.field_b];
                          if ((kb.field_b ^ -1) == -2) {
                            var4 = var4 * 3 / 4;
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        L64: {
                          if (kb.field_b != 2) {
                            break L64;
                          } else {
                            var4 = 3 * var4 / 4;
                            break L64;
                          }
                        }
                        L65: {
                          if (3 != kb.field_b) {
                            break L65;
                          } else {
                            var4 = var4 * 2 / 4;
                            break L65;
                          }
                        }
                        L66: {
                          if (4 == kb.field_b) {
                            var4 = 2 * var4 / 4;
                            break L66;
                          } else {
                            break L66;
                          }
                        }
                        of.field_d.c(-var4 + var2, var3 - var4 - -k.field_c, 2 * var4, var4 * 2);
                        if ((k.field_c ^ -1) < -11) {
                          ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
                          break L62;
                        } else {
                          break L62;
                        }
                      }
                    }
                    L67: {
                      if (param1 == 7) {
                        break L67;
                      } else {
                        ah.b(true);
                        break L67;
                      }
                    }
                    return;
                  }
                } else {
                  break L2;
                }
              }
              L68: {
                ak.field_e[kb.field_b].d(var2 + -(ak.field_e[kb.field_b].field_q / 2), var3 + -(ak.field_e[kb.field_b].field_r / 2), 16777215);
                var4 = kb.field_b << 2057858019;
                var5 = -1;
                if (-1 != (kb.field_b ^ -1)) {
                  break L68;
                } else {
                  var5 = 7 - (1 + wb.field_b) / 2;
                  break L68;
                }
              }
              L69: {
                if ((kb.field_b ^ -1) == -2) {
                  var5 = 7 - (1 + wb.field_b) / 2;
                  var4 = 16;
                  break L69;
                } else {
                  break L69;
                }
              }
              L70: {
                if ((kb.field_b ^ -1) != -3) {
                  break L70;
                } else {
                  var4 = 8;
                  var5 = 7 + -((wb.field_b + 1) / 2);
                  break L70;
                }
              }
              L71: {
                if (-4 == (kb.field_b ^ -1)) {
                  var5 = -((wb.field_b + 5) / 6) + 7;
                  break L71;
                } else {
                  break L71;
                }
              }
              L72: {
                if (4 == kb.field_b) {
                  L73: {
                    if (6 <= wb.field_b) {
                      break L73;
                    } else {
                      var5 = 5 - wb.field_b;
                      if (var6 == 0) {
                        break L72;
                      } else {
                        break L73;
                      }
                    }
                  }
                  var5 = -wb.field_b + 13;
                  break L72;
                } else {
                  break L72;
                }
              }
              L74: {
                if (-6 != (kb.field_b ^ -1)) {
                  break L74;
                } else {
                  var5 = 7 - wb.field_b;
                  break L74;
                }
              }
              L75: {
                if (kb.field_b == 6) {
                  L76: {
                    var5 = 4;
                    if ((wb.field_b ^ -1) < -6) {
                      var5 = 3;
                      break L76;
                    } else {
                      break L76;
                    }
                  }
                  L77: {
                    if (wb.field_b <= 10) {
                      break L77;
                    } else {
                      var5 = 2;
                      break L77;
                    }
                  }
                  L78: {
                    if (wb.field_b <= 15) {
                      break L78;
                    } else {
                      var5 = 1;
                      break L78;
                    }
                  }
                  L79: {
                    if (wb.field_b <= 20) {
                      break L79;
                    } else {
                      var5 = 0;
                      break L79;
                    }
                  }
                  if (-41 <= (wb.field_b ^ -1)) {
                    break L75;
                  } else {
                    L80: {
                      var5 = 7;
                      if (wb.field_b % 10 <= 2) {
                        break L80;
                      } else {
                        var5 = 6;
                        break L80;
                      }
                    }
                    if (-6 <= (wb.field_b % 10 ^ -1)) {
                      break L75;
                    } else {
                      var5 = 5;
                      break L75;
                    }
                  }
                } else {
                  break L75;
                }
              }
              L81: {
                if ((kb.field_b ^ -1) == -8) {
                  L82: {
                    var5 = 0;
                    if (wb.field_b > 0) {
                      var5 = wb.field_b / 2 % 2 + 6;
                      break L82;
                    } else {
                      break L82;
                    }
                  }
                  L83: {
                    if (-51 <= (wb.field_b ^ -1)) {
                      break L83;
                    } else {
                      var5 = 5;
                      break L83;
                    }
                  }
                  L84: {
                    if ((wb.field_b ^ -1) < -76) {
                      var5 = 4;
                      break L84;
                    } else {
                      break L84;
                    }
                  }
                  L85: {
                    if (-101 <= (wb.field_b ^ -1)) {
                      break L85;
                    } else {
                      var5 = 3;
                      break L85;
                    }
                  }
                  L86: {
                    if (-126 <= (wb.field_b ^ -1)) {
                      break L86;
                    } else {
                      var5 = 2;
                      break L86;
                    }
                  }
                  if ((wb.field_b ^ -1) >= -151) {
                    break L81;
                  } else {
                    var5 = 1;
                    break L81;
                  }
                } else {
                  break L81;
                }
              }
              L87: {
                if (var5 >= 0) {
                  break L87;
                } else {
                  var5 = 0;
                  break L87;
                }
              }
              L88: {
                if (var5 > 7) {
                  var5 = 7;
                  break L88;
                } else {
                  break L88;
                }
              }
              L89: {
                td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
                if (var6 == 0) {
                  break L89;
                } else {
                  L90: {
                    var4 = kd.field_b[kb.field_b];
                    if ((kb.field_b ^ -1) == -2) {
                      var4 = var4 * 3 / 4;
                      break L90;
                    } else {
                      break L90;
                    }
                  }
                  L91: {
                    if (kb.field_b != 2) {
                      break L91;
                    } else {
                      var4 = 3 * var4 / 4;
                      break L91;
                    }
                  }
                  L92: {
                    if (3 != kb.field_b) {
                      break L92;
                    } else {
                      var4 = var4 * 2 / 4;
                      break L92;
                    }
                  }
                  L93: {
                    if (4 == kb.field_b) {
                      var4 = 2 * var4 / 4;
                      break L93;
                    } else {
                      break L93;
                    }
                  }
                  of.field_d.c(-var4 + var2, var3 - var4 - -k.field_c, 2 * var4, var4 * 2);
                  if ((k.field_c ^ -1) < -11) {
                    ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
                    break L89;
                  } else {
                    break L89;
                  }
                }
              }
              L94: {
                if (param1 == 7) {
                  break L94;
                } else {
                  ah.b(true);
                  break L94;
                }
              }
              return;
            }
          }
          L95: {
            var4 = kd.field_b[kb.field_b];
            if ((kb.field_b ^ -1) == -2) {
              var4 = var4 * 3 / 4;
              break L95;
            } else {
              break L95;
            }
          }
          L96: {
            if (kb.field_b != 2) {
              break L96;
            } else {
              var4 = 3 * var4 / 4;
              break L96;
            }
          }
          L97: {
            if (3 != kb.field_b) {
              break L97;
            } else {
              var4 = var4 * 2 / 4;
              break L97;
            }
          }
          L98: {
            if (4 == kb.field_b) {
              var4 = 2 * var4 / 4;
              break L98;
            } else {
              break L98;
            }
          }
          of.field_d.c(-var4 + var2, var3 - var4 - -k.field_c, 2 * var4, var4 * 2);
          if ((k.field_c ^ -1) < -11) {
            ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
            break L0;
          } else {
            if (param1 == 7) {
              return;
            } else {
              ah.b(true);
              return;
            }
          }
        }
        if (param1 == 7) {
          return;
        } else {
          ah.b(true);
          return;
        }
    }

    final static void a(boolean param0, int param1, qc param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jd var7 = null;
        jd var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var7 = id.field_c;
            var8 = var7;
            var8.e(param1, -2147483648);
            var8.field_m = var8.field_m + 1;
            var4 = var8.field_m;
            var8.c(-118, 1);
            var8.a(true, param2.field_u);
            var8.a(true, param2.field_m);
            var8.a(true, param2.field_p);
            var8.b(param2.field_k, false);
            var8.b(param2.field_j, false);
            var8.b(param2.field_t, false);
            var8.b(param2.field_q, param0);
            var8.c(-105, param2.field_r.length);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2.field_r.length <= var5) {
                    break L3;
                  } else {
                    var7.b(param2.field_r[var5], false);
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                discarded$1 = var8.b(true, var4);
                var8.b(1, -var4 + var8.field_m);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ah.C(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        if (param1 >= -110) {
          L0: {
            discarded$2 = ah.a(-61, (byte) -98);
            var2 = 0;
            if ((param0 & 7) == 0) {
              break L0;
            } else {
              var2 = 8 + -(7 & param0);
              break L0;
            }
          }
          var3 = param0 - -var2;
          return var3;
        } else {
          L1: {
            var2 = 0;
            if ((param0 & 7) == 0) {
              break L1;
            } else {
              var2 = 8 + -(7 & param0);
              break L1;
            }
          }
          var3 = param0 - -var2;
          return var3;
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          if ((lk.field_e ^ -1) < -1) {
            if (!oa.field_n) {
              if (bi.field_b != null) {
                return;
              } else {
                bi.field_b = tk.a(bi.field_i, 15, new int[]{100 * ud.field_k / qh.field_a[7] + 101 * lk.field_e}, 65520, 3, lc.field_h, (byte) -115, ic.field_t, lk.field_e);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_i = new int[10];
        field_g = "Continue";
        field_j = new wh();
        field_h = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = "Names can only contain letters, numbers, spaces and underscores";
    }
}
