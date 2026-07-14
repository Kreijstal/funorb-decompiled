/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends java.awt.Canvas {
    static int[] field_i;
    static bd field_k;
    private java.awt.Component field_l;
    static String field_j;
    static int field_e;
    static int field_g;
    static gb field_d;
    static String field_f;
    static bd field_h;
    static dh field_c;
    static int field_b;
    static float field_a;

    final static void a(int param0, int param1, int[] param2, p param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = HostileSpawn.field_I ? 1 : 0;
          if (-5 >= (param3.field_e ^ -1)) {
            break L0;
          } else {
            param3.field_e = param3.field_e + 1;
            break L0;
          }
        }
        L1: {
          if (param1 == -11112) {
            break L1;
          } else {
            field_h = null;
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          L3: {
            if ((param3.field_e ^ -1) < -5) {
              break L3;
            } else {
              if ((var4 ^ -1) <= -5) {
                break L3;
              } else {
                L4: {
                  if ((param3.field_e ^ -1) < -5) {
                    break L4;
                  } else {
                    param2[param0] = 0;
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (5 <= var5) {
                          break L6;
                        } else {
                          L7: {
                            param3.field_l.a(1, (byte) 94, param3.field_c);
                            param3.a(param1 + 19685);
                            if (2 == param2[param3.field_j.b(-4)]) {
                              L8: {
                                L9: {
                                  if (4 > param3.field_e) {
                                    break L9;
                                  } else {
                                    param3.field_e = param3.field_e + 1;
                                    if (0 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                param3.field_e = 5;
                                break L8;
                              }
                              param3.field_l.a(-1, (byte) 94, param3.field_c);
                              param3.a(8573);
                              if (0 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var5++;
                          if (0 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = 1;
                      L10: while (true) {
                        L11: {
                          if (var5 >= rc.field_e) {
                            break L11;
                          } else {
                            L12: {
                              L13: {
                                var6 = 0;
                                var7 = 0;
                                var8 = re.field_n[var5];
                                var9 = var8.field_i;
                                var10 = (double)var8.field_j.field_e + var8.field_l.field_f;
                                var12 = (double)var8.field_j.field_g + var8.field_l.field_a;
                                if (-9 == (var9 ^ -1)) {
                                  break L13;
                                } else {
                                  if (var9 == 27) {
                                    break L13;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var12 = var12 - 0.5;
                              var10 = var10 - 0.5;
                              break L12;
                            }
                            L14: {
                              L15: {
                                L16: {
                                  var6 = (int)(24.0 * (-param3.field_l.field_f + ((double)(-param3.field_j.field_e) + var10)));
                                  var7 = (int)(((double)(-param3.field_j.field_g) + var12 - param3.field_l.field_a) * 24.0);
                                  var14 = 24;
                                  if (10 == var9) {
                                    break L16;
                                  } else {
                                    if (var9 == 11) {
                                      break L16;
                                    } else {
                                      if (var9 == 128) {
                                        break L16;
                                      } else {
                                        if (var9 == 129) {
                                          break L16;
                                        } else {
                                          if (var9 == 130) {
                                            break L16;
                                          } else {
                                            if (var9 == 131) {
                                              break L16;
                                            } else {
                                              if (var9 == 132) {
                                                break L16;
                                              } else {
                                                if (var9 == 133) {
                                                  break L16;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (0 == var8.field_h) {
                                  break L14;
                                } else {
                                  var14 = 24;
                                  break L15;
                                }
                              }
                              L17: {
                                if (var9 == 20) {
                                  var14 = 36;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              if (var6 < -var14) {
                                break L14;
                              } else {
                                if (var14 < var6) {
                                  break L14;
                                } else {
                                  if (var7 < -var14) {
                                    break L14;
                                  } else {
                                    if (var7 >= var14) {
                                      break L14;
                                    } else {
                                      if (-1 <= (var8.field_I ^ -1)) {
                                        break L14;
                                      } else {
                                        L18: {
                                          if (var9 < 12) {
                                            break L18;
                                          } else {
                                            if (var9 < 18) {
                                              break L14;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        L19: {
                                          var15 = var8.a(param3.field_i, param1 ^ 11019) ? 1 : 0;
                                          param3.field_e = 5;
                                          var8.field_F = 255;
                                          if (var15 == 0) {
                                            break L19;
                                          } else {
                                            var8.field_I = var8.field_I - 1;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          L21: {
                                            if (param3.field_e >= 4) {
                                              break L21;
                                            } else {
                                              L22: {
                                                if (param3.field_i != 26) {
                                                  break L22;
                                                } else {
                                                  u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                                  break L22;
                                                }
                                              }
                                              param3.field_i = -1;
                                              if (var15 == 0) {
                                                break L20;
                                              } else {
                                                var8.field_I = var8.field_I - 200;
                                                if (!var8.field_b) {
                                                  break L20;
                                                } else {
                                                  if ((var8.field_I ^ -1) < -1) {
                                                    tk.a(8, jc.field_c, 1, true);
                                                    if (0 == 0) {
                                                      break L20;
                                                    } else {
                                                      break L21;
                                                    }
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L23: {
                                            param3.field_e = 5;
                                            if (8 == var9) {
                                              break L23;
                                            } else {
                                              L24: {
                                                L25: {
                                                  if (10 == var9) {
                                                    break L25;
                                                  } else {
                                                    if (var9 == 11) {
                                                      break L25;
                                                    } else {
                                                      if (var9 == 128) {
                                                        break L25;
                                                      } else {
                                                        if (var9 == 129) {
                                                          break L25;
                                                        } else {
                                                          if (130 == var9) {
                                                            break L25;
                                                          } else {
                                                            if (var9 == 131) {
                                                              break L25;
                                                            } else {
                                                              if (132 == var9) {
                                                                break L25;
                                                              } else {
                                                                if (var9 != 133) {
                                                                  break L24;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var8.field_I = var8.field_I - 200;
                                                if (0 == 0) {
                                                  break L20;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                              L26: {
                                                if (var9 != 20) {
                                                  break L26;
                                                } else {
                                                  var8.field_I = var8.field_I - 200;
                                                  if (0 == 0) {
                                                    break L20;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                              if (var8.a((byte) 54)) {
                                                var8.field_I = var8.field_I - 200;
                                                if (0 == 0) {
                                                  break L20;
                                                } else {
                                                  break L23;
                                                }
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          if (var15 != 0) {
                                            var8.field_I = var8.field_I - 200;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L27: {
                                          if (-1 <= (var8.field_I ^ -1)) {
                                            L28: {
                                              var8.field_I = 0;
                                              if (26 == param3.field_i) {
                                                u.a(17, param3.field_j, true, 16, param3.field_l, 4);
                                                break L28;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            param3.field_i = 3;
                                            if (!var8.field_b) {
                                              break L27;
                                            } else {
                                              if (27 == var8.field_i) {
                                                break L27;
                                              } else {
                                                al.field_U[2] = al.field_U[2] + 1;
                                                if (30 == al.field_U[2] + 1) {
                                                  ti.a(248, (byte) -120, 7);
                                                  break L27;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          } else {
                                            break L27;
                                          }
                                        }
                                        nh.a(var8, -29966);
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var5++;
                            if (0 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        param2[param0] = 3;
                        break L4;
                      }
                    }
                  }
                }
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
          }
          L29: {
            L30: {
              if (-5 > (param3.field_e ^ -1)) {
                break L30;
              } else {
                jn.field_F[ib.field_c].field_c = param3.field_c;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
                jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
                jn.field_F[ib.field_c].field_e = 0;
                jn.field_F[ib.field_c].field_h = 5;
                jn.field_F[ib.field_c].field_i = 17;
                ib.field_c = ib.field_c + 1;
                if (0 == 0) {
                  break L29;
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (uj.field_l == 1) {
                if (ej.d((byte) 81)) {
                  eh.field_c.a(em.field_a[0], 50, uh.field_i);
                  break L31;
                } else {
                  break L31;
                }
              } else {
                break L31;
              }
            }
            L32: {
              if (26 == param3.field_i) {
                u.a(-1, param3.field_j, true, 16, param3.field_l, 28);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
              jn.field_F[ib.field_c].field_j.a((byte) 46, param3.field_j);
              jn.field_F[ib.field_c].field_l.a(param3.field_l, -28860);
              jn.field_F[ib.field_c].field_e = 0;
              jn.field_F[ib.field_c].field_h = 1;
              jn.field_F[ib.field_c].field_i = 12;
              ib.field_c = ib.field_c + 1;
              if (5 != param3.field_e) {
                break L33;
              } else {
                hg.a((byte) 64, param3);
                break L33;
              }
            }
            u.a(-1, param3.field_j, true, 16, param3.field_l, 35);
            break L29;
          }
          L34: {
            if (param3.field_e > 4) {
              param3.field_e = param3.field_e + 1;
              break L34;
            } else {
              break L34;
            }
          }
          L35: {
            if (param3.field_e > 9) {
              param3.field_i = -1;
              break L35;
            } else {
              break L35;
            }
          }
          return;
        }
    }

    final static void a(byte param0) {
        g.a((byte) -119, 4);
        if (param0 != -1) {
            field_i = null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((vc) this).field_l.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((vc) this).field_l.update(param0);
    }

    public static void a(int param0) {
        field_f = null;
        field_k = null;
        if (param0 < 3) {
            vc.a(-49);
        }
        field_h = null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_c = null;
    }

    vc(java.awt.Component param0) {
        ((vc) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_j = "Not yet achieved";
        field_f = "Levels completed: <col=ffffff><%0>";
        field_a = 0.0f;
    }
}
