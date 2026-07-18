/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static uf field_b;
    static tk field_a;

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_83_0 = 0;
        var4 = HoldTheLine.field_D;
        ol.field_f = ol.field_f + 1;
        var2 = 0;
        if (param1 != a.field_I) {
          if (!va.field_k) {
            L0: {
              if (ol.field_f >= HoldTheLine.field_A) {
                if (HoldTheLine.field_A - -lc.field_h > ol.field_f) {
                  stackOut_86_0 = 1;
                  stackIn_88_0 = stackOut_86_0;
                  break L0;
                } else {
                  stackOut_85_0 = 0;
                  stackIn_88_0 = stackOut_85_0;
                  break L0;
                }
              } else {
                stackOut_83_0 = 0;
                stackIn_88_0 = stackOut_83_0;
                break L0;
              }
            }
            var3 = stackIn_88_0;
            if (param1 == -1) {
              L1: {
                ol.field_f = 0;
                if (-1 == param1) {
                  if (var3 == 0) {
                    break L1;
                  } else {
                    va.field_k = true;
                    break L1;
                  }
                } else {
                  va.field_k = false;
                  break L1;
                }
              }
              L2: {
                if (va.field_k) {
                  break L2;
                } else {
                  if (HoldTheLine.field_A <= ol.field_f) {
                    break L2;
                  } else {
                    if (na.field_k) {
                      ol.field_f = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                a.field_I = param1;
                if (!va.field_k) {
                  break L3;
                } else {
                  if (ol.field_f != fd.field_d) {
                    break L3;
                  } else {
                    ol.field_f = 0;
                    va.field_k = false;
                    break L3;
                  }
                }
              }
              return;
            } else {
              L4: {
                if (va.field_k) {
                  ol.field_f = HoldTheLine.field_A;
                  break L4;
                } else {
                  if (var3 == 0) {
                    L5: {
                      ol.field_f = 0;
                      if (-1 == param1) {
                        if (var3 == 0) {
                          break L5;
                        } else {
                          va.field_k = true;
                          break L5;
                        }
                      } else {
                        va.field_k = false;
                        break L5;
                      }
                    }
                    L6: {
                      if (va.field_k) {
                        break L6;
                      } else {
                        if (HoldTheLine.field_A <= ol.field_f) {
                          break L6;
                        } else {
                          if (na.field_k) {
                            ol.field_f = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    a.field_I = param1;
                    if (va.field_k) {
                      if (ol.field_f != fd.field_d) {
                        return;
                      } else {
                        ol.field_f = 0;
                        va.field_k = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ol.field_f = HoldTheLine.field_A;
                    break L4;
                  }
                }
              }
              if (-1 == param1) {
                if (var3 == 0) {
                  L7: {
                    if (va.field_k) {
                      break L7;
                    } else {
                      if (HoldTheLine.field_A <= ol.field_f) {
                        break L7;
                      } else {
                        if (na.field_k) {
                          ol.field_f = 0;
                          break L7;
                        } else {
                          L8: {
                            a.field_I = param1;
                            if (!va.field_k) {
                              break L8;
                            } else {
                              if (ol.field_f != fd.field_d) {
                                break L8;
                              } else {
                                ol.field_f = 0;
                                va.field_k = false;
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  L9: {
                    a.field_I = param1;
                    if (!va.field_k) {
                      break L9;
                    } else {
                      if (ol.field_f != fd.field_d) {
                        break L9;
                      } else {
                        ol.field_f = 0;
                        va.field_k = false;
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L10: {
                    va.field_k = true;
                    if (va.field_k) {
                      break L10;
                    } else {
                      if (HoldTheLine.field_A <= ol.field_f) {
                        break L10;
                      } else {
                        if (na.field_k) {
                          ol.field_f = 0;
                          break L10;
                        } else {
                          a.field_I = param1;
                          if (va.field_k) {
                            if (ol.field_f == fd.field_d) {
                              ol.field_f = 0;
                              va.field_k = false;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  a.field_I = param1;
                  if (va.field_k) {
                    if (ol.field_f == fd.field_d) {
                      ol.field_f = 0;
                      va.field_k = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  va.field_k = false;
                  if (va.field_k) {
                    break L11;
                  } else {
                    if (HoldTheLine.field_A <= ol.field_f) {
                      break L11;
                    } else {
                      if (na.field_k) {
                        ol.field_f = 0;
                        break L11;
                      } else {
                        a.field_I = param1;
                        if (va.field_k) {
                          if (ol.field_f == fd.field_d) {
                            ol.field_f = 0;
                            va.field_k = false;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                a.field_I = param1;
                if (va.field_k) {
                  if (ol.field_f != fd.field_d) {
                    return;
                  } else {
                    ol.field_f = 0;
                    va.field_k = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            var3 = 0;
            if (param1 != -1) {
              L12: {
                if (!va.field_k) {
                  if (var3 == 0) {
                    L13: {
                      ol.field_f = 0;
                      if (-1 == param1) {
                        if (var3 == 0) {
                          break L13;
                        } else {
                          va.field_k = true;
                          break L13;
                        }
                      } else {
                        va.field_k = false;
                        break L13;
                      }
                    }
                    L14: {
                      if (!va.field_k) {
                        a.field_I = param1;
                        if (!va.field_k) {
                          break L14;
                        } else {
                          if (ol.field_f != fd.field_d) {
                            break L14;
                          } else {
                            ol.field_f = 0;
                            va.field_k = false;
                            break L14;
                          }
                        }
                      } else {
                        a.field_I = param1;
                        if (!va.field_k) {
                          break L14;
                        } else {
                          if (ol.field_f != fd.field_d) {
                            break L14;
                          } else {
                            ol.field_f = 0;
                            va.field_k = false;
                            break L14;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ol.field_f = HoldTheLine.field_A;
                    break L12;
                  }
                } else {
                  ol.field_f = HoldTheLine.field_A;
                  break L12;
                }
              }
              if (-1 == param1) {
                if (var3 == 0) {
                  L15: {
                    if (va.field_k) {
                      break L15;
                    } else {
                      if (HoldTheLine.field_A <= ol.field_f) {
                        break L15;
                      } else {
                        if (na.field_k) {
                          ol.field_f = 0;
                          break L15;
                        } else {
                          L16: {
                            a.field_I = param1;
                            if (!va.field_k) {
                              break L16;
                            } else {
                              if (ol.field_f != fd.field_d) {
                                break L16;
                              } else {
                                ol.field_f = 0;
                                va.field_k = false;
                                break L16;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  a.field_I = param1;
                  if (va.field_k) {
                    if (ol.field_f == fd.field_d) {
                      ol.field_f = 0;
                      va.field_k = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L17: {
                    va.field_k = true;
                    if (va.field_k) {
                      break L17;
                    } else {
                      if (HoldTheLine.field_A <= ol.field_f) {
                        break L17;
                      } else {
                        if (na.field_k) {
                          ol.field_f = 0;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  L18: {
                    a.field_I = param1;
                    if (!va.field_k) {
                      break L18;
                    } else {
                      if (ol.field_f != fd.field_d) {
                        break L18;
                      } else {
                        ol.field_f = 0;
                        va.field_k = false;
                        break L18;
                      }
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  va.field_k = false;
                  if (va.field_k) {
                    break L19;
                  } else {
                    if (HoldTheLine.field_A <= ol.field_f) {
                      break L19;
                    } else {
                      if (na.field_k) {
                        ol.field_f = 0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                L20: {
                  a.field_I = param1;
                  if (!va.field_k) {
                    break L20;
                  } else {
                    if (ol.field_f != fd.field_d) {
                      break L20;
                    } else {
                      ol.field_f = 0;
                      va.field_k = false;
                      break L20;
                    }
                  }
                }
                return;
              }
            } else {
              L21: {
                ol.field_f = 0;
                if (-1 == param1) {
                  if (var3 == 0) {
                    break L21;
                  } else {
                    va.field_k = true;
                    break L21;
                  }
                } else {
                  va.field_k = false;
                  break L21;
                }
              }
              L22: {
                if (!va.field_k) {
                  a.field_I = param1;
                  if (!va.field_k) {
                    break L22;
                  } else {
                    if (ol.field_f != fd.field_d) {
                      break L22;
                    } else {
                      ol.field_f = 0;
                      va.field_k = false;
                      break L22;
                    }
                  }
                } else {
                  a.field_I = param1;
                  if (!va.field_k) {
                    break L22;
                  } else {
                    if (ol.field_f != fd.field_d) {
                      break L22;
                    } else {
                      ol.field_f = 0;
                      va.field_k = false;
                      break L22;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          L23: {
            if (va.field_k) {
              break L23;
            } else {
              if (HoldTheLine.field_A <= ol.field_f) {
                break L23;
              } else {
                if (na.field_k) {
                  ol.field_f = 0;
                  break L23;
                } else {
                  L24: {
                    a.field_I = param1;
                    if (!va.field_k) {
                      break L24;
                    } else {
                      if (ol.field_f != fd.field_d) {
                        break L24;
                      } else {
                        ol.field_f = 0;
                        va.field_k = false;
                        break L24;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          a.field_I = param1;
          if (va.field_k) {
            if (ol.field_f == fd.field_d) {
              ol.field_f = 0;
              va.field_k = false;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var1_int = qg.field_d[0];
            var2 = 1;
            L1: while (true) {
              if (qg.field_d.length <= var2) {
                break L0;
              } else {
                var3 = qg.field_d[var2];
                bc.a(al.field_b, var2 << 4, al.field_b, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "hm.E(" + 126 + ')');
        }
    }

    final static kg a(int param0, String param1) {
        RuntimeException var2 = null;
        kg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new kg(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("hm.C(").append(5499).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ie var4_ref_ie = null;
        int var4 = 0;
        fl var5 = null;
        int var5_int = 0;
        Object var6 = null;
        byte[] var6_array = null;
        int var7 = 0;
        byte[] var8 = null;
        da var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3 = -84 % ((-58 - param0) / 61);
              var9 = rd.field_e;
              var2 = var9.f((byte) -32);
              if (var2 != 0) {
                if (var2 == 1) {
                  var4 = var9.a(-67);
                  var5 = (fl) (Object) pd.field_e.b((byte) 85);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        if (var4 == var5.field_k) {
                          break L3;
                        } else {
                          var5 = (fl) (Object) pd.field_e.c((byte) -26);
                          continue L2;
                        }
                      }
                    }
                    if (var5 != null) {
                      var5.d(0);
                      break L1;
                    } else {
                      r.a(-28036);
                      return;
                    }
                  }
                } else {
                  bl.a((Throwable) null, (byte) 65, "A1: " + em.b(false));
                  r.a(-28036);
                  break L1;
                }
              } else {
                var4_ref_ie = (ie) (Object) oc.field_d.b((byte) 94);
                if (var4_ref_ie == null) {
                  r.a(-28036);
                  return;
                } else {
                  L4: {
                    var5_int = var9.f((byte) -85);
                    if (0 == var5_int) {
                      var6_array = null;
                      break L4;
                    } else {
                      var13 = new byte[var5_int];
                      var12 = var13;
                      var11 = var12;
                      var10 = var11;
                      var8 = var10;
                      var6_array = var8;
                      var9.a(var5_int, 0, (byte) 118, var13);
                      break L4;
                    }
                  }
                  var9.field_l = var9.field_l + 4;
                  if (var9.e((byte) 78)) {
                    var4_ref_ie.field_m = true;
                    var4_ref_ie.field_l = var6_array;
                    var4_ref_ie.d(0);
                    break L1;
                  } else {
                    r.a(-28036);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "hm.B(" + param0 + ')');
        }
    }

    static {
    }
}
