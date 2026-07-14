/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    final static void a(int param0) {
        kv var1 = null;
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        kv var6 = null;
        kv var9 = null;
        Object var10 = null;
        kv var11 = null;
        kv var12 = null;
        Object var13 = null;
        kv var14 = null;
        Object var15 = null;
        kv var16 = null;
        Object var17 = null;
        kv var18 = null;
        kv var23 = null;
        kv var24 = null;
        kv var28 = null;
        kv var32 = null;
        kv var35 = null;
        kv var39 = null;
        kv var41 = null;
        var4 = BachelorFridge.field_y;
        dg.a(243, 197, 369, 143, 16777215);
        dg.c(244, 198, 367, 141, 0);
        if (null != oja.field_f) {
          L0: {
            var6 = oja.field_f[ih.field_l];
            var1 = var6;
            if (param0 >= 124) {
              break L0;
            } else {
              va.a((byte) -87);
              break L0;
            }
          }
          if (var6 != null) {
            var6.e(245, 199);
            if (gp.field_A < ph.field_E) {
              var23 = oja.field_f[vj.field_n];
              if (var23 == null) {
                L1: {
                  if (null != g.field_f) {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L2: while (true) {
                      if (oja.field_f.length <= var5) {
                        if (var2 == null) {
                          break L1;
                        } else {
                          int discarded$14 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L1;
                        }
                      } else {
                        var18 = oja.field_f[var5];
                        if (var18 != null) {
                          L3: {
                            if (365 != var18.field_n) {
                              break L3;
                            } else {
                              if (139 != var18.field_o) {
                                break L3;
                              } else {
                                var5++;
                                continue L2;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = var2 + ", " + var5;
                            var5++;
                            continue L2;
                          } else {
                            var2 = Integer.toString(var5);
                            var5++;
                            continue L2;
                          }
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L4: {
                  var2_int = (60 + var23.field_n) * gp.field_A / ph.field_E;
                  var3 = var2_int - 30;
                  if (!ja.field_p) {
                    iia.a((byte) 123, 199, -256 * var3 / 30, var23, (-var3 + var23.field_n) * 256 / 30, 245);
                    break L4;
                  } else {
                    iia.a((byte) -57, 199, 256 * (var23.field_n - var3) / 30, var23, -256 * var3 / 30, 245);
                    break L4;
                  }
                }
                L5: {
                  if (null != g.field_f) {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L6: while (true) {
                      if (oja.field_f.length <= var5) {
                        if (var2 == null) {
                          break L5;
                        } else {
                          int discarded$15 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L5;
                        }
                      } else {
                        var24 = oja.field_f[var5];
                        if (var24 != null) {
                          L7: {
                            if (365 != var24.field_n) {
                              break L7;
                            } else {
                              if (139 != var24.field_o) {
                                break L7;
                              } else {
                                var5++;
                                continue L6;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = var2 + ", " + var5;
                            var5++;
                            continue L6;
                          } else {
                            var2 = Integer.toString(var5);
                            var5++;
                            continue L6;
                          }
                        } else {
                          var5++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              L8: {
                if (null != g.field_f) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L9: while (true) {
                    if (oja.field_f.length <= var5) {
                      if (var2 == null) {
                        break L8;
                      } else {
                        int discarded$16 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L8;
                      }
                    } else {
                      var24 = oja.field_f[var5];
                      if (var24 != null) {
                        L10: {
                          if (365 != var24.field_n) {
                            break L10;
                          } else {
                            if (139 != var24.field_o) {
                              break L10;
                            } else {
                              var5++;
                              continue L9;
                            }
                          }
                        }
                        if (var2 != null) {
                          var2 = var2 + ", " + var5;
                          var5++;
                          continue L9;
                        } else {
                          var2 = Integer.toString(var5);
                          var5++;
                          continue L9;
                        }
                      } else {
                        var5++;
                        continue L9;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            if (null != g.field_f) {
              int discarded$17 = g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              if (gp.field_A < ph.field_E) {
                var32 = oja.field_f[vj.field_n];
                if (var32 == null) {
                  if (null != g.field_f) {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L11: while (true) {
                      if (oja.field_f.length <= var5) {
                        if (var2 == null) {
                          return;
                        } else {
                          int discarded$18 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          return;
                        }
                      } else {
                        var41 = oja.field_f[var5];
                        if (var41 != null) {
                          L12: {
                            if (365 != var41.field_n) {
                              break L12;
                            } else {
                              if (139 != var41.field_o) {
                                break L12;
                              } else {
                                var5++;
                                continue L11;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = var2 + ", " + var5;
                            var5++;
                            continue L11;
                          } else {
                            var2 = Integer.toString(var5);
                            var5++;
                            continue L11;
                          }
                        } else {
                          var5++;
                          continue L11;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  var2_int = (60 + var32.field_n) * gp.field_A / ph.field_E;
                  var3 = var2_int - 30;
                  if (!ja.field_p) {
                    iia.a((byte) 123, 199, -256 * var3 / 30, var32, (-var3 + var32.field_n) * 256 / 30, 245);
                    if (null != g.field_f) {
                      var2 = null;
                      var5 = 0;
                      var3 = var5;
                      L13: while (true) {
                        if (oja.field_f.length <= var5) {
                          if (var2 == null) {
                            return;
                          } else {
                            int discarded$19 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                            return;
                          }
                        } else {
                          var39 = oja.field_f[var5];
                          if (var39 != null) {
                            L14: {
                              if (365 != var39.field_n) {
                                break L14;
                              } else {
                                if (139 != var39.field_o) {
                                  break L14;
                                } else {
                                  var5++;
                                  continue L13;
                                }
                              }
                            }
                            if (var2 != null) {
                              var2 = var2 + ", " + var5;
                              var5++;
                              continue L13;
                            } else {
                              var2 = Integer.toString(var5);
                              var5++;
                              continue L13;
                            }
                          } else {
                            var5++;
                            continue L13;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    iia.a((byte) -57, 199, 256 * (var32.field_n - var3) / 30, var32, -256 * var3 / 30, 245);
                    if (null != g.field_f) {
                      var2 = null;
                      var5 = 0;
                      var3 = var5;
                      L15: while (true) {
                        if (oja.field_f.length <= var5) {
                          if (var2 == null) {
                            return;
                          } else {
                            int discarded$20 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                            return;
                          }
                        } else {
                          var35 = oja.field_f[var5];
                          if (var35 != null) {
                            L16: {
                              if (365 != var35.field_n) {
                                break L16;
                              } else {
                                if (139 != var35.field_o) {
                                  break L16;
                                } else {
                                  var5++;
                                  continue L15;
                                }
                              }
                            }
                            if (var2 != null) {
                              var2 = var2 + ", " + var5;
                              var5++;
                              continue L15;
                            } else {
                              var2 = Integer.toString(var5);
                              var5++;
                              continue L15;
                            }
                          } else {
                            var5++;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (null != g.field_f) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L17: while (true) {
                    if (oja.field_f.length <= var5) {
                      if (var2 != null) {
                        int discarded$21 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var28 = oja.field_f[var5];
                      if (var28 != null) {
                        L18: {
                          if (365 != var28.field_n) {
                            break L18;
                          } else {
                            if (139 != var28.field_o) {
                              break L18;
                            } else {
                              var5++;
                              continue L17;
                            }
                          }
                        }
                        if (var2 != null) {
                          var2 = var2 + ", " + var5;
                          var5++;
                          continue L17;
                        } else {
                          var2 = Integer.toString(var5);
                          var5++;
                          continue L17;
                        }
                      } else {
                        var5++;
                        continue L17;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (gp.field_A < ph.field_E) {
                var11 = oja.field_f[vj.field_n];
                if (var11 == null) {
                  if (null != g.field_f) {
                    L19: {
                      var17 = null;
                      var2 = (String) var17;
                      var5 = 0;
                      var3 = var5;
                      if (oja.field_f.length <= var5) {
                        break L19;
                      } else {
                        L20: {
                          L21: {
                            L22: {
                              var16 = oja.field_f[var5];
                              if (var16 != null) {
                                L23: {
                                  if (365 != var16.field_n) {
                                    break L23;
                                  } else {
                                    if (139 != var16.field_o) {
                                      break L23;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                if (var2 != null) {
                                  var2 = var17 + ", " + var5;
                                  break L20;
                                } else {
                                  var2 = Integer.toString(var5);
                                  break L21;
                                }
                              } else {
                                var5++;
                                break L22;
                              }
                            }
                            var5++;
                            break L21;
                          }
                          var5++;
                          break L20;
                        }
                        var5++;
                        var5++;
                        break L19;
                      }
                    }
                    if (var2 != null) {
                      int discarded$22 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  var2_int = (60 + var11.field_n) * gp.field_A / ph.field_E;
                  var3 = var2_int - 30;
                  if (ja.field_p) {
                    L24: {
                      iia.a((byte) -57, 199, 256 * (var11.field_n - var3) / 30, var11, -256 * var3 / 30, 245);
                      if (null != g.field_f) {
                        L25: {
                          var13 = null;
                          var2 = (String) var13;
                          var5 = 0;
                          var3 = var5;
                          if (oja.field_f.length <= var5) {
                            break L25;
                          } else {
                            L26: {
                              L27: {
                                L28: {
                                  var12 = oja.field_f[var5];
                                  if (var12 != null) {
                                    L29: {
                                      if (365 != var12.field_n) {
                                        break L29;
                                      } else {
                                        if (139 != var12.field_o) {
                                          break L29;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                    if (var2 != null) {
                                      var2 = var13 + ", " + var5;
                                      break L26;
                                    } else {
                                      var2 = Integer.toString(var5);
                                      break L27;
                                    }
                                  } else {
                                    var5++;
                                    break L28;
                                  }
                                }
                                var5++;
                                break L27;
                              }
                              var5++;
                              break L26;
                            }
                            var5++;
                            var5++;
                            var5++;
                            var5++;
                            var5++;
                            break L25;
                          }
                        }
                        if (var2 == null) {
                          break L24;
                        } else {
                          int discarded$23 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    L30: {
                      iia.a((byte) 123, 199, -256 * var3 / 30, var11, (-var3 + var11.field_n) * 256 / 30, 245);
                      if (null != g.field_f) {
                        L31: {
                          var15 = null;
                          var2 = (String) var15;
                          var5 = 0;
                          var3 = var5;
                          if (oja.field_f.length <= var5) {
                            break L31;
                          } else {
                            L32: {
                              L33: {
                                L34: {
                                  var14 = oja.field_f[var5];
                                  if (var14 != null) {
                                    L35: {
                                      if (365 != var14.field_n) {
                                        break L35;
                                      } else {
                                        if (139 != var14.field_o) {
                                          break L35;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                    if (var2 != null) {
                                      var2 = var15 + ", " + var5;
                                      break L32;
                                    } else {
                                      var2 = Integer.toString(var5);
                                      break L33;
                                    }
                                  } else {
                                    var5++;
                                    break L34;
                                  }
                                }
                                var5++;
                                break L33;
                              }
                              var5++;
                              break L32;
                            }
                            var5++;
                            var5++;
                            break L31;
                          }
                        }
                        if (var2 == null) {
                          break L30;
                        } else {
                          int discarded$24 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L30;
                        }
                      } else {
                        break L30;
                      }
                    }
                    return;
                  }
                }
              } else {
                L36: {
                  if (null != g.field_f) {
                    L37: {
                      var10 = null;
                      var2 = (String) var10;
                      var5 = 0;
                      var3 = var5;
                      if (oja.field_f.length <= var5) {
                        break L37;
                      } else {
                        L38: {
                          L39: {
                            L40: {
                              var9 = oja.field_f[var5];
                              if (var9 != null) {
                                L41: {
                                  if (365 != var9.field_n) {
                                    break L41;
                                  } else {
                                    if (139 != var9.field_o) {
                                      break L41;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                                if (var2 != null) {
                                  var2 = var10 + ", " + var5;
                                  break L38;
                                } else {
                                  var2 = Integer.toString(var5);
                                  break L39;
                                }
                              } else {
                                var5++;
                                break L40;
                              }
                            }
                            var5++;
                            break L39;
                          }
                          var5++;
                          break L38;
                        }
                        var5++;
                        var5++;
                        var5++;
                        var5++;
                        var5++;
                        break L37;
                      }
                    }
                    if (var2 == null) {
                      break L36;
                    } else {
                      int discarded$25 = g.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L36;
                    }
                  } else {
                    break L36;
                  }
                }
                return;
              }
            }
          }
        } else {
          L42: {
            if (null != g.field_f) {
              int discarded$26 = g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L42;
            } else {
              break L42;
            }
          }
          return;
        }
    }

    final static void a(byte param0) {
        ov.field_g = null;
        jl.field_s = -1;
        if (param0 < 7) {
            return;
        }
        eaa.field_b = -1;
        b.field_r = false;
        df.field_o = 0;
    }

    static {
    }
}
