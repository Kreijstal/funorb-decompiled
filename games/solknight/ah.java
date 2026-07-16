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
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        wc.field_a = param1;
        var2 = (ud) (Object) uc.field_j.a((byte) 51);
        L0: while (true) {
          if (var2 == null) {
            if (param0 < -48) {
              if (la.field_j == null) {
                return;
              } else {
                var2 = (ud) (Object) la.field_j.a((byte) 51);
                L1: while (true) {
                  if (var2 == null) {
                    return;
                  } else {
                    L2: {
                      if (!var2.field_m.a(false)) {
                        var2.c(10);
                        break L2;
                      } else {
                        var2.field_h.h(wc.field_a * var2.field_l - -128 >> 548518056);
                        break L2;
                      }
                    }
                    var2 = (ud) (Object) la.field_j.b(-33);
                    continue L1;
                  }
                }
              }
            } else {
              ah.a(false, -78);
              if (la.field_j != null) {
                var2 = (ud) (Object) la.field_j.a((byte) 51);
                L3: while (true) {
                  if (var2 != null) {
                    L4: {
                      if (!var2.field_m.a(false)) {
                        var2.c(10);
                        break L4;
                      } else {
                        var2.field_h.h(wc.field_a * var2.field_l - -128 >> 548518056);
                        break L4;
                      }
                    }
                    var2 = (ud) (Object) la.field_j.b(-33);
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L5: {
              if (var2.field_m.a(false)) {
                var2.field_h.h(wc.field_a * var2.field_l + 128 >> -249698456);
                break L5;
              } else {
                var2.c(10);
                break L5;
              }
            }
            var2 = (ud) (Object) uc.field_j.b(-78);
            continue L0;
          }
        }
    }

    final static void a(o param0, boolean param1) {
        if (param1) {
            field_i = null;
            dc.field_j = param0;
            return;
        }
        dc.field_j = param0;
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
            Object var2 = null;
            ah.a((o) null, false);
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = -wd.field_c + 320;
        var3 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
        if (param0) {
          L0: {
            var4 = kd.field_b[kb.field_b];
            if ((kb.field_b ^ -1) == -2) {
              var4 = var4 * 3 / 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (kb.field_b != 2) {
              break L1;
            } else {
              var4 = 3 * var4 / 4;
              break L1;
            }
          }
          L2: {
            if (3 != kb.field_b) {
              break L2;
            } else {
              var4 = var4 * 2 / 4;
              break L2;
            }
          }
          L3: {
            if (4 == kb.field_b) {
              var4 = 2 * var4 / 4;
              break L3;
            } else {
              break L3;
            }
          }
          of.field_d.c(-var4 + var2, var3 - var4 - -k.field_c, 2 * var4, var4 * 2);
          if ((k.field_c ^ -1) < -11) {
            ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
            if (param1 == 7) {
              return;
            } else {
              ah.b(true);
              return;
            }
          } else {
            if (param1 == 7) {
              return;
            } else {
              ah.b(true);
              return;
            }
          }
        } else {
          L4: {
            L5: {
              if (f.field_d == 0) {
                break L5;
              } else {
                if ((f.field_d % 10 ^ -1) <= -6) {
                  ak.field_e[kb.field_b].d(var2 + -(ak.field_e[kb.field_b].field_q / 2), var3 + -(ak.field_e[kb.field_b].field_r / 2), 16777215);
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            ak.field_e[kb.field_b].a(128, var3, 90, 0, var2);
            break L4;
          }
          L6: {
            var4 = kb.field_b << 2057858019;
            var5 = -1;
            if (-1 != (kb.field_b ^ -1)) {
              break L6;
            } else {
              var5 = 7 - (1 + wb.field_b) / 2;
              break L6;
            }
          }
          L7: {
            if ((kb.field_b ^ -1) == -2) {
              var5 = 7 - (1 + wb.field_b) / 2;
              var4 = 16;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if ((kb.field_b ^ -1) != -3) {
              break L8;
            } else {
              var4 = 8;
              var5 = 7 + -((wb.field_b + 1) / 2);
              break L8;
            }
          }
          L9: {
            if (-4 == (kb.field_b ^ -1)) {
              var5 = -((wb.field_b + 5) / 6) + 7;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (4 == kb.field_b) {
              if (6 <= wb.field_b) {
                var5 = -wb.field_b + 13;
                break L10;
              } else {
                L11: {
                  var5 = 5 - wb.field_b;
                  if (-6 != (kb.field_b ^ -1)) {
                    break L11;
                  } else {
                    var5 = 7 - wb.field_b;
                    break L11;
                  }
                }
                L12: {
                  if (kb.field_b == 6) {
                    L13: {
                      var5 = 4;
                      if ((wb.field_b ^ -1) < -6) {
                        var5 = 3;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (wb.field_b <= 10) {
                        break L14;
                      } else {
                        var5 = 2;
                        break L14;
                      }
                    }
                    L15: {
                      if (wb.field_b <= 15) {
                        break L15;
                      } else {
                        var5 = 1;
                        break L15;
                      }
                    }
                    L16: {
                      if (wb.field_b <= 20) {
                        break L16;
                      } else {
                        var5 = 0;
                        break L16;
                      }
                    }
                    if (-41 <= (wb.field_b ^ -1)) {
                      break L12;
                    } else {
                      L17: {
                        var5 = 7;
                        if (wb.field_b % 10 <= 2) {
                          break L17;
                        } else {
                          var5 = 6;
                          break L17;
                        }
                      }
                      if (-6 <= (wb.field_b % 10 ^ -1)) {
                        break L12;
                      } else {
                        var5 = 5;
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                L18: {
                  if ((kb.field_b ^ -1) == -8) {
                    L19: {
                      var5 = 0;
                      if (wb.field_b > 0) {
                        var5 = wb.field_b / 2 % 2 + 6;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (-51 <= (wb.field_b ^ -1)) {
                        break L20;
                      } else {
                        var5 = 5;
                        break L20;
                      }
                    }
                    L21: {
                      if ((wb.field_b ^ -1) < -76) {
                        var5 = 4;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (-101 <= (wb.field_b ^ -1)) {
                        break L22;
                      } else {
                        var5 = 3;
                        break L22;
                      }
                    }
                    L23: {
                      if (-126 <= (wb.field_b ^ -1)) {
                        break L23;
                      } else {
                        var5 = 2;
                        break L23;
                      }
                    }
                    if ((wb.field_b ^ -1) >= -151) {
                      break L18;
                    } else {
                      var5 = 1;
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
                L24: {
                  if (var5 >= 0) {
                    break L24;
                  } else {
                    var5 = 0;
                    break L24;
                  }
                }
                L25: {
                  if (var5 > 7) {
                    var5 = 7;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
                  if (param1 == 7) {
                    break L26;
                  } else {
                    ah.b(true);
                    break L26;
                  }
                }
                return;
              }
            } else {
              break L10;
            }
          }
          L27: {
            if (-6 != (kb.field_b ^ -1)) {
              break L27;
            } else {
              var5 = 7 - wb.field_b;
              break L27;
            }
          }
          if (kb.field_b == 6) {
            L28: {
              var5 = 4;
              if ((wb.field_b ^ -1) < -6) {
                var5 = 3;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (wb.field_b <= 10) {
                break L29;
              } else {
                var5 = 2;
                break L29;
              }
            }
            L30: {
              if (wb.field_b <= 15) {
                break L30;
              } else {
                var5 = 1;
                break L30;
              }
            }
            L31: {
              if (wb.field_b <= 20) {
                break L31;
              } else {
                var5 = 0;
                break L31;
              }
            }
            L32: {
              if (-41 <= (wb.field_b ^ -1)) {
                break L32;
              } else {
                L33: {
                  var5 = 7;
                  if (wb.field_b % 10 <= 2) {
                    break L33;
                  } else {
                    var5 = 6;
                    break L33;
                  }
                }
                if (-6 <= (wb.field_b % 10 ^ -1)) {
                  break L32;
                } else {
                  var5 = 5;
                  break L32;
                }
              }
            }
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
              L39: {
                if ((wb.field_b ^ -1) >= -151) {
                  break L39;
                } else {
                  var5 = 1;
                  break L39;
                }
              }
              L40: {
                if (var5 >= 0) {
                  break L40;
                } else {
                  var5 = 0;
                  break L40;
                }
              }
              L41: {
                if (var5 > 7) {
                  var5 = 7;
                  break L41;
                } else {
                  break L41;
                }
              }
              td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
              if (param1 == 7) {
                return;
              } else {
                ah.b(true);
                return;
              }
            } else {
              L42: {
                if (var5 >= 0) {
                  break L42;
                } else {
                  var5 = 0;
                  break L42;
                }
              }
              L43: {
                if (var5 > 7) {
                  var5 = 7;
                  break L43;
                } else {
                  break L43;
                }
              }
              td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
              if (param1 != 7) {
                ah.b(true);
                return;
              } else {
                return;
              }
            }
          } else {
            L44: {
              if ((kb.field_b ^ -1) == -8) {
                L45: {
                  var5 = 0;
                  if (wb.field_b > 0) {
                    var5 = wb.field_b / 2 % 2 + 6;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L46: {
                  if (-51 <= (wb.field_b ^ -1)) {
                    break L46;
                  } else {
                    var5 = 5;
                    break L46;
                  }
                }
                L47: {
                  if ((wb.field_b ^ -1) < -76) {
                    var5 = 4;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (-101 <= (wb.field_b ^ -1)) {
                    break L48;
                  } else {
                    var5 = 3;
                    break L48;
                  }
                }
                L49: {
                  if (-126 <= (wb.field_b ^ -1)) {
                    break L49;
                  } else {
                    var5 = 2;
                    break L49;
                  }
                }
                if ((wb.field_b ^ -1) >= -151) {
                  break L44;
                } else {
                  var5 = 1;
                  break L44;
                }
              } else {
                break L44;
              }
            }
            L50: {
              if (var5 >= 0) {
                break L50;
              } else {
                var5 = 0;
                break L50;
              }
            }
            L51: {
              if (var5 > 7) {
                var5 = 7;
                break L51;
              } else {
                break L51;
              }
            }
            td.field_e[var4 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
            if (param1 != 7) {
              ah.b(true);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, qc param2) {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        jd var7 = id.field_c;
        jd var8 = var7;
        var8.e(param1, -2147483648);
        var8.field_m = var8.field_m + 1;
        int var4 = var8.field_m;
        var8.c(-118, 1);
        var8.a(true, param2.field_u);
        var8.a(true, param2.field_m);
        var8.a(true, param2.field_p);
        var8.b(param2.field_k, false);
        var8.b(param2.field_j, false);
        var8.b(param2.field_t, false);
        var8.b(param2.field_q, param0);
        var8.c(-105, param2.field_r.length);
        for (var5 = 0; param2.field_r.length > var5; var5++) {
            var7.b(param2.field_r[var5], false);
        }
        int discarded$0 = var8.b(true, var4);
        var8.b(1, -var4 + var8.field_m);
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 >= -110) {
          L0: {
            int discarded$2 = ah.a(-61, (byte) -98);
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
                bi.field_b = tk.a(bi.field_i, 15, new int[1], 65520, 3, lc.field_h, (byte) -115, ic.field_t, lk.field_e);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[10];
        field_g = "Continue";
        field_j = new wh();
        field_h = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = "Names can only contain letters, numbers, spaces and underscores";
    }
}
