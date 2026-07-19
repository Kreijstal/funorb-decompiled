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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2159) {
                break L1;
              } else {
                this.h(80);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dg.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        int var2 = 0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        la var9 = null;
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
        int stackOut_216_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_340_0 = 0;
        int stackOut_338_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
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
                    stackOut_216_0 = 1;
                    stackIn_218_0 = stackOut_216_0;
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
                                  stackOut_184_0 = 0;
                                  stackIn_185_0 = stackOut_184_0;
                                  break L2;
                                } else {
                                  stackOut_183_0 = 1;
                                  stackIn_185_0 = stackOut_183_0;
                                  break L2;
                                }
                              }
                              var5 = stackIn_185_0;
                              break L1;
                            } else {
                              L3: {
                                var5 = 1;
                                if (var5 == 0) {
                                  stackOut_156_0 = 1;
                                  stackIn_158_0 = stackOut_156_0;
                                  break L3;
                                } else {
                                  if (var4 != 0) {
                                    stackOut_155_0 = 1;
                                    stackIn_158_0 = stackOut_155_0;
                                    break L3;
                                  } else {
                                    stackOut_154_0 = 0;
                                    stackIn_158_0 = stackOut_154_0;
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
                                    stackOut_124_0 = 1;
                                    stackIn_126_0 = stackOut_124_0;
                                    break L9;
                                  } else {
                                    stackOut_123_0 = 0;
                                    stackIn_126_0 = stackOut_123_0;
                                    break L9;
                                  }
                                }
                                var6 = stackIn_126_0;
                                break L8;
                              } else {
                                stackOut_119_0 = 1;
                                stackIn_121_0 = stackOut_119_0;
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
                            stackOut_190_0 = 1;
                            stackIn_192_0 = stackOut_190_0;
                            break L14;
                          } else {
                            stackOut_189_0 = 0;
                            stackIn_192_0 = stackOut_189_0;
                            break L14;
                          }
                        } else {
                          stackOut_187_0 = 1;
                          stackIn_192_0 = stackOut_187_0;
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
                      stackOut_114_0 = 0;
                      stackIn_218_0 = stackOut_114_0;
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
                                  stackOut_320_0 = 1;
                                  stackIn_322_0 = stackOut_320_0;
                                  break L21;
                                } else {
                                  stackOut_319_0 = 0;
                                  stackIn_322_0 = stackOut_319_0;
                                  break L21;
                                }
                              }
                              var6 = stackIn_322_0;
                              break L20;
                            } else {
                              stackOut_315_0 = 1;
                              stackIn_317_0 = stackOut_315_0;
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
                              stackOut_271_0 = 0;
                              stackIn_293_0 = stackOut_271_0;
                              break L25;
                            }
                          } else {
                            stackOut_269_0 = 1;
                            stackIn_293_0 = stackOut_269_0;
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
                            stackOut_224_0 = 0;
                            stackIn_246_0 = stackOut_224_0;
                            break L34;
                          }
                        } else {
                          stackOut_222_0 = 1;
                          stackIn_246_0 = stackOut_222_0;
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
                      stackOut_340_0 = 0;
                      stackIn_362_0 = stackOut_340_0;
                      break L41;
                    }
                  } else {
                    stackOut_338_0 = 1;
                    stackIn_362_0 = stackOut_338_0;
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
                    stackOut_62_0 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    break L50;
                  } else {
                    if (this.field_h.h(param0 + 31070)) {
                      stackOut_61_0 = 1;
                      stackIn_64_0 = stackOut_61_0;
                      break L50;
                    } else {
                      stackOut_60_0 = 0;
                      stackIn_64_0 = stackOut_60_0;
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
                            stackOut_76_0 = 1;
                            stackIn_78_0 = stackOut_76_0;
                            break L52;
                          } else {
                            stackOut_75_0 = 0;
                            stackIn_78_0 = stackOut_75_0;
                            break L52;
                          }
                        }
                        var5 = stackIn_78_0;
                        break L51;
                      } else {
                        stackOut_71_0 = 1;
                        stackIn_73_0 = stackOut_71_0;
                        var5 = stackIn_73_0;
                        break L51;
                      }
                    } else {
                      stackOut_67_0 = 1;
                      stackIn_69_0 = stackOut_67_0;
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
                        stackOut_85_0 = 1;
                        stackIn_87_0 = stackOut_85_0;
                        break L54;
                      } else {
                        stackOut_84_0 = 0;
                        stackIn_87_0 = stackOut_84_0;
                        break L54;
                      }
                    }
                    var6 = stackIn_87_0;
                    break L53;
                  } else {
                    stackOut_80_0 = 1;
                    stackIn_82_0 = stackOut_80_0;
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
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L60;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L60;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_16_0 = stackOut_11_0;
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
                            stackOut_24_0 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            break L62;
                          } else {
                            stackOut_23_0 = 0;
                            stackIn_26_0 = stackOut_23_0;
                            break L62;
                          }
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_26_0 = stackOut_21_0;
                          break L62;
                        }
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_26_0 = stackOut_19_0;
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
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L63;
                    } else {
                      stackOut_30_0 = 0;
                      stackIn_33_0 = stackOut_30_0;
                      break L63;
                    }
                  } else {
                    stackOut_28_0 = 1;
                    stackIn_33_0 = stackOut_28_0;
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
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= this.field_f) {
                  break L2;
                } else {
                  param1.a((byte) 12, 1, 1);
                  param1.a((byte) -128, this.field_f, 8);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param1.a((byte) -125, 0, 1);
              break L1;
            }
            var3_int = -48 / ((-8 - param0) / 40);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("dg.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        int var2 = 0;
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
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            stackOut_11_0 = var3;
            stackOut_11_1 = new StringBuilder().append("dg.DB(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
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
        la discarded$0 = null;
        if (param0 >= -16) {
            discarded$0 = this.a(-26);
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
        boolean discarded$6 = false;
        if (param0 >= 12) {
          if (this.field_h == null) {
            return null;
          } else {
            return this.field_h.f((byte) 116);
          }
        } else {
          discarded$6 = this.a((byte) -118);
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
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if ((param1.field_E ^ -1) <= -16) {
                L2: {
                  if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                    break L2;
                  } else {
                    this.field_f = param2.b((byte) 44, 8);
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_f = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 >= 119) {
                break L3;
              } else {
                this.d(14);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public int e(byte param0) {
        int discarded$7 = 0;
        if (param0 <= -86) {
          if (null == this.field_h) {
            return 0;
          } else {
            return this.field_h.g((byte) 115) - -(this.field_f << -1904502352);
          }
        } else {
          discarded$7 = this.k((byte) -84);
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
        int discarded$0 = 0;
        try {
            if (param0 <= 50) {
                discarded$0 = this.m((byte) 49);
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if ((this.field_i ^ -1) != 0) {
              L1: {
                param0.a(this.field_i, (fo) (this), (byte) -33);
                this.field_i = -1;
                if (param1 >= 82) {
                  break L1;
                } else {
                  this.d(-6);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("dg.RA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
