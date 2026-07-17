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
        StringBuilder discarded$0 = ((rha) this).field_c.append(10);
        ((rha) this).field_a = true;
        int var2 = -40 / ((param0 - 26) / 54);
    }

    private final void b(int param0) {
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
            throw pe.a((Throwable) (Object) runtimeException, "rha.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final String a(byte param0) {
        if (param0 > -28) {
            field_d = null;
            return ((rha) this).field_c.toString();
        }
        return ((rha) this).field_c.toString();
    }

    final static void a(int param0, boolean param1, int param2) {
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
            var4 = param0 - 35;
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
          tc.b(-8144);
          if (var5 >= 256) {
            db.b(110);
            if (ur.field_d < 150) {
              rl.field_r.f(var3, var4);
              var6 = ur.field_d - 125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                    rg.field_j.d(var3, var4, var7);
                    if (!param1) {
                      L2: {
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
                      L4: {
                        rha.c(-72);
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
                    }
                  } else {
                    if (30 > var6) {
                      rg.field_j.d(var3, var4, 256);
                      if (!param1) {
                        L6: {
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
                      } else {
                        L8: {
                          rha.c(-72);
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
                        var7 = (-(256 * var6) + 12800) / 20;
                        rg.field_j.d(var3, var4, var7);
                        if (!param1) {
                          break L10;
                        } else {
                          rha.c(-72);
                          break L10;
                        }
                      }
                      L11: {
                        var6 = ur.field_d + -140;
                        if (var6 <= 0) {
                          break L11;
                        } else {
                          L12: {
                            var7 = 256;
                            if (var6 >= 20) {
                              break L12;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L12;
                            }
                          }
                          lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                          break L11;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (!param1) {
                    L13: {
                      var6 = ur.field_d + -140;
                      if (var6 <= 0) {
                        break L13;
                      } else {
                        L14: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L14;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L14;
                          }
                        }
                        lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                        break L13;
                      }
                    }
                    return;
                  } else {
                    L15: {
                      rha.c(-72);
                      var6 = ur.field_d + -140;
                      if (var6 <= 0) {
                        break L15;
                      } else {
                        L16: {
                          var7 = 256;
                          if (var6 >= 20) {
                            break L16;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L16;
                          }
                        }
                        lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                        break L15;
                      }
                    }
                    return;
                  }
                }
              } else {
                if (!param1) {
                  L17: {
                    var6 = ur.field_d + -140;
                    if (var6 <= 0) {
                      break L17;
                    } else {
                      L18: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L18;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L18;
                        }
                      }
                      lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                      break L17;
                    }
                  }
                  return;
                } else {
                  L19: {
                    rha.c(-72);
                    var6 = ur.field_d + -140;
                    if (var6 <= 0) {
                      break L19;
                    } else {
                      L20: {
                        var7 = 256;
                        if (var6 >= 20) {
                          break L20;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L20;
                        }
                      }
                      lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                      break L19;
                    }
                  }
                  return;
                }
              }
            } else {
              L21: {
                nd.field_g.a(var3 + 15, var4 - -10, var5);
                var6 = ur.field_d - 125;
                if (var6 <= 0) {
                  break L21;
                } else {
                  if (var6 >= 50) {
                    break L21;
                  } else {
                    if (var6 < 20) {
                      var7 = var6 * 256 / 20;
                      rg.field_j.d(var3, var4, var7);
                      break L21;
                    } else {
                      if (30 > var6) {
                        L22: {
                          rg.field_j.d(var3, var4, 256);
                          if (!param1) {
                            break L22;
                          } else {
                            rha.c(-72);
                            break L22;
                          }
                        }
                        L23: {
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
                        var7 = (-(256 * var6) + 12800) / 20;
                        rg.field_j.d(var3, var4, var7);
                        break L21;
                      }
                    }
                  }
                }
              }
              if (!param1) {
                L25: {
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
                  rha.c(-72);
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
              dg.f(0, 0, dg.field_i, dg.field_c, 0, -var5 + 256);
              db.b(110);
              if (ur.field_d < 150) {
                rl.field_r.f(var3, var4);
                break L29;
              } else {
                nd.field_g.a(var3 + 15, var4 - -10, var5);
                break L29;
              }
            }
            var6 = ur.field_d - 125;
            if (var6 > 0) {
              if (var6 < 50) {
                L30: {
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                    rg.field_j.d(var3, var4, var7);
                    break L30;
                  } else {
                    if (30 > var6) {
                      rg.field_j.d(var3, var4, 256);
                      break L30;
                    } else {
                      var7 = (-(256 * var6) + 12800) / 20;
                      rg.field_j.d(var3, var4, var7);
                      break L30;
                    }
                  }
                }
                L31: {
                  if (!param1) {
                    break L31;
                  } else {
                    rha.c(-72);
                    break L31;
                  }
                }
                L32: {
                  var6 = ur.field_d + -140;
                  if (var6 <= 0) {
                    break L32;
                  } else {
                    L33: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L33;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L33;
                      }
                    }
                    lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                    break L32;
                  }
                }
                return;
              } else {
                L34: {
                  if (!param1) {
                    break L34;
                  } else {
                    rha.c(-72);
                    break L34;
                  }
                }
                L35: {
                  var6 = ur.field_d + -140;
                  if (var6 <= 0) {
                    break L35;
                  } else {
                    L36: {
                      var7 = 256;
                      if (var6 >= 20) {
                        break L36;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L36;
                      }
                    }
                    lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                    break L35;
                  }
                }
                return;
              }
            } else {
              L37: {
                if (!param1) {
                  break L37;
                } else {
                  rha.c(-72);
                  break L37;
                }
              }
              L38: {
                var6 = ur.field_d + -140;
                if (var6 <= 0) {
                  break L38;
                } else {
                  L39: {
                    var7 = 256;
                    if (var6 >= 20) {
                      break L39;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L39;
                    }
                  }
                  lt.field_a.a(var3 + 15, 10 + var4, var5 * var7 >> 8);
                  break L38;
                }
              }
              return;
            }
          }
        }
    }

    private final void a(boolean param0, Object param1) {
        try {
            if (!param0) {
                ((rha) this).field_c = null;
            }
            if (((rha) this).field_a) {
                this.b(101);
            }
            StringBuilder discarded$0 = ((rha) this).field_c.append(param1.toString());
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rha.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_d = null;
        int var1 = -18 % ((40 - param0) / 37);
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
            throw pe.a((Throwable) (Object) runtimeException, "rha.G(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    rha() {
        ((rha) this).field_c = new StringBuilder(1024);
        ((rha) this).field_a = true;
    }

    static {
    }
}
