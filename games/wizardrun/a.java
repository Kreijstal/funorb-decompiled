/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static gb field_a;
    static String[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = wizardrun.field_H;
          if (param6 < 0) {
            break L0;
          } else {
            if (param8 >= cj.field_d) {
              break L0;
            } else {
              L1: {
                if (param7 == -20476) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              L2: {
                if (param3 >= 0) {
                  break L2;
                } else {
                  if (param5 >= 0) {
                    break L2;
                  } else {
                    if (param0 >= 0) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param3 < cj.field_b) {
                  break L3;
                } else {
                  if (cj.field_b > param5) {
                    break L3;
                  } else {
                    if (param0 < cj.field_b) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  var14 = -param8 + param6;
                  if (param8 == param2) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param3 << 217207824;
                        var9 = param3 << 217207824;
                        var15 = -param8 + param2;
                        var11 = (param5 - param3 << 1589196432) / var15;
                        var12 = (-param3 + param0 << 2130297168) / var14;
                        if (var12 <= var11) {
                          break L7;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      var13 = 1;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param8 >= 0) {
                          var16 = cj.field_a[param8];
                          L10: while (true) {
                            if (param8 >= param2) {
                              break L8;
                            } else {
                              L11: {
                                var17 = var9 >> -152979408;
                                if (cj.field_b <= var17) {
                                  break L11;
                                } else {
                                  L12: {
                                    var18 = -(var9 >> -1409637328) + (var10 >> 1884136048);
                                    if (var18 == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var18 + var17 >= cj.field_b) {
                                          var18 = -1 + (-var17 + cj.field_b);
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (var17 < 0) {
                                          break L14;
                                        } else {
                                          se.a(var17 + var16, param7 + 20599, param1, var18, param4);
                                          if (0 == 0) {
                                            break L11;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      se.a(var16, 95, param1, var17 + var18, param4);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (var17 >= cj.field_b) {
                                      break L11;
                                    } else {
                                      se.a(var17 + var16, 123, param1, var18, param4);
                                      break L11;
                                    }
                                  }
                                }
                              }
                              param8++;
                              if (cj.field_d > param8) {
                                var16 = var16 + ed.field_h;
                                var9 = var9 + var11;
                                var10 = var10 + var12;
                                if (0 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          L15: {
                            if (param2 >= 0) {
                              break L15;
                            } else {
                              param8 = param2 + -param8;
                              var9 = var9 + var11 * param8;
                              var10 = var10 + var12 * param8;
                              param8 = param2;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L15;
                              }
                            }
                          }
                          param8 = -param8;
                          var10 = var10 + var12 * param8;
                          var9 = var9 + var11 * param8;
                          param8 = 0;
                          break L9;
                        }
                      }
                      var16 = cj.field_a[param8];
                      L16: while (true) {
                        if (param8 >= param2) {
                          break L8;
                        } else {
                          L17: {
                            var17 = var9 >> -152979408;
                            if (cj.field_b <= var17) {
                              break L17;
                            } else {
                              L18: {
                                var18 = -(var9 >> -1409637328) + (var10 >> 1884136048);
                                if (var18 == 0) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var18 + var17 >= cj.field_b) {
                                      var18 = -1 + (-var17 + cj.field_b);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (var17 < 0) {
                                      break L20;
                                    } else {
                                      se.a(var17 + var16, param7 + 20599, param1, var18, param4);
                                      if (0 == 0) {
                                        break L17;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  se.a(var16, 95, param1, var17 + var18, param4);
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L17;
                              } else {
                                if (var17 >= cj.field_b) {
                                  break L17;
                                } else {
                                  se.a(var17 + var16, 123, param1, var18, param4);
                                  break L17;
                                }
                              }
                            }
                          }
                          param8++;
                          if (cj.field_d > param8) {
                            var16 = var16 + ed.field_h;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        var16 = param6 + -param2;
                        if (0 != var16) {
                          break L22;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        L24: {
                          var17 = param0 << 455341008;
                          if (var13 != 0) {
                            break L24;
                          } else {
                            var9 = param5 << -454410960;
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var10 = param5 << -237429328;
                        break L23;
                      }
                      var12 = (var17 + -var10) / var16;
                      var11 = (var17 - var9) / var16;
                      break L21;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L25: {
                  L26: {
                    if (param8 != param6) {
                      break L26;
                    } else {
                      var9 = param3 << 375884304;
                      var11 = 0;
                      var12 = 0;
                      var10 = param5 << 1041901232;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var15 = param6 - param2;
                    if (param3 >= param5) {
                      break L27;
                    } else {
                      var10 = param5 << 1752793872;
                      var9 = param3 << -1704007568;
                      var12 = (-param5 + param0 << 978938416) / var15;
                      var11 = (-param3 + param0 << -957680016) / var14;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var11 = (-param5 + param0 << -675054192) / var15;
                  var12 = (-param3 + param0 << 1533737392) / var14;
                  var10 = param3 << 710859440;
                  var9 = param5 << 508444880;
                  break L25;
                }
                var13 = 0;
                if (param8 < 0) {
                  param8 = Math.min(-param8, param2 + -param8);
                  var10 = var10 + var12 * param8;
                  var9 = var9 + var11 * param8;
                  param8 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L28: {
                if (param8 >= 0) {
                  break L28;
                } else {
                  param8 = -param8;
                  var9 = var9 + param8 * var11;
                  var10 = var10 + var12 * param8;
                  param8 = 0;
                  break L28;
                }
              }
              var15 = cj.field_a[param8];
              if (param6 > param8) {
                L29: {
                  var16 = var9 >> -974510416;
                  if (var16 < cj.field_b) {
                    L30: {
                      var17 = -(var9 >> 439317136) + (var10 >> -331851056);
                      if (var17 == 0) {
                        break L30;
                      } else {
                        L31: {
                          if (cj.field_b > var16 - -var17) {
                            break L31;
                          } else {
                            var17 = -1 + (cj.field_b - var16);
                            break L31;
                          }
                        }
                        L32: {
                          if (0 <= var16) {
                            break L32;
                          } else {
                            se.a(var15, 84, param1, var16 + var17, param4);
                            if (0 == 0) {
                              break L29;
                            } else {
                              break L32;
                            }
                          }
                        }
                        se.a(var15 + var16, 89, param1, var17, param4);
                        if (0 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L29;
                    } else {
                      if (var16 >= cj.field_b) {
                        break L29;
                      } else {
                        se.a(var15 + var16, 123, param1, var17, param4);
                        break L29;
                      }
                    }
                  } else {
                    break L29;
                  }
                }
                param8++;
                if (param8 >= cj.field_d) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var10 = var10 + var12;
                  var15 = var15 + ed.field_h;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -331851056) {
            Object var2 = null;
            a.a(-97, -4, 61, -122, (int[]) null, -38, 93, 89, -73);
        }
        field_b = null;
        field_a = null;
    }

    static {
    }
}
