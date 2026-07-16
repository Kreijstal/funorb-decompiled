/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp implements io {
    static nk field_a;
    static String field_g;
    static vn[] field_b;
    private int field_d;
    static int field_h;
    private rb field_f;
    static am field_e;
    private int field_c;

    final static void a(int param0, int param1) {
        int var3 = 0;
        rc var4 = null;
        Object var5 = null;
        jc var5_ref = null;
        var5 = null;
        var3 = ZombieDawn.field_J;
        var4 = (rc) (Object) hk.field_F.b((byte) 26);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == -4) {
              var5_ref = (jc) (Object) on.field_g.b((byte) 26);
              L1: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  pm.a(param1 + 4, param0, var5_ref);
                  var5_ref = (jc) (Object) on.field_g.a(false);
                  continue L1;
                }
              }
            } else {
              dp.a(-47, 66, -71);
              var5_ref = (jc) (Object) on.field_g.b((byte) 26);
              L2: while (true) {
                if (var5_ref == null) {
                  return;
                } else {
                  pm.a(param1 + 4, param0, var5_ref);
                  var5_ref = (jc) (Object) on.field_g.a(false);
                  continue L2;
                }
              }
            }
          } else {
            rm.a((byte) -109, param0, var4);
            var4 = (rc) (Object) hk.field_F.a(false);
            continue L0;
          }
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        var1 = 67 % ((4 - param0) / 37);
        if ((ld.field_j ^ -1) <= -3) {
          if (jp.field_a == 0) {
            if (!vo.field_d.a((byte) 73)) {
              return 20;
            } else {
              if (!vo.field_d.a(-1, "commonui")) {
                return 40;
              } else {
                if (da.field_l.a((byte) 73)) {
                  if (!da.field_l.a(-1, "commonui")) {
                    return 60;
                  } else {
                    if (!al.field_a.a((byte) 73)) {
                      return 70;
                    } else {
                      if (!al.field_a.c(9001)) {
                        return 80;
                      } else {
                        return 100;
                      }
                    }
                  }
                } else {
                  return 50;
                }
              }
            }
          } else {
            if (f.field_i != null) {
              if (!f.field_i.a((byte) 73)) {
                return 14;
              } else {
                if (f.field_i.a("", 0)) {
                  if (f.field_i.a(-1, "")) {
                    if (vo.field_d.a((byte) 73)) {
                      if (!vo.field_d.a(-1, "commonui")) {
                        return 57;
                      } else {
                        if (da.field_l.a((byte) 73)) {
                          if (da.field_l.a(-1, "commonui")) {
                            if (!al.field_a.a((byte) 73)) {
                              return 82;
                            } else {
                              if (al.field_a.c(9001)) {
                                return 100;
                              } else {
                                return 86;
                              }
                            }
                          } else {
                            return 80;
                          }
                        } else {
                          return 71;
                        }
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 29;
                }
              }
            } else {
              if (vo.field_d.a((byte) 73)) {
                if (!vo.field_d.a(-1, "commonui")) {
                  return 57;
                } else {
                  if (da.field_l.a((byte) 73)) {
                    if (da.field_l.a(-1, "commonui")) {
                      if (!al.field_a.a((byte) 73)) {
                        return 82;
                      } else {
                        if (!al.field_a.c(9001)) {
                          return 86;
                        } else {
                          return 100;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              } else {
                return 43;
              }
            }
          }
        } else {
          return 0;
        }
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        var11 = ZombieDawn.field_J;
        if (param0 == 16777215) {
          if (!param3.field_l) {
            if (!param3.e(-17741)) {
              var6 = 2188450;
              int discarded$4 = ((dp) this).field_f.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_o + "</u>", param3.field_k + param4, param2 - -param3.field_j, param3.field_i, param3.field_n, var6, -1, ((dp) this).field_c, ((dp) this).field_d, ((dp) this).field_f.field_I - -((dp) this).field_f.field_x);
              if (param3.e(param0 ^ -16759476)) {
                var7 = ((dp) this).field_f.b(param3.field_o);
                var8 = ((dp) this).field_f.field_x + ((dp) this).field_f.field_I;
                var9 = param3.field_k + param4;
                if (((dp) this).field_c != 2) {
                  L0: {
                    if (-2 != (((dp) this).field_c ^ -1)) {
                      break L0;
                    } else {
                      var9 = var9 + (param3.field_i + -var7 >> 2024323553);
                      break L0;
                    }
                  }
                  var10 = param3.field_j + param2;
                  if (2 == ((dp) this).field_d) {
                    var10 = var10 + (param3.field_n + -var8);
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  } else {
                    L1: {
                      if (-2 != (((dp) this).field_d ^ -1)) {
                        break L1;
                      } else {
                        var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                        break L1;
                      }
                    }
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  }
                } else {
                  var9 = var9 + (param3.field_i + -var7);
                  var10 = param3.field_j + param2;
                  if (2 == ((dp) this).field_d) {
                    var10 = var10 + (param3.field_n + -var8);
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  } else {
                    L2: {
                      if (-2 != (((dp) this).field_d ^ -1)) {
                        break L2;
                      } else {
                        var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                        break L2;
                      }
                    }
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              var6 = 3249872;
              int discarded$5 = ((dp) this).field_f.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_o + "</u>", param3.field_k + param4, param2 - -param3.field_j, param3.field_i, param3.field_n, var6, -1, ((dp) this).field_c, ((dp) this).field_d, ((dp) this).field_f.field_I - -((dp) this).field_f.field_x);
              if (param3.e(param0 ^ -16759476)) {
                var7 = ((dp) this).field_f.b(param3.field_o);
                var8 = ((dp) this).field_f.field_x + ((dp) this).field_f.field_I;
                var9 = param3.field_k + param4;
                if (((dp) this).field_c != 2) {
                  L3: {
                    if (-2 != (((dp) this).field_c ^ -1)) {
                      break L3;
                    } else {
                      var9 = var9 + (param3.field_i + -var7 >> 2024323553);
                      break L3;
                    }
                  }
                  var10 = param3.field_j + param2;
                  if (2 == ((dp) this).field_d) {
                    var10 = var10 + (param3.field_n + -var8);
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  } else {
                    L4: {
                      if (-2 != (((dp) this).field_d ^ -1)) {
                        break L4;
                      } else {
                        var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                        break L4;
                      }
                    }
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  }
                } else {
                  var9 = var9 + (param3.field_i + -var7);
                  var10 = param3.field_j + param2;
                  if (2 == ((dp) this).field_d) {
                    var10 = var10 + (param3.field_n + -var8);
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  } else {
                    L5: {
                      if (-2 != (((dp) this).field_d ^ -1)) {
                        break L5;
                      } else {
                        var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                        break L5;
                      }
                    }
                    on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var6 = 3249872;
            int discarded$6 = ((dp) this).field_f.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_o + "</u>", param3.field_k + param4, param2 - -param3.field_j, param3.field_i, param3.field_n, var6, -1, ((dp) this).field_c, ((dp) this).field_d, ((dp) this).field_f.field_I - -((dp) this).field_f.field_x);
            if (param3.e(param0 ^ -16759476)) {
              var7 = ((dp) this).field_f.b(param3.field_o);
              var8 = ((dp) this).field_f.field_x + ((dp) this).field_f.field_I;
              var9 = param3.field_k + param4;
              if (((dp) this).field_c != 2) {
                L6: {
                  if (-2 != (((dp) this).field_c ^ -1)) {
                    break L6;
                  } else {
                    var9 = var9 + (param3.field_i + -var7 >> 2024323553);
                    break L6;
                  }
                }
                var10 = param3.field_j + param2;
                if (2 == ((dp) this).field_d) {
                  var10 = var10 + (param3.field_n + -var8);
                  on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                  return;
                } else {
                  L7: {
                    if (-2 != (((dp) this).field_d ^ -1)) {
                      break L7;
                    } else {
                      var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                      break L7;
                    }
                  }
                  on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                  return;
                }
              } else {
                var9 = var9 + (param3.field_i + -var7);
                var10 = param3.field_j + param2;
                if (2 == ((dp) this).field_d) {
                  var10 = var10 + (param3.field_n + -var8);
                  on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                  return;
                } else {
                  L8: {
                    if (-2 != (((dp) this).field_d ^ -1)) {
                      break L8;
                    } else {
                      var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                      break L8;
                    }
                  }
                  on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          L9: {
            L10: {
              ((dp) this).field_d = -68;
              if (param3.field_l) {
                break L10;
              } else {
                if (param3.e(-17741)) {
                  break L10;
                } else {
                  stackOut_3_0 = 2188450;
                  stackIn_5_0 = stackOut_3_0;
                  break L9;
                }
              }
            }
            stackOut_4_0 = 3249872;
            stackIn_5_0 = stackOut_4_0;
            break L9;
          }
          var6 = stackIn_5_0;
          int discarded$7 = ((dp) this).field_f.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_o + "</u>", param3.field_k + param4, param2 - -param3.field_j, param3.field_i, param3.field_n, var6, -1, ((dp) this).field_c, ((dp) this).field_d, ((dp) this).field_f.field_I - -((dp) this).field_f.field_x);
          if (param3.e(param0 ^ -16759476)) {
            var7 = ((dp) this).field_f.b(param3.field_o);
            var8 = ((dp) this).field_f.field_x + ((dp) this).field_f.field_I;
            var9 = param3.field_k + param4;
            if (((dp) this).field_c != 2) {
              L11: {
                if (-2 != (((dp) this).field_c ^ -1)) {
                  break L11;
                } else {
                  var9 = var9 + (param3.field_i + -var7 >> 2024323553);
                  break L11;
                }
              }
              var10 = param3.field_j + param2;
              if (2 == ((dp) this).field_d) {
                var10 = var10 + (param3.field_n + -var8);
                on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                return;
              } else {
                L12: {
                  if (-2 != (((dp) this).field_d ^ -1)) {
                    break L12;
                  } else {
                    var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                    break L12;
                  }
                }
                on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
                return;
              }
            } else {
              L13: {
                var9 = var9 + (param3.field_i + -var7);
                var10 = param3.field_j + param2;
                if (2 != ((dp) this).field_d) {
                  if (-2 != (((dp) this).field_d ^ -1)) {
                    break L13;
                  } else {
                    var10 = var10 + (-var8 + param3.field_n >> 1182549217);
                    break L13;
                  }
                } else {
                  var10 = var10 + (param3.field_n + -var8);
                  break L13;
                }
              }
              on.b(var7 - -4, var8, var9 - 2, param0 + -16777135, 2 + var10);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        if (!param0) {
            field_g = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        if ((ej.field_x ^ -1) <= -1) {
          L0: {
            var3 = param0 + -135;
            var4 = -35 + param2;
            var5 = 256;
            if (ej.field_x < 75) {
              var5 = (ej.field_x << -250491992) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (ej.field_x <= 200) {
              break L1;
            } else {
              var5 = (-ej.field_x + 250 << 923175592) / 50;
              break L1;
            }
          }
          ki.a((byte) -102, ti.field_g);
          en.c();
          bi.d();
          gk.j(30549);
          if (var5 >= 256) {
            pa.a(param1 ^ 32173);
            if (param1 == -12138) {
              if (150 <= ej.field_x) {
                L2: {
                  L3: {
                    kh.field_a.e(var3 + 15, var4 + 10, var5);
                    var6 = -125 + ej.field_x;
                    if (0 >= var6) {
                      break L3;
                    } else {
                      if (-51 < (var6 ^ -1)) {
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                          wc.field_Pb.b(var3, var4, var7);
                          break L3;
                        } else {
                          if (var6 >= 30) {
                            L4: {
                              var7 = (-(256 * var6) + 12800) / 20;
                              wc.field_Pb.b(var3, var4, var7);
                              var6 = -140 + ej.field_x;
                              if (-1 <= (var6 ^ -1)) {
                                break L4;
                              } else {
                                L5: {
                                  var7 = 256;
                                  if ((var6 ^ -1) <= -21) {
                                    break L5;
                                  } else {
                                    var7 = var6 * 256 / 20;
                                    break L5;
                                  }
                                }
                                bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                                break L4;
                              }
                            }
                            return;
                          } else {
                            L6: {
                              wc.field_Pb.b(var3, var4, 256);
                              var6 = -140 + ej.field_x;
                              if (-1 <= (var6 ^ -1)) {
                                break L6;
                              } else {
                                L7: {
                                  var7 = 256;
                                  if ((var6 ^ -1) <= -21) {
                                    break L7;
                                  } else {
                                    var7 = var6 * 256 / 20;
                                    break L7;
                                  }
                                }
                                bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                                break L6;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L8: {
                          var6 = -140 + ej.field_x;
                          if (-1 <= (var6 ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              var7 = 256;
                              if ((var6 ^ -1) <= -21) {
                                break L9;
                              } else {
                                var7 = var6 * 256 / 20;
                                break L9;
                              }
                            }
                            bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                            break L8;
                          }
                        }
                        break L2;
                      }
                    }
                  }
                  L10: {
                    var6 = -140 + ej.field_x;
                    if (-1 <= (var6 ^ -1)) {
                      break L10;
                    } else {
                      L11: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L11;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L11;
                        }
                      }
                      bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                      break L10;
                    }
                  }
                  break L2;
                }
                return;
              } else {
                ti.field_g.d(var3, var4);
                var6 = -125 + ej.field_x;
                if (0 < var6) {
                  L12: {
                    if (-51 < (var6 ^ -1)) {
                      if (var6 < 20) {
                        L13: {
                          var7 = var6 * 256 / 20;
                          wc.field_Pb.b(var3, var4, var7);
                          var6 = -140 + ej.field_x;
                          if (-1 <= (var6 ^ -1)) {
                            break L13;
                          } else {
                            L14: {
                              var7 = 256;
                              if ((var6 ^ -1) <= -21) {
                                break L14;
                              } else {
                                var7 = var6 * 256 / 20;
                                break L14;
                              }
                            }
                            bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                            break L13;
                          }
                        }
                        break L12;
                      } else {
                        if (var6 >= 30) {
                          L15: {
                            var7 = (-(256 * var6) + 12800) / 20;
                            wc.field_Pb.b(var3, var4, var7);
                            var6 = -140 + ej.field_x;
                            if (-1 <= (var6 ^ -1)) {
                              break L15;
                            } else {
                              L16: {
                                var7 = 256;
                                if ((var6 ^ -1) <= -21) {
                                  break L16;
                                } else {
                                  var7 = var6 * 256 / 20;
                                  break L16;
                                }
                              }
                              bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                              break L15;
                            }
                          }
                          return;
                        } else {
                          L17: {
                            wc.field_Pb.b(var3, var4, 256);
                            var6 = -140 + ej.field_x;
                            if (-1 <= (var6 ^ -1)) {
                              break L17;
                            } else {
                              L18: {
                                var7 = 256;
                                if ((var6 ^ -1) <= -21) {
                                  break L18;
                                } else {
                                  var7 = var6 * 256 / 20;
                                  break L18;
                                }
                              }
                              bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                              break L17;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L19: {
                        var6 = -140 + ej.field_x;
                        if (-1 <= (var6 ^ -1)) {
                          break L19;
                        } else {
                          L20: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L20;
                            } else {
                              var7 = var6 * 256 / 20;
                              break L20;
                            }
                          }
                          bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                          break L19;
                        }
                      }
                      break L12;
                    }
                  }
                  return;
                } else {
                  L21: {
                    var6 = -140 + ej.field_x;
                    if (-1 <= (var6 ^ -1)) {
                      break L21;
                    } else {
                      L22: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L22;
                        } else {
                          var7 = var6 * 256 / 20;
                          break L22;
                        }
                      }
                      bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                      break L21;
                    }
                  }
                  return;
                }
              }
            } else {
              L23: {
                dp.a(118, -83);
                if (150 <= ej.field_x) {
                  kh.field_a.e(var3 + 15, var4 + 10, var5);
                  break L23;
                } else {
                  ti.field_g.d(var3, var4);
                  break L23;
                }
              }
              var6 = -125 + ej.field_x;
              if (0 < var6) {
                L24: {
                  if (-51 < (var6 ^ -1)) {
                    L25: {
                      if (var6 < 20) {
                        var7 = var6 * 256 / 20;
                        wc.field_Pb.b(var3, var4, var7);
                        break L25;
                      } else {
                        if (var6 >= 30) {
                          var7 = (-(256 * var6) + 12800) / 20;
                          wc.field_Pb.b(var3, var4, var7);
                          break L25;
                        } else {
                          wc.field_Pb.b(var3, var4, 256);
                          break L25;
                        }
                      }
                    }
                    L26: {
                      var6 = -140 + ej.field_x;
                      if (-1 <= (var6 ^ -1)) {
                        break L26;
                      } else {
                        L27: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L27;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L27;
                          }
                        }
                        bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                        break L26;
                      }
                    }
                    break L24;
                  } else {
                    L28: {
                      var6 = -140 + ej.field_x;
                      if (-1 <= (var6 ^ -1)) {
                        break L28;
                      } else {
                        L29: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L29;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L29;
                          }
                        }
                        bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                        break L28;
                      }
                    }
                    break L24;
                  }
                }
                return;
              } else {
                L30: {
                  var6 = -140 + ej.field_x;
                  if (-1 <= (var6 ^ -1)) {
                    break L30;
                  } else {
                    L31: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L31;
                      } else {
                        var7 = var6 * 256 / 20;
                        break L31;
                      }
                    }
                    bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                    break L30;
                  }
                }
                return;
              }
            }
          } else {
            L32: {
              bi.a(0, 0, bi.field_f, bi.field_a, 0, 256 + -var5);
              pa.a(param1 ^ 32173);
              if (param1 == -12138) {
                break L32;
              } else {
                dp.a(118, -83);
                break L32;
              }
            }
            L33: {
              if (150 <= ej.field_x) {
                kh.field_a.e(var3 + 15, var4 + 10, var5);
                break L33;
              } else {
                ti.field_g.d(var3, var4);
                break L33;
              }
            }
            L34: {
              L35: {
                var6 = -125 + ej.field_x;
                if (0 >= var6) {
                  break L35;
                } else {
                  if (-51 < (var6 ^ -1)) {
                    if (var6 < 20) {
                      var7 = var6 * 256 / 20;
                      wc.field_Pb.b(var3, var4, var7);
                      break L35;
                    } else {
                      if (var6 >= 30) {
                        var7 = (-(256 * var6) + 12800) / 20;
                        wc.field_Pb.b(var3, var4, var7);
                        break L35;
                      } else {
                        wc.field_Pb.b(var3, var4, 256);
                        break L35;
                      }
                    }
                  } else {
                    L36: {
                      var6 = -140 + ej.field_x;
                      if (-1 <= (var6 ^ -1)) {
                        break L36;
                      } else {
                        L37: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L37;
                          } else {
                            var7 = var6 * 256 / 20;
                            break L37;
                          }
                        }
                        bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                        break L36;
                      }
                    }
                    break L34;
                  }
                }
              }
              L38: {
                var6 = -140 + ej.field_x;
                if (-1 <= (var6 ^ -1)) {
                  break L38;
                } else {
                  L39: {
                    var7 = 256;
                    if ((var6 ^ -1) <= -21) {
                      break L39;
                    } else {
                      var7 = var6 * 256 / 20;
                      break L39;
                    }
                  }
                  bh.field_j.e(15 + var3, var4 - -10, var7 * var5 >> -273888216);
                  break L38;
                }
              }
              break L34;
            }
            return;
          }
        } else {
          return;
        }
    }

    public dp() {
        ((dp) this).field_f = ia.field_e;
        ((dp) this).field_d = 1;
        ((dp) this).field_c = 1;
    }

    dp(rb param0, int param1, int param2) {
        ((dp) this).field_d = param2;
        ((dp) this).field_f = param0;
        ((dp) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Password is valid";
        field_h = 2147483647;
        field_a = new nk(3);
    }
}
