/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_a;
    private qb[] field_f;
    static String field_h;
    static String field_e;
    static kc field_d;
    static af field_g;
    static String field_b;
    static String field_c;
    static qb[] field_i;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        gl.a(param4, param0, -27327, param3, ((ec) this).field_f, param1);
        if (param2 >= -85) {
            field_d = null;
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            field_g = null;
        }
        field_h = null;
        field_c = null;
        field_i = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        uh var1 = null;
        uh var1_ref = null;
        L0: {
          var1 = (uh) (Object) km.field_a.d(true);
          if (var1 != null) {
            break L0;
          } else {
            var1_ref = new uh();
            break L0;
          }
        }
        if (param0 != 65280) {
          return;
        } else {
          var1_ref.a(de.field_c, de.field_l, (byte) 27, de.field_k, de.field_h, de.field_j, de.field_e, de.field_i);
          lk.field_j.b((pg) (Object) var1_ref, -1);
          return;
        }
    }

    final static void a(byte[] param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 == null) {
          return;
        } else {
          if (34 != param0.length) {
            var2 = 0;
            var2++;
            var3 = param0[var2];
            if (-1 > (var3 ^ -1)) {
              return;
            } else {
              L0: {
                if ((var3 ^ -1) <= -1) {
                  var2++;
                  kg.field_d[0] = ld.field_n[dg.a((int) param0[var2], 255)];
                  var2++;
                  kg.field_d[1] = ud.field_z[dg.a(255, (int) param0[var2])];
                  var2++;
                  kg.field_d[2] = ug.field_d[dg.a((int) param0[var2], 255)];
                  var2++;
                  kg.field_d[3] = hi.field_b[dg.a(255, (int) param0[var2])];
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      if ((var4 ^ -1) <= -7) {
                        break L2;
                      } else {
                        var2++;
                        so.field_c[var4] = param0[var2];
                        var4++;
                        if (0 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4 = 0;
                    L3: while (true) {
                      if (16 <= var4) {
                        break L0;
                      } else {
                        L4: {
                          var2++;
                          b.field_f[var4] = dg.a(255, (int) param0[var2]);
                          if (-256 == (b.field_f[var4] ^ -1)) {
                            b.field_f[var4] = -1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (0 == 0) {
                          continue L3;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
              L5: {
                if (param1 <= -38) {
                  break L5;
                } else {
                  field_b = null;
                  break L5;
                }
              }
              return;
            }
          } else {
            var2 = 0;
            kg.field_d[0] = ld.field_n[0];
            kg.field_d[2] = ug.field_d[0];
            kg.field_d[1] = ud.field_z[0];
            kg.field_d[3] = hi.field_b[0];
            var2++;
            var2++;
            var2++;
            var3 = (param0[var2] << -1095242288 & 16711680) - (-(param0[var2] << -712991480 & 65280) - (param0[var2] & 255));
            var4 = 0;
            L6: while (true) {
              L7: {
                if (ld.field_n.length <= var4) {
                  break L7;
                } else {
                  L8: {
                    if ((ld.field_n[var4][0] << -1842811760 ^ -1) != (var3 & 16711680 ^ -1)) {
                      break L8;
                    } else {
                      if (ld.field_n[var4][1] << -1968068600 != (65280 & var3)) {
                        break L8;
                      } else {
                        if ((var3 & 255) != ld.field_n[var4][2]) {
                          break L8;
                        } else {
                          kg.field_d[0] = ld.field_n[var4];
                          break L8;
                        }
                      }
                    }
                  }
                  var4++;
                  if (0 == 0) {
                    continue L6;
                  } else {
                    break L7;
                  }
                }
              }
              var2++;
              var2++;
              var2++;
              var3 = ((255 & param0[var2]) << 37237520) + (((param0[var2] & 255) << 243172040) - -(param0[var2] & 255));
              var4 = 0;
              L9: while (true) {
                L10: {
                  if (var4 >= ud.field_z.length) {
                    break L10;
                  } else {
                    L11: {
                      if ((16711680 & var3) != ud.field_z[var4][0] << -1814777936) {
                        break L11;
                      } else {
                        if ((var3 & 65280) != ud.field_z[var4][1] << -164935128) {
                          break L11;
                        } else {
                          if ((var3 & 255) != ud.field_z[var4][2]) {
                            break L11;
                          } else {
                            kg.field_d[1] = ud.field_z[var4];
                            break L11;
                          }
                        }
                      }
                    }
                    var4++;
                    if (0 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var2++;
                var2++;
                var2++;
                var3 = ((255 & param0[var2]) << 238282256) - (-(param0[var2] << 1617073416 & 65280) - (255 & param0[var2]));
                var4 = 0;
                L12: while (true) {
                  L13: {
                    if (ug.field_d.length <= var4) {
                      break L13;
                    } else {
                      L14: {
                        if ((ug.field_d[var4][0] << -1431417072 ^ -1) != (var3 & 16711680 ^ -1)) {
                          break L14;
                        } else {
                          if (ug.field_d[var4][1] << 153251304 != (65280 & var3)) {
                            break L14;
                          } else {
                            if (ug.field_d[var4][2] == (var3 & 255)) {
                              kg.field_d[2] = ug.field_d[var4];
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  var3 = ((param0[var2] & 255) << 1405820656) + ((255 & param0[var2]) << -947551768) + (255 & param0[var2]);
                  var4 = 0;
                  L15: while (true) {
                    L16: {
                      if (hi.field_b.length <= var4) {
                        break L16;
                      } else {
                        L17: {
                          if ((hi.field_b[var4][0] << 260054128 ^ -1) != (var3 & 16711680 ^ -1)) {
                            break L17;
                          } else {
                            if (hi.field_b[var4][1] << -645749080 != (var3 & 65280)) {
                              break L17;
                            } else {
                              if ((var3 & 255) != hi.field_b[var4][2]) {
                                break L17;
                              } else {
                                kg.field_d[3] = hi.field_b[var4];
                                break L17;
                              }
                            }
                          }
                        }
                        var4++;
                        if (0 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var4 = 0;
                    L18: while (true) {
                      L19: {
                        if (var4 >= 6) {
                          break L19;
                        } else {
                          var2++;
                          so.field_c[var4] = param0[var2];
                          var4++;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var4 = 0;
                      L20: while (true) {
                        L21: {
                          if (var4 >= 16) {
                            break L21;
                          } else {
                            L22: {
                              L23: {
                                var2++;
                                b.field_f[var4] = dg.a((int) param0[var2], 255);
                                if (255 != b.field_f[var4]) {
                                  break L23;
                                } else {
                                  b.field_f[var4] = -1;
                                  if (0 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              L24: {
                                if (0 > b.field_f[var4]) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (6 > b.field_f[var4]) {
                                      break L25;
                                    } else {
                                      b.field_f[var4] = b.field_f[var4] + 6;
                                      if (0 == 0) {
                                        break L22;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  L26: {
                                    if (b.field_f[var4] == 1) {
                                      break L26;
                                    } else {
                                      L27: {
                                        if (2 != b.field_f[var4]) {
                                          break L27;
                                        } else {
                                          b.field_f[var4] = 4;
                                          if (0 == 0) {
                                            break L22;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      L28: {
                                        if (-4 == (b.field_f[var4] ^ -1)) {
                                          break L28;
                                        } else {
                                          L29: {
                                            if ((b.field_f[var4] ^ -1) != -5) {
                                              break L29;
                                            } else {
                                              b.field_f[var4] = 10;
                                              if (0 == 0) {
                                                break L22;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          if (b.field_f[var4] != 5) {
                                            break L22;
                                          } else {
                                            b.field_f[var4] = 8;
                                            if (0 == 0) {
                                              break L22;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                      b.field_f[var4] = 6;
                                      if (0 == 0) {
                                        break L22;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  b.field_f[var4] = 2;
                                  if (0 == 0) {
                                    break L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              b.field_f[var4] = dg.a(b.field_f[var4], 255);
                              break L22;
                            }
                            var4++;
                            if (0 == 0) {
                              continue L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L30: {
                          if (param1 <= -38) {
                            break L30;
                          } else {
                            field_b = null;
                            break L30;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    ec(qb[] param0) {
        ((ec) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Join <%0>'s game";
        field_h = "This is the Book of Storm. Storm spells focus on direct attacks and powerful wind effects. You require 5 wands to purchase this spellbook; you currently have ";
        field_e = "That name is not available";
        field_b = "Game";
    }
}
