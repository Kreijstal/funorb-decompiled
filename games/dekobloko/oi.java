/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private rf[] field_c;
    static String field_e;
    static qm field_d;
    static em field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        var3 = param0 + -1 & param2 >> -1286094081;
        if (param1 < 76) {
          var4 = null;
          oi.a(106, 18, (sb) null);
          return var3 + (param2 - -(param2 >>> -520357569)) % param0;
        } else {
          return var3 + (param2 - -(param2 >>> -520357569)) % param0;
        }
    }

    private final void a(byte param0) {
        rf[] var2 = null;
        int var3 = 0;
        rf var4 = null;
        int var5 = 0;
        rf[] var6 = null;
        var5 = client.field_A ? 1 : 0;
        var6 = new rf[((oi) this).field_c.length * 2];
        var2 = var6;
        if (param0 > 103) {
          var3 = 0;
          L0: while (true) {
            if (((oi) this).field_c.length > var3) {
              var4 = ((oi) this).field_c[var3];
              if (var5 == 0) {
                L1: {
                  if (var4 != null) {
                    var6 = var2;
                    var2[var4.field_j % var6.length] = var4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
                return;
              }
            } else {
              ((oi) this).field_c = var2;
              return;
            }
          }
        } else {
          return;
        }
    }

    final rf a(boolean param0, boolean param1, uf param2) {
        int var4 = 0;
        rf var5 = null;
        int var6 = 0;
        int var7 = 0;
        rf var8 = null;
        rf var11 = null;
        rf var25 = null;
        rf var26 = null;
        rf var27 = null;
        rf stackIn_5_0 = null;
        rf stackIn_9_0 = null;
        rf stackIn_28_0 = null;
        rf stackIn_32_0 = null;
        rf stackIn_48_0 = null;
        rf stackIn_64_0 = null;
        rf stackIn_90_0 = null;
        rf stackIn_107_0 = null;
        rf stackOut_89_0 = null;
        rf stackOut_106_0 = null;
        rf stackOut_47_0 = null;
        rf stackOut_63_0 = null;
        rf stackOut_27_0 = null;
        rf stackOut_31_0 = null;
        rf stackOut_4_0 = null;
        rf stackOut_8_0 = null;
        var7 = client.field_A ? 1 : 0;
        if (param0) {
          var4 = param2.a(118);
          var26 = ((oi) this).field_c[var4 % ((oi) this).field_c.length];
          var8 = var26;
          var5 = var8;
          if (var5 != null) {
            if (var4 != var26.field_j) {
              L0: while (true) {
                L1: {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      stackOut_89_0 = ((oi) this).field_c[var4 % ((oi) this).field_c.length];
                      stackIn_107_0 = stackOut_89_0;
                      stackIn_90_0 = stackOut_89_0;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (stackIn_90_0 == null) {
                          break L2;
                        } else {
                          this.a((byte) 115);
                          if (var7 == 0) {
                            continue L0;
                          } else {
                            var27 = new rf(var4);
                            var5 = var27;
                            var27.field_b = param2.d((byte) -102);
                            var27.field_n = param2.d((byte) -79);
                            var27.field_c = new byte[var27.field_b * var27.field_n];
                            param2.j((byte) -108);
                            var6 = 0;
                            L3: while (true) {
                              if (var27.field_c.length <= var6) {
                                L4: {
                                  param2.k((byte) -128);
                                  if (param1) {
                                    ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var27;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                return var27;
                              } else {
                                var27.field_c[var6] = (byte)param2.a(5, (byte) 75);
                                var6++;
                                if (var7 == 0) {
                                  continue L3;
                                } else {
                                  L5: {
                                    param2.k((byte) -128);
                                    if (param1) {
                                      ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var27;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  return var27;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5 = new rf(var4);
                  var5.field_b = param2.d((byte) -102);
                  var5.field_n = param2.d((byte) -79);
                  stackOut_106_0 = (rf) var5;
                  stackIn_107_0 = stackOut_106_0;
                  break L1;
                }
                stackIn_107_0.field_c = new byte[var5.field_b * var5.field_n];
                param2.j((byte) -108);
                var6 = 0;
                L6: while (true) {
                  if (var5.field_c.length <= var6) {
                    L7: {
                      param2.k((byte) -128);
                      if (param1) {
                        ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return var5;
                  } else {
                    var5.field_c[var6] = (byte)param2.a(5, (byte) 75);
                    var6++;
                    if (var7 == 0) {
                      if (var7 == 0) {
                        continue L6;
                      } else {
                        L8: {
                          param2.k((byte) -128);
                          if (param1) {
                            ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return var5;
                      }
                    } else {
                      L9: {
                        if (param1) {
                          ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      return var5;
                    }
                  }
                }
              }
            } else {
              L10: {
                if (!param1) {
                  ((oi) this).field_c[var4 % ((oi) this).field_c.length] = null;
                  break L10;
                } else {
                  break L10;
                }
              }
              return var5;
            }
          } else {
            L11: while (true) {
              L12: {
                L13: {
                  if (!param1) {
                    break L13;
                  } else {
                    stackOut_47_0 = ((oi) this).field_c[var4 % ((oi) this).field_c.length];
                    stackIn_64_0 = stackOut_47_0;
                    stackIn_48_0 = stackOut_47_0;
                    if (var7 != 0) {
                      break L12;
                    } else {
                      if (stackIn_48_0 == null) {
                        break L13;
                      } else {
                        this.a((byte) 115);
                        if (var7 == 0) {
                          continue L11;
                        } else {
                          var25 = new rf(var4);
                          var5 = var25;
                          var25.field_b = param2.d((byte) -102);
                          var25.field_n = param2.d((byte) -79);
                          var25.field_c = new byte[var25.field_b * var25.field_n];
                          param2.j((byte) -108);
                          var6 = 0;
                          L14: while (true) {
                            if (var25.field_c.length > var6) {
                              var25.field_c[var6] = (byte)param2.a(5, (byte) 75);
                              var6++;
                              if (var7 == 0) {
                                continue L14;
                              } else {
                                L15: {
                                  if (param1) {
                                    ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var25;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                return var25;
                              }
                            } else {
                              L16: {
                                param2.k((byte) -128);
                                if (param1) {
                                  ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var25;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              return var25;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var5 = new rf(var4);
                var5.field_b = param2.d((byte) -102);
                var5.field_n = param2.d((byte) -79);
                stackOut_63_0 = (rf) var5;
                stackIn_64_0 = stackOut_63_0;
                break L12;
              }
              stackIn_64_0.field_c = new byte[var5.field_b * var5.field_n];
              param2.j((byte) -108);
              var6 = 0;
              L17: while (true) {
                if (var5.field_c.length <= var6) {
                  L18: {
                    param2.k((byte) -128);
                    if (param1) {
                      ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return var5;
                } else {
                  var5.field_c[var6] = (byte)param2.a(5, (byte) 75);
                  var6++;
                  if (var7 == 0) {
                    if (var7 == 0) {
                      continue L17;
                    } else {
                      L19: {
                        param2.k((byte) -128);
                        if (param1) {
                          ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      return var5;
                    }
                  } else {
                    L20: {
                      if (param1) {
                        ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    return var5;
                  }
                }
              }
            }
          }
        } else {
          field_a = null;
          var4 = param2.a(118);
          var11 = ((oi) this).field_c[var4 % ((oi) this).field_c.length];
          var8 = var11;
          var5 = var8;
          if (var5 != null) {
            if (var4 != var11.field_j) {
              L21: while (true) {
                L22: {
                  L23: {
                    if (!param1) {
                      break L23;
                    } else {
                      stackOut_27_0 = ((oi) this).field_c[var4 % ((oi) this).field_c.length];
                      stackIn_32_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var7 != 0) {
                        break L22;
                      } else {
                        if (stackIn_28_0 == null) {
                          break L23;
                        } else {
                          this.a((byte) 115);
                          continue L21;
                        }
                      }
                    }
                  }
                  var5 = new rf(var4);
                  var5.field_b = param2.d((byte) -102);
                  var5.field_n = param2.d((byte) -79);
                  stackOut_31_0 = (rf) var5;
                  stackIn_32_0 = stackOut_31_0;
                  break L22;
                }
                stackIn_32_0.field_c = new byte[var5.field_b * var5.field_n];
                param2.j((byte) -108);
                var6 = 0;
                L24: while (true) {
                  L25: {
                    if (var5.field_c.length <= var6) {
                      param2.k((byte) -128);
                      break L25;
                    } else {
                      var5.field_c[var6] = (byte)param2.a(5, (byte) 75);
                      var6++;
                      if (var7 != 0) {
                        break L25;
                      } else {
                        if (var7 == 0) {
                          continue L24;
                        } else {
                          param2.k((byte) -128);
                          break L25;
                        }
                      }
                    }
                  }
                  L26: {
                    if (param1) {
                      ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  return var5;
                }
              }
            } else {
              L27: {
                if (!param1) {
                  ((oi) this).field_c[var4 % ((oi) this).field_c.length] = null;
                  break L27;
                } else {
                  break L27;
                }
              }
              return var5;
            }
          } else {
            L28: while (true) {
              L29: {
                L30: {
                  if (!param1) {
                    break L30;
                  } else {
                    stackOut_4_0 = ((oi) this).field_c[var4 % ((oi) this).field_c.length];
                    stackIn_9_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var7 != 0) {
                      break L29;
                    } else {
                      if (stackIn_5_0 == null) {
                        break L30;
                      } else {
                        this.a((byte) 115);
                        if (var7 == 0) {
                          continue L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                }
                var5 = new rf(var4);
                var5.field_b = param2.d((byte) -102);
                var5.field_n = param2.d((byte) -79);
                stackOut_8_0 = (rf) var5;
                stackIn_9_0 = stackOut_8_0;
                break L29;
              }
              stackIn_9_0.field_c = new byte[var5.field_b * var5.field_n];
              param2.j((byte) -108);
              var6 = 0;
              L31: while (true) {
                L32: {
                  if (var5.field_c.length <= var6) {
                    param2.k((byte) -128);
                    break L32;
                  } else {
                    var5.field_c[var6] = (byte)param2.a(5, (byte) 75);
                    var6++;
                    if (var7 != 0) {
                      break L32;
                    } else {
                      if (var7 == 0) {
                        continue L31;
                      } else {
                        param2.k((byte) -128);
                        break L32;
                      }
                    }
                  }
                }
                L33: {
                  if (param1) {
                    ((oi) this).field_c[var4 % ((oi) this).field_c.length] = var5;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                return var5;
              }
            }
          }
        }
    }

    final rf a(boolean param0, int param1) {
        rf var3 = null;
        Object var4 = null;
        if (!param0) {
          var3 = ((oi) this).field_c[param1 % ((oi) this).field_c.length];
          if (var3 != null) {
            if (var3.field_j != param1) {
              return null;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        } else {
          var4 = null;
          ((oi) this).a((rf) null, (byte) -73);
          var3 = ((oi) this).field_c[param1 % ((oi) this).field_c.length];
          if (var3 != null) {
            if (var3.field_j != param1) {
              return null;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void a(rf param0, byte param1) {
        int var3 = 0;
        var3 = param0.field_j;
        if (param0 == ((oi) this).field_c[var3 % ((oi) this).field_c.length]) {
          if (param1 < 24) {
            return;
          } else {
            ((oi) this).field_c[var3 % ((oi) this).field_c.length] = null;
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    oi(int param0) {
        ((oi) this).field_c = new rf[param0];
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 == 2) {
            return;
        }
        field_e = null;
    }

    final void a(rf param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var3 = param0.field_j;
        if (((oi) this).field_c[var3 % ((oi) this).field_c.length] != null) {
          if (param0.field_j == ((oi) this).field_c[var3 % ((oi) this).field_c.length].field_j) {
            throw new IllegalArgumentException();
          } else {
            L0: while (true) {
              if (null == ((oi) this).field_c[var3 % ((oi) this).field_c.length]) {
                if (param1 == 0) {
                  ((oi) this).field_c[var3 % ((oi) this).field_c.length] = param0;
                  return;
                } else {
                  int discarded$2 = oi.a(93, 98, -46);
                  ((oi) this).field_c[var3 % ((oi) this).field_c.length] = param0;
                  return;
                }
              } else {
                this.a((byte) 116);
                if (var4 == 0) {
                  continue L0;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (null == ((oi) this).field_c[var3 % ((oi) this).field_c.length]) {
              if (param1 != 0) {
                int discarded$3 = oi.a(93, 98, -46);
                ((oi) this).field_c[var3 % ((oi) this).field_c.length] = param0;
                return;
              } else {
                ((oi) this).field_c[var3 % ((oi) this).field_c.length] = param0;
                return;
              }
            } else {
              this.a((byte) 116);
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, sb param2) {
        uf var3 = null;
        var3 = we.field_b;
        var3.f(param1, -4);
        var3.a(true, 2);
        var3.a(true, 0);
        if (param0 > -57) {
          int discarded$2 = oi.a(-93, 111, -125);
          var3.a(true, param2.field_r);
          return;
        } else {
          var3.a(true, param2.field_r);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Winner!";
        field_d = new qm(7, 0, 1, 1);
        field_b = "Drawn";
    }
}
