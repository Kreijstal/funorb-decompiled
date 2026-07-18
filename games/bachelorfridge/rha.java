/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha {
    private StringBuilder field_c;
    static kv[][] field_e;
    static String field_d;
    private int field_b;
    private boolean field_a;

    private final void a(int param0) {
        StringBuilder discarded$0 = ((rha) this).field_c.append('\n');
        ((rha) this).field_a = true;
        int var2 = -40 / ((param0 - 26) / 54);
    }

    private final void b() {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        for (var2 = 0; ((rha) this).field_b > var2; var2++) {
            StringBuilder discarded$0 = ((rha) this).field_c.append(" ");
        }
        ((rha) this).field_a = false;
    }

    final void a(int param0, int param1) {
        int var3 = -60 % ((param0 - 41) / 56);
        if (!(((rha) this).field_a)) {
            this.a(121);
        }
        ((rha) this).field_b = ((rha) this).field_b + param1;
    }

    final void a(Object param0, int param1) {
        if (param1 != 4819) {
            return;
        }
        try {
            this.a(true, param0);
            this.a(83);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(byte param0) {
        if (param0 > -28) {
            field_d = null;
            return ((rha) this).field_c.toString();
        }
        return ((rha) this).field_c.toString();
    }

    final static void a() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        if (ur.field_d < 0) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (ur.field_d >= 75) {
              break L0;
            } else {
              var5 = (ur.field_d << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (ur.field_d <= 200) {
              break L1;
            } else {
              var5 = (250 - ur.field_d << 8) / 50;
              break L1;
            }
          }
          bu.a(0, rl.field_r);
          jb.d();
          dg.d();
          int discarded$1 = -8144;
          tc.b();
          if (var5 >= 256) {
            db.b(110);
            if (ur.field_d < 150) {
              rl.field_r.f(var3, var4);
              var6 = ur.field_d - 125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 < 20) {
                    L2: {
                      var7 = var6 * 256 / 20;
                      rg.field_j.d(var3, var4, var7);
                      var6 = ur.field_d + -140;
                      if (var6 <= 0) {
                        break L2;
                      } else {
                        L3: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L3;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L3;
                          }
                        }
                        lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                        break L2;
                      }
                    }
                    return;
                  } else {
                    if (30 > var6) {
                      L4: {
                        rg.field_j.d(var3, var4, 256);
                        var6 = ur.field_d + -140;
                        if (var6 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L5;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L5;
                            }
                          }
                          lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                          break L4;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        var7 = (-(256 * var6) + 12800) / 20;
                        rg.field_j.d(var3, var4, var7);
                        var6 = ur.field_d + -140;
                        if (var6 <= 0) {
                          break L6;
                        } else {
                          L7: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L7;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L7;
                            }
                          }
                          lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L8: {
                    var6 = ur.field_d + -140;
                    if (var6 <= 0) {
                      break L8;
                    } else {
                      L9: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L9;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L9;
                        }
                      }
                      lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = ur.field_d + -140;
                  if (var6 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L11;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L11;
                      }
                    }
                    lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                    break L10;
                  }
                }
                return;
              }
            } else {
              nd.field_g.a(var3 + 15, var4 - -10, var5);
              var6 = ur.field_d - 125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 < 20) {
                    L12: {
                      var7 = var6 * 256 / 20;
                      rg.field_j.d(var3, var4, var7);
                      var6 = ur.field_d + -140;
                      if (var6 <= 0) {
                        break L12;
                      } else {
                        L13: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L13;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L13;
                          }
                        }
                        lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                        break L12;
                      }
                    }
                    return;
                  } else {
                    if (30 > var6) {
                      L14: {
                        rg.field_j.d(var3, var4, 256);
                        var6 = ur.field_d + -140;
                        if (var6 <= 0) {
                          break L14;
                        } else {
                          L15: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L15;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L15;
                            }
                          }
                          lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                          break L14;
                        }
                      }
                      return;
                    } else {
                      L16: {
                        var7 = (-(256 * var6) + 12800) / 20;
                        rg.field_j.d(var3, var4, var7);
                        var6 = ur.field_d + -140;
                        if (var6 <= 0) {
                          break L16;
                        } else {
                          L17: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L17;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L17;
                            }
                          }
                          lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L18: {
                    var6 = ur.field_d + -140;
                    if (var6 <= 0) {
                      break L18;
                    } else {
                      L19: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L19;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L19;
                        }
                      }
                      lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = ur.field_d + -140;
                  if (var6 <= 0) {
                    break L20;
                  } else {
                    L21: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L21;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L21;
                      }
                    }
                    lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              dg.f(0, 0, dg.field_i, dg.field_c, 0, -var5 + 256);
              db.b(110);
              if (ur.field_d < 150) {
                rl.field_r.f(var3, var4);
                break L22;
              } else {
                nd.field_g.a(var3 + 15, var4 - -10, var5);
                break L22;
              }
            }
            var6 = ur.field_d - 125;
            if (var6 > 0) {
              if (var6 < 50) {
                if (var6 < 20) {
                  L23: {
                    var7 = var6 * 256 / 20;
                    rg.field_j.d(var3, var4, var7);
                    var6 = ur.field_d + -140;
                    if (var6 <= 0) {
                      break L23;
                    } else {
                      L24: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L24;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L24;
                        }
                      }
                      lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                      break L23;
                    }
                  }
                  return;
                } else {
                  if (30 > var6) {
                    L25: {
                      rg.field_j.d(var3, var4, 256);
                      var6 = ur.field_d + -140;
                      if (var6 <= 0) {
                        break L25;
                      } else {
                        L26: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L26;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L26;
                          }
                        }
                        lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                        break L25;
                      }
                    }
                    return;
                  } else {
                    L27: {
                      var7 = (-(256 * var6) + 12800) / 20;
                      rg.field_j.d(var3, var4, var7);
                      var6 = ur.field_d + -140;
                      if (var6 <= 0) {
                        break L27;
                      } else {
                        L28: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L28;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L28;
                          }
                        }
                        lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                        break L27;
                      }
                    }
                    return;
                  }
                }
              } else {
                L29: {
                  var6 = ur.field_d + -140;
                  if (var6 <= 0) {
                    break L29;
                  } else {
                    L30: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L30;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L30;
                      }
                    }
                    lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                    break L29;
                  }
                }
                return;
              }
            } else {
              L31: {
                var6 = ur.field_d + -140;
                if (var6 <= 0) {
                  break L31;
                } else {
                  L32: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L32;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L32;
                    }
                  }
                  lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                  break L31;
                }
              }
              return;
            }
          }
        }
    }

    private final void a(boolean param0, Object param1) {
        try {
            if (((rha) this).field_a) {
                int discarded$0 = 101;
                this.b();
            }
            StringBuilder discarded$1 = ((rha) this).field_c.append(param1.toString());
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rha.B(" + true + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c() {
        field_e = null;
        field_d = null;
        int var1 = 0;
    }

    final static void a(rk param0, lu param1, byte param2) {
        if (param2 >= -61) {
            field_e = null;
        }
        if (!(param0 != null)) {
            param1.d(-1, 0);
            return;
        }
        try {
            param0.a((byte) -59, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rha.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    rha() {
        ((rha) this).field_c = new StringBuilder(1024);
        ((rha) this).field_a = true;
    }

    static {
    }
}
