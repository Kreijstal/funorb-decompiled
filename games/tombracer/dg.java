/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dg extends vg implements fo, noa {
    private int field_l;
    gr field_k;
    private int field_i;
    int field_g;
    private boolean field_j;
    gma field_h;
    private int field_f;

    void a(gma param0, int param1, gr param2) {
        try {
            if (param1 != -2159) {
                this.h(80);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param1 <= 96) {
            this.e(72);
            this.field_f = param0;
            return;
        }
        this.field_f = param0;
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
            return false;
        }
        return true;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return -69;
        }
        if (null != this.field_h) {
            return this.field_h.e(9648);
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2;
        var2 = 19 % ((param0 - -23) / 53);
        if (null == this.field_h) {
          return 0;
        } else {
          return this.field_h.d(3);
        }
    }

    int m(byte param0) {
        if (param0 > -63) {
            this.a(-26, -105);
            return -1;
        }
        return -1;
    }

    void b(int param0, uw param1) {
        int var3_int = 0;
        if (!((this.field_i ^ -1) == param0)) {
            return;
        }
        try {
            var3_int = this.k((byte) -99);
            this.a((byte) 66, var3_int, param1);
            this.field_i = var3_int;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_322_0 = 0;
        int stackIn_362_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        la var9;
        if (this.field_h == null) {
          return;
        } else {
          if (!this.field_h.b(true)) {
            var2 = this.m((byte) -88);
            var3 = this.f((byte) -108);
            if (0 != (var2 ^ -1)) {
              if (param0 == -12663) {
                L0: {
                  var4 = 0;
                  if (var4 != 0) {
                    stackIn_218_0 = 1;
                    break L0;
                  } else {
                    if (this.field_h.h(param0 + 31070)) {
                      L1: {
                        var5 = 1;
                        if (this.field_k != null) {
                          if (var5 == 0) {
                            if (this.field_k.a(param0 ^ 12575)) {
                              L2: {
                                if (!this.field_k.a((byte) 87)) {
                                  stackIn_185_0 = 0;
                                  break L2;
                                } else {
                                  stackIn_185_0 = 1;
                                  break L2;
                                }
                              }
                              var5 = stackIn_185_0;
                              break L1;
                            } else {
                              L3: {
                                var5 = 1;
                                if (var5 == 0) {
                                  stackIn_158_0 = 1;
                                  break L3;
                                } else {
                                  if (var4 != 0) {
                                    stackIn_158_0 = 1;
                                    break L3;
                                  } else {
                                    stackIn_158_0 = 0;
                                    break L3;
                                  }
                                }
                              }
                              var6 = stackIn_158_0;
                              if (var6 == 0) {
                                if (var5 != 0) {
                                  L4: {
                                    var7 = this.field_h.c(-49);
                                    var8 = this.field_h.a((byte) 55);
                                    var9 = this.field_h.f((byte) 79);
                                    if (var5 != 0) {
                                      if (this.field_j) {
                                        var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                        this.field_j = false;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var6 == 0) {
                                      break L5;
                                    } else {
                                      if (!this.field_j) {
                                        var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                        this.field_j = true;
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L6: {
                                  var7 = this.field_h.c(-49);
                                  var8 = this.field_h.a((byte) 55);
                                  var9 = this.field_h.f((byte) 79);
                                  if (var5 != 0) {
                                    if (this.field_j) {
                                      var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                      this.field_j = false;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  if (var6 == 0) {
                                    break L7;
                                  } else {
                                    if (!this.field_j) {
                                      var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                      this.field_j = true;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          } else {
                            L8: {
                              var5 = 1;
                              if (var5 != 0) {
                                L9: {
                                  if (var4 != 0) {
                                    stackIn_126_0 = 1;
                                    break L9;
                                  } else {
                                    stackIn_126_0 = 0;
                                    break L9;
                                  }
                                }
                                var6 = stackIn_126_0;
                                break L8;
                              } else {
                                stackIn_121_0 = 1;
                                var6 = stackIn_121_0;
                                break L8;
                              }
                            }
                            if (var6 == 0) {
                              if (var5 == 0) {
                                return;
                              } else {
                                L10: {
                                  var7 = this.field_h.c(-49);
                                  var8 = this.field_h.a((byte) 55);
                                  var9 = this.field_h.f((byte) 79);
                                  if (var5 != 0) {
                                    if (this.field_j) {
                                      var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                      this.field_j = false;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var6 == 0) {
                                    break L11;
                                  } else {
                                    if (!this.field_j) {
                                      var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                      this.field_j = true;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                return;
                              }
                            } else {
                              L12: {
                                var7 = this.field_h.c(-49);
                                var8 = this.field_h.a((byte) 55);
                                var9 = this.field_h.f((byte) 79);
                                if (var5 != 0) {
                                  if (this.field_j) {
                                    var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                    this.field_j = false;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if (var6 == 0) {
                                  break L13;
                                } else {
                                  if (!this.field_j) {
                                    var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                    this.field_j = true;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                      L14: {
                        if (var5 != 0) {
                          if (var4 != 0) {
                            stackIn_192_0 = 1;
                            break L14;
                          } else {
                            stackIn_192_0 = 0;
                            break L14;
                          }
                        } else {
                          stackIn_192_0 = 1;
                          break L14;
                        }
                      }
                      var6 = stackIn_192_0;
                      if (var6 == 0) {
                        if (var5 != 0) {
                          L15: {
                            var7 = this.field_h.c(-49);
                            var8 = this.field_h.a((byte) 55);
                            var9 = this.field_h.f((byte) 79);
                            if (var5 != 0) {
                              if (this.field_j) {
                                var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                this.field_j = false;
                                break L15;
                              } else {
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (var6 == 0) {
                              break L16;
                            } else {
                              if (!this.field_j) {
                                var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                this.field_j = true;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L17: {
                          var7 = this.field_h.c(-49);
                          var8 = this.field_h.a((byte) 55);
                          var9 = this.field_h.f((byte) 79);
                          if (var5 != 0) {
                            if (this.field_j) {
                              var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                              this.field_j = false;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (var6 == 0) {
                            break L18;
                          } else {
                            if (!this.field_j) {
                              var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                              this.field_j = true;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      stackIn_218_0 = 0;
                      break L0;
                    }
                  }
                }
                L19: {
                  var5 = stackIn_218_0;
                  if (this.field_k != null) {
                    if (var5 == 0) {
                      if (this.field_k.a(param0 ^ 12575)) {
                        if (!this.field_k.a((byte) 87)) {
                          var5 = 0;
                          break L19;
                        } else {
                          L20: {
                            var5 = 1;
                            if (var5 != 0) {
                              L21: {
                                if (var4 != 0) {
                                  stackIn_322_0 = 1;
                                  break L21;
                                } else {
                                  stackIn_322_0 = 0;
                                  break L21;
                                }
                              }
                              var6 = stackIn_322_0;
                              break L20;
                            } else {
                              stackIn_317_0 = 1;
                              var6 = stackIn_317_0;
                              break L20;
                            }
                          }
                          L22: {
                            if (var6 != 0) {
                              break L22;
                            } else {
                              if (var5 != 0) {
                                break L22;
                              } else {
                                return;
                              }
                            }
                          }
                          L23: {
                            var7 = this.field_h.c(-49);
                            var8 = this.field_h.a((byte) 55);
                            var9 = this.field_h.f((byte) 79);
                            if (var5 != 0) {
                              if (this.field_j) {
                                var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                this.field_j = false;
                                break L23;
                              } else {
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if (var6 == 0) {
                              break L24;
                            } else {
                              if (!this.field_j) {
                                var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                this.field_j = true;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L25: {
                          var5 = 1;
                          if (var5 != 0) {
                            if (var4 != 0) {
                              L26: {
                                var6 = 1;
                                if (var6 != 0) {
                                  break L26;
                                } else {
                                  if (var5 != 0) {
                                    break L26;
                                  } else {
                                    return;
                                  }
                                }
                              }
                              var7 = this.field_h.c(-49);
                              var8 = this.field_h.a((byte) 55);
                              var9 = this.field_h.f((byte) 79);
                              if (var5 != 0) {
                                if (this.field_j) {
                                  L27: {
                                    var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                    this.field_j = false;
                                    if (var6 == 0) {
                                      break L27;
                                    } else {
                                      if (!this.field_j) {
                                        var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                        this.field_j = true;
                                        break L27;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                  return;
                                } else {
                                  L28: {
                                    if (var6 == 0) {
                                      break L28;
                                    } else {
                                      if (!this.field_j) {
                                        var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                        this.field_j = true;
                                        break L28;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  return;
                                }
                              } else {
                                L29: {
                                  if (var6 == 0) {
                                    break L29;
                                  } else {
                                    if (!this.field_j) {
                                      var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                      this.field_j = true;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                return;
                              }
                            } else {
                              stackIn_293_0 = 0;
                              break L25;
                            }
                          } else {
                            stackIn_293_0 = 1;
                            break L25;
                          }
                        }
                        L30: {
                          var6 = stackIn_293_0;
                          if (var6 != 0) {
                            break L30;
                          } else {
                            if (var5 != 0) {
                              break L30;
                            } else {
                              return;
                            }
                          }
                        }
                        var7 = this.field_h.c(-49);
                        var8 = this.field_h.a((byte) 55);
                        var9 = this.field_h.f((byte) 79);
                        if (var5 != 0) {
                          if (this.field_j) {
                            L31: {
                              var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                              this.field_j = false;
                              if (var6 == 0) {
                                break L31;
                              } else {
                                if (!this.field_j) {
                                  var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                  this.field_j = true;
                                  break L31;
                                } else {
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            L32: {
                              if (var6 == 0) {
                                break L32;
                              } else {
                                if (!this.field_j) {
                                  var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                  this.field_j = true;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            return;
                          }
                        } else {
                          L33: {
                            if (var6 == 0) {
                              break L33;
                            } else {
                              if (!this.field_j) {
                                var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                this.field_j = true;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L34: {
                        var5 = 1;
                        if (var5 != 0) {
                          if (var4 != 0) {
                            L35: {
                              var6 = 1;
                              if (var6 != 0) {
                                break L35;
                              } else {
                                if (var5 != 0) {
                                  break L35;
                                } else {
                                  return;
                                }
                              }
                            }
                            var7 = this.field_h.c(-49);
                            var8 = this.field_h.a((byte) 55);
                            var9 = this.field_h.f((byte) 79);
                            if (var5 != 0) {
                              if (this.field_j) {
                                var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                                this.field_j = false;
                                if (var6 != 0) {
                                  if (!this.field_j) {
                                    var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                    this.field_j = true;
                                    return;
                                  } else {
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                L36: {
                                  if (var6 == 0) {
                                    break L36;
                                  } else {
                                    if (!this.field_j) {
                                      var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                      this.field_j = true;
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                return;
                              }
                            } else {
                              L37: {
                                if (var6 == 0) {
                                  break L37;
                                } else {
                                  if (!this.field_j) {
                                    var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                    this.field_j = true;
                                    break L37;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              return;
                            }
                          } else {
                            stackIn_246_0 = 0;
                            break L34;
                          }
                        } else {
                          stackIn_246_0 = 1;
                          break L34;
                        }
                      }
                      L38: {
                        var6 = stackIn_246_0;
                        if (var6 != 0) {
                          break L38;
                        } else {
                          if (var5 != 0) {
                            break L38;
                          } else {
                            return;
                          }
                        }
                      }
                      var7 = this.field_h.c(-49);
                      var8 = this.field_h.a((byte) 55);
                      var9 = this.field_h.f((byte) 79);
                      if (var5 != 0) {
                        if (this.field_j) {
                          var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                          this.field_j = false;
                          if (var6 != 0) {
                            if (this.field_j) {
                              return;
                            } else {
                              var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                              this.field_j = true;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          L39: {
                            if (var6 == 0) {
                              break L39;
                            } else {
                              if (!this.field_j) {
                                var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                this.field_j = true;
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L40: {
                          if (var6 == 0) {
                            break L40;
                          } else {
                            if (!this.field_j) {
                              var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                              this.field_j = true;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                L41: {
                  if (var5 != 0) {
                    if (var4 != 0) {
                      L42: {
                        var6 = 1;
                        if (var6 != 0) {
                          break L42;
                        } else {
                          if (var5 != 0) {
                            break L42;
                          } else {
                            return;
                          }
                        }
                      }
                      var7 = this.field_h.c(-49);
                      var8 = this.field_h.a((byte) 55);
                      var9 = this.field_h.f((byte) 79);
                      if (var5 != 0) {
                        if (this.field_j) {
                          L43: {
                            var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                            this.field_j = false;
                            if (var6 == 0) {
                              break L43;
                            } else {
                              if (!this.field_j) {
                                var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                this.field_j = true;
                                break L43;
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          L44: {
                            if (var6 == 0) {
                              break L44;
                            } else {
                              if (!this.field_j) {
                                var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                                this.field_j = true;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L45: {
                          if (var6 == 0) {
                            break L45;
                          } else {
                            if (!this.field_j) {
                              var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                              this.field_j = true;
                              break L45;
                            } else {
                              break L45;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      stackIn_362_0 = 0;
                      break L41;
                    }
                  } else {
                    stackIn_362_0 = 1;
                    break L41;
                  }
                }
                L46: {
                  var6 = stackIn_362_0;
                  if (var6 != 0) {
                    break L46;
                  } else {
                    if (var5 != 0) {
                      break L46;
                    } else {
                      return;
                    }
                  }
                }
                var7 = this.field_h.c(-49);
                var8 = this.field_h.a((byte) 55);
                var9 = this.field_h.f((byte) 79);
                if (var5 != 0) {
                  if (this.field_j) {
                    L47: {
                      var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                      this.field_j = false;
                      if (var6 == 0) {
                        break L47;
                      } else {
                        if (!this.field_j) {
                          var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                          this.field_j = true;
                          break L47;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    L48: {
                      if (var6 == 0) {
                        break L48;
                      } else {
                        if (!this.field_j) {
                          var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                          this.field_j = true;
                          break L48;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L49: {
                    if (var6 == 0) {
                      break L49;
                    } else {
                      if (!this.field_j) {
                        var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                        this.field_j = true;
                        break L49;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L50: {
                  this.field_f = -42;
                  var4 = 0;
                  if (var4 != 0) {
                    stackIn_64_0 = 1;
                    break L50;
                  } else {
                    if (this.field_h.h(param0 + 31070)) {
                      stackIn_64_0 = 1;
                      break L50;
                    } else {
                      stackIn_64_0 = 0;
                      break L50;
                    }
                  }
                }
                L51: {
                  var5 = stackIn_64_0;
                  if (this.field_k != null) {
                    if (var5 == 0) {
                      if (this.field_k.a(param0 ^ 12575)) {
                        L52: {
                          if (this.field_k.a((byte) 87)) {
                            stackIn_78_0 = 1;
                            break L52;
                          } else {
                            stackIn_78_0 = 0;
                            break L52;
                          }
                        }
                        var5 = stackIn_78_0;
                        break L51;
                      } else {
                        stackIn_73_0 = 1;
                        var5 = stackIn_73_0;
                        break L51;
                      }
                    } else {
                      stackIn_69_0 = 1;
                      var5 = stackIn_69_0;
                      break L51;
                    }
                  } else {
                    break L51;
                  }
                }
                L53: {
                  if (var5 != 0) {
                    L54: {
                      if (var4 != 0) {
                        stackIn_87_0 = 1;
                        break L54;
                      } else {
                        stackIn_87_0 = 0;
                        break L54;
                      }
                    }
                    var6 = stackIn_87_0;
                    break L53;
                  } else {
                    stackIn_82_0 = 1;
                    var6 = stackIn_82_0;
                    break L53;
                  }
                }
                if (var6 == 0) {
                  if (var5 == 0) {
                    return;
                  } else {
                    L55: {
                      var7 = this.field_h.c(-49);
                      var8 = this.field_h.a((byte) 55);
                      var9 = this.field_h.f((byte) 79);
                      if (var5 != 0) {
                        if (this.field_j) {
                          var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                          this.field_j = false;
                          break L55;
                        } else {
                          break L55;
                        }
                      } else {
                        break L55;
                      }
                    }
                    L56: {
                      if (var6 == 0) {
                        break L56;
                      } else {
                        if (!this.field_j) {
                          var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                          this.field_j = true;
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L57: {
                    var7 = this.field_h.c(-49);
                    var8 = this.field_h.a((byte) 55);
                    var9 = this.field_h.f((byte) 79);
                    if (var5 != 0) {
                      if (this.field_j) {
                        var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                        this.field_j = false;
                        break L57;
                      } else {
                        break L57;
                      }
                    } else {
                      break L57;
                    }
                  }
                  L58: {
                    if (var6 == 0) {
                      break L58;
                    } else {
                      if (!this.field_j) {
                        var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                        this.field_j = true;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if ((var3 ^ -1) != 0) {
                L59: {
                  if (param0 == -12663) {
                    break L59;
                  } else {
                    this.field_f = -42;
                    break L59;
                  }
                }
                L60: {
                  var4 = 0;
                  if (var4 == 0) {
                    if (this.field_h.h(param0 + 31070)) {
                      stackIn_16_0 = 1;
                      break L60;
                    } else {
                      stackIn_16_0 = 0;
                      break L60;
                    }
                  } else {
                    stackIn_16_0 = 1;
                    break L60;
                  }
                }
                L61: {
                  var5 = stackIn_16_0;
                  if (this.field_k != null) {
                    L62: {
                      if (var5 == 0) {
                        if (this.field_k.a(param0 ^ 12575)) {
                          if (this.field_k.a((byte) 87)) {
                            stackIn_26_0 = 1;
                            break L62;
                          } else {
                            stackIn_26_0 = 0;
                            break L62;
                          }
                        } else {
                          stackIn_26_0 = 1;
                          break L62;
                        }
                      } else {
                        stackIn_26_0 = 1;
                        break L62;
                      }
                    }
                    var5 = stackIn_26_0;
                    break L61;
                  } else {
                    break L61;
                  }
                }
                L63: {
                  if (var5 != 0) {
                    if (var4 != 0) {
                      stackIn_33_0 = 1;
                      break L63;
                    } else {
                      stackIn_33_0 = 0;
                      break L63;
                    }
                  } else {
                    stackIn_33_0 = 1;
                    break L63;
                  }
                }
                var6 = stackIn_33_0;
                if (var6 == 0) {
                  if (var5 == 0) {
                    return;
                  } else {
                    L64: {
                      var7 = this.field_h.c(-49);
                      var8 = this.field_h.a((byte) 55);
                      var9 = this.field_h.f((byte) 79);
                      if (var5 != 0) {
                        if (this.field_j) {
                          var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                          this.field_j = false;
                          break L64;
                        } else {
                          break L64;
                        }
                      } else {
                        break L64;
                      }
                    }
                    L65: {
                      if (var6 == 0) {
                        break L65;
                      } else {
                        if (!this.field_j) {
                          var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                          this.field_j = true;
                          break L65;
                        } else {
                          break L65;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L66: {
                    var7 = this.field_h.c(-49);
                    var8 = this.field_h.a((byte) 55);
                    var9 = this.field_h.f((byte) 79);
                    if (var5 != 0) {
                      if (this.field_j) {
                        var9.b(var2, var8, var7, this.field_h.e(9648), -119, this.field_h.d(3), var3);
                        this.field_j = false;
                        break L66;
                      } else {
                        break L66;
                      }
                    } else {
                      break L66;
                    }
                  }
                  L67: {
                    if (var6 == 0) {
                      break L67;
                    } else {
                      if (!this.field_j) {
                        var9.a(var3, var2, this.field_h.d(3), this.field_h.e(9648), var7, var8, 121);
                        this.field_j = true;
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    int f(byte param0) {
        int var2 = 121 % ((param0 - 15) / 45);
        return -1;
    }

    void a(byte param0, kh param1) {
        try {
            if (0 < this.field_f) {
                param1.a((byte) 12, 1, 1);
                param1.a((byte) -128, this.field_f, 8);
            } else {
                param1.a((byte) -125, 0, 1);
            }
            int var3_int = -48 / ((-8 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final gr c(int param0) {
        if (param0 > -73) {
            this.field_l = -95;
            return this.field_k;
        }
        return this.field_k;
    }

    public void f(int param0) {
        if (param0 != -4366) {
            this.field_f = -35;
        }
    }

    final int h(byte param0) {
        if (param0 <= 1) {
            this.a((byte) -62, -88);
            return this.field_l;
        }
        return this.field_l;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return true;
        }
        return this.g((byte) -105);
    }

    void a(gr param0, gma param1, byte param2) {
        try {
            this.field_k = param0;
            if (param2 != 36) {
                iq var5 = (iq) null;
                this.a(-31, (iq) null);
            }
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(byte param0) {
        if (param0 != -30) {
          this.field_h = (gma) null;
          this.g(param0 + -12633);
          this.field_h = null;
          return;
        } else {
          this.g(param0 + -12633);
          this.field_h = null;
          return;
        }
    }

    abstract void a(iq param0, int param1, int param2, int param3, byte param4);

    private final boolean g(byte param0) {
        int var2;
        var2 = -58 % ((-38 - param0) / 60);
        if (this.a((byte) 74)) {
          if (null == this.field_k) {
            L0: {
              if (null == this.field_h) {
                break L0;
              } else {
                if (this.field_h.h(18407)) {
                  break L0;
                } else {
                  return false;
                }
              }
            }
            return true;
          } else {
            if (!this.field_k.a((byte) 87)) {
              L1: {
                if (null == this.field_h) {
                  break L1;
                } else {
                  if (this.field_h.h(18407)) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          if (this.field_k != null) {
            if (!this.field_k.a((byte) 87)) {
              if (null != this.field_h) {
                if (this.field_h.h(18407)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public final void a(int param0, iq param1) {
        Object var3 = null;
        int var4 = 0;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_h) {
                break L1;
              } else {
                if (!this.field_h.l(0)) {
                  L2: {
                    var3 = null;
                    if (!(this.field_h instanceof fsa)) {
                      break L2;
                    } else {
                      var3 = (fsa) ((Object) this.field_h);
                      break L2;
                    }
                  }
                  var4 = (this.field_f << -2067928400) - -this.field_h.g((byte) 115);
                  this.a(param1, this.field_h.e(9648), this.field_h.d(3), var4, (byte) 46);
                  if (var3 != null) {
                    ((fsa) (var3)).a(param1, -10425);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (param0 > 103) {
                break L3;
              } else {
                this.field_f = 112;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("dg.DB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        if (param0 >= -16) {
            this.a(-26);
            this.g(-12663);
            return;
        }
        this.g(-12663);
    }

    void a(byte param0, int param1) {
        int var3 = -51 % ((param0 - 7) / 36);
    }

    dg(int param0, la param1, kh param2) {
        this(param0);
        try {
            this.a(125, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void h(int param0) {
        if (param0 < 0) {
            this.field_f = 78;
        }
    }

    final la a(int param0) {
        if (param0 >= 12) {
          if (this.field_h == null) {
            return null;
          } else {
            return this.field_h.f((byte) 116);
          }
        } else {
          this.a((byte) -118);
          if (this.field_h == null) {
            return null;
          } else {
            return this.field_h.f((byte) 116);
          }
        }
    }

    final gma j(byte param0) {
        if (param0 != 16) {
            this.field_k = (gr) null;
            return this.field_h;
        }
        return this.field_h;
    }

    int k(byte param0) {
        if (param0 == -99) {
          if (this.field_h.j(param0 + 98)) {
            return 2;
          } else {
            return 7;
          }
        } else {
          this.field_j = true;
          if (this.field_h.j(param0 + 98)) {
            return 2;
          } else {
            return 7;
          }
        }
    }

    void a(int param0, uw param1, byte param2) {
        try {
            if (param2 < 40) {
                this.a((byte) -28, 26);
            }
            param1.a(param0, (fo) (this), (byte) -33);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void a(int param0, la param1, kh param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if ((param1.field_E ^ -1) <= -16) {
                if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                  this.field_f = 0;
                  break L1;
                } else {
                  this.field_f = param2.b((byte) 44, 8);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 119) {
                break L2;
              } else {
                this.d(14);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("dg.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    public int e(byte param0) {
        if (param0 <= -86) {
          if (null == this.field_h) {
            return 0;
          } else {
            return this.field_h.g((byte) 115) - -(this.field_f << -1904502352);
          }
        } else {
          this.k((byte) -84);
          if (null == this.field_h) {
            return 0;
          } else {
            return this.field_h.g((byte) 115) - -(this.field_f << -1904502352);
          }
        }
    }

    final void a(int param0, byte param1) {
        this.field_f = this.field_f + param0;
        if (param1 <= 112) {
            this.field_f = -110;
        }
    }

    final boolean a(byte param0) {
        int var2 = -53 / ((param0 - -10) / 59);
        return true;
    }

    void a(byte param0, int param1, uw param2) {
        try {
            if (param0 <= 50) {
                this.m((byte) 49);
            }
            param2.a((byte) -99, param1, (fo) (this));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    void d(int param0) {
        if (param0 != -1) {
            return;
        }
        this.g(-12663);
    }

    void a(uw param0, int param1) {
        if ((this.field_i ^ -1) == 0) {
            return;
        }
        try {
            param0.a(this.field_i, (fo) (this), (byte) -33);
            this.field_i = -1;
            if (param1 < 82) {
                this.d(-6);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, uw param1) {
        if (!(this.field_i != -1)) {
            return;
        }
        if (param0 > -39) {
            this.field_g = 41;
        }
        int var3_int = this.k((byte) -99);
        if (!(this.field_i != var3_int)) {
            return;
        }
        try {
            this.a(this.field_i, param1, (byte) 53);
            this.a((byte) 86, var3_int, param1);
            this.field_i = var3_int;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dg.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dg(int param0) {
        this.field_j = false;
        this.field_i = -1;
        this.field_l = param0;
    }

    static {
    }
}
