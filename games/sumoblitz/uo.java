/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends rq {
    private boolean field_f;
    static nj[] field_e;

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = uo.a(false, (CharSequence[]) null);
                break L1;
              }
            }
            stackOut_2_0 = se.a(param1, 0, param1.length, 14156);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("uo.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, byte param1) {
        ((uo) this).field_b.a((byte) -83, lf.field_e, vi.field_v);
        if (param1 > -71) {
            ((uo) this).field_f = false;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            field_e = null;
        }
    }

    final static byte a(boolean param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                var2 = (byte)param1;
                return (byte) var2;
              } else {
                L0: {
                  if (8364 != param1) {
                    if (param1 != 8218) {
                      if (param1 != 402) {
                        if (param1 != 8222) {
                          if (param1 != 8230) {
                            if (param1 != 8224) {
                              if (8225 != param1) {
                                if (param1 != 710) {
                                  if (param1 != 8240) {
                                    if (param1 != 352) {
                                      if (8249 == param1) {
                                        var2 = -117;
                                        return (byte) var2;
                                      } else {
                                        if (338 == param1) {
                                          var2 = -116;
                                          return (byte) var2;
                                        } else {
                                          if (param1 == 381) {
                                            var2 = -114;
                                            return (byte) var2;
                                          } else {
                                            if (param1 != 8216) {
                                              if (param1 != 8217) {
                                                if (param1 == 8220) {
                                                  var2 = -109;
                                                  return (byte) var2;
                                                } else {
                                                  if (8221 == param1) {
                                                    var2 = -108;
                                                    return (byte) var2;
                                                  } else {
                                                    if (8226 == param1) {
                                                      var2 = -107;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param1 == 8211) {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      } else {
                                                        if (8212 != param1) {
                                                          if (param1 != 732) {
                                                            if (param1 == 8482) {
                                                              var2 = -103;
                                                              break L0;
                                                            } else {
                                                              if (param1 != 353) {
                                                                if (8250 == param1) {
                                                                  var2 = -101;
                                                                  break L0;
                                                                } else {
                                                                  if (param1 != 339) {
                                                                    if (param1 != 382) {
                                                                      if (param1 != 376) {
                                                                        var2 = 63;
                                                                        break L0;
                                                                      } else {
                                                                        var2 = -97;
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -111;
                                              break L0;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var2 = -118;
                                      return (byte) var2;
                                    }
                                  } else {
                                    var2 = -119;
                                    return (byte) var2;
                                  }
                                } else {
                                  var2 = -120;
                                  break L0;
                                }
                              } else {
                                var2 = -121;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -122;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -123;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -124;
                          break L0;
                        }
                      } else {
                        var2 = -125;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -126;
                      break L0;
                    }
                  } else {
                    var2 = -128;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L1: {
                if (8364 != param1) {
                  if (param1 != 8218) {
                    if (param1 != 402) {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (8225 != param1) {
                              if (param1 != 710) {
                                if (param1 != 8240) {
                                  if (param1 != 352) {
                                    if (8249 != param1) {
                                      if (338 != param1) {
                                        if (param1 != 381) {
                                          if (param1 != 8216) {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (8221 != param1) {
                                                  if (8226 != param1) {
                                                    if (param1 == 8211) {
                                                      var2 = -106;
                                                      return (byte) var2;
                                                    } else {
                                                      if (8212 != param1) {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            break L1;
                                                          } else {
                                                            if (param1 != 353) {
                                                              if (8250 == param1) {
                                                                var2 = -101;
                                                                break L1;
                                                              } else {
                                                                if (param1 != 339) {
                                                                  if (param1 != 382) {
                                                                    if (param1 != 376) {
                                                                      var2 = 63;
                                                                      break L1;
                                                                    } else {
                                                                      var2 = -97;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var2 = -100;
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    return (byte) var2;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  return (byte) var2;
                                                }
                                              } else {
                                                var2 = -109;
                                                return (byte) var2;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -111;
                                            break L1;
                                          }
                                        } else {
                                          var2 = -114;
                                          return (byte) var2;
                                        }
                                      } else {
                                        var2 = -116;
                                        return (byte) var2;
                                      }
                                    } else {
                                      var2 = -117;
                                      return (byte) var2;
                                    }
                                  } else {
                                    var2 = -118;
                                    return (byte) var2;
                                  }
                                } else {
                                  var2 = -119;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -120;
                                break L1;
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -122;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        break L1;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    break L1;
                  }
                } else {
                  var2 = -128;
                  break L1;
                }
              }
              return (byte) var2;
            }
          } else {
            var2 = (byte)param1;
            return (byte) var2;
          }
        } else {
          L2: {
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (param1 > 255) {
                  break L3;
                } else {
                  var2 = (byte)param1;
                  break L2;
                }
              }
            }
            if (8364 != param1) {
              if (param1 != 8218) {
                if (param1 != 402) {
                  if (param1 != 8222) {
                    if (param1 != 8230) {
                      if (param1 != 8224) {
                        if (8225 != param1) {
                          if (param1 != 710) {
                            if (param1 != 8240) {
                              if (param1 != 352) {
                                if (8249 == param1) {
                                  var2 = -117;
                                  return (byte) var2;
                                } else {
                                  if (338 == param1) {
                                    var2 = -116;
                                    break L2;
                                  } else {
                                    if (param1 == 381) {
                                      var2 = -114;
                                      break L2;
                                    } else {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (param1 == 8220) {
                                            var2 = -109;
                                            break L2;
                                          } else {
                                            if (8221 == param1) {
                                              var2 = -108;
                                              break L2;
                                            } else {
                                              if (8226 == param1) {
                                                var2 = -107;
                                                break L2;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                  break L2;
                                                } else {
                                                  if (8212 != param1) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                        break L2;
                                                      } else {
                                                        if (param1 != 353) {
                                                          if (8250 == param1) {
                                                            var2 = -101;
                                                            break L2;
                                                          } else {
                                                            if (param1 != 339) {
                                                              if (param1 != 382) {
                                                                if (param1 != 376) {
                                                                  var2 = 63;
                                                                  break L2;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                          break L2;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var2 = -118;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -119;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -120;
                            break L2;
                          }
                        } else {
                          var2 = -121;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -122;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -123;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -124;
                    break L2;
                  }
                } else {
                  var2 = -125;
                  return (byte) var2;
                }
              } else {
                var2 = -126;
                break L2;
              }
            } else {
              var2 = -128;
              break L2;
            }
          }
          return (byte) var2;
        }
    }

    final void a(boolean param0, int param1) {
        ef var3 = null;
        ut var4 = null;
        var3 = ((uo) this).field_b.d((byte) 122);
        if (param1 == 20186) {
          if (var3 != null) {
            if (!param0) {
              ((uo) this).field_b.a(fv.field_y, 0, true);
              return;
            } else {
              ((uo) this).field_b.g(1, -122);
              ((uo) this).field_b.a((ed) (Object) var3, 91);
              ((uo) this).field_b.a(param1 + -6432, rt.field_C);
              ((uo) this).field_b.g(1, -114);
              ((uo) this).field_b.a((byte) -83, lf.field_e, ua.field_n);
              ((uo) this).field_b.a((byte) 101, 2, true, false, ta.field_a);
              ((uo) this).field_b.a(fv.field_y, 0, true);
              var4 = ((uo) this).field_b.B(0);
              var4.a((eu) (Object) ((uo) this).field_b.c(true), true);
              ((uo) this).field_b.a(ip.field_y, 28880);
              ((uo) this).field_b.g(0, -124);
              ((uo) this).field_f = true;
              return;
            }
          } else {
            ((uo) this).field_b.a(fv.field_y, 0, true);
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            field_e = null;
            return true;
        }
        return true;
    }

    uo(aw param0) {
        super(param0);
        ((uo) this).field_f = false;
    }

    final void c(boolean param0) {
        aw stackIn_4_0 = null;
        mi stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        aw stackIn_6_0 = null;
        mi stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        aw stackIn_7_0 = null;
        mi stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        aw stackIn_8_0 = null;
        mi stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        aw stackIn_12_0 = null;
        mi stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        aw stackIn_13_0 = null;
        mi stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        aw stackIn_14_0 = null;
        mi stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        aw stackIn_16_0 = null;
        mi stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        aw stackIn_17_0 = null;
        mi stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        aw stackIn_18_0 = null;
        mi stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        aw stackOut_15_0 = null;
        mi stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        aw stackOut_17_0 = null;
        mi stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        aw stackOut_16_0 = null;
        mi stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        aw stackOut_11_0 = null;
        mi stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        aw stackOut_13_0 = null;
        mi stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        aw stackOut_12_0 = null;
        mi stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        aw stackOut_5_0 = null;
        mi stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        aw stackOut_7_0 = null;
        mi stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        aw stackOut_6_0 = null;
        mi stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        aw stackOut_2_0 = null;
        mi stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        if (param0) {
          L0: {
            ((uo) this).field_f = false;
            if (!((uo) this).field_f) {
              L1: {
                stackOut_15_0 = ((uo) this).field_b;
                stackOut_15_1 = jq.field_a;
                stackOut_15_2 = 0;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                if (param0) {
                  stackOut_17_0 = (aw) (Object) stackIn_17_0;
                  stackOut_17_1 = (mi) (Object) stackIn_17_1;
                  stackOut_17_2 = stackIn_17_2;
                  stackOut_17_3 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  stackIn_18_3 = stackOut_17_3;
                  break L1;
                } else {
                  stackOut_16_0 = (aw) (Object) stackIn_16_0;
                  stackOut_16_1 = (mi) (Object) stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  break L1;
                }
              }
              ((aw) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
              break L0;
            } else {
              L2: {
                ((uo) this).field_b.g(1, -111);
                ((uo) this).field_b.a(13754, lf.field_c);
                ((uo) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
                ((uo) this).field_b.a(mm.field_h, 2, 0);
                stackOut_11_0 = ((uo) this).field_b;
                stackOut_11_1 = jq.field_a;
                stackOut_11_2 = 0;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                if (param0) {
                  stackOut_13_0 = (aw) (Object) stackIn_13_0;
                  stackOut_13_1 = (mi) (Object) stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  break L2;
                } else {
                  stackOut_12_0 = (aw) (Object) stackIn_12_0;
                  stackOut_12_1 = (mi) (Object) stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  break L2;
                }
              }
              ((aw) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0);
              ((uo) this).field_b.l(0);
              ((uo) this).field_b.a((ed) null, 98);
              ((uo) this).field_b.g(0, -120);
              ((uo) this).field_f = false;
              break L0;
            }
          }
          ((uo) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
          return;
        } else {
          L3: {
            if (!((uo) this).field_f) {
              L4: {
                stackOut_5_0 = ((uo) this).field_b;
                stackOut_5_1 = jq.field_a;
                stackOut_5_2 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                if (param0) {
                  stackOut_7_0 = (aw) (Object) stackIn_7_0;
                  stackOut_7_1 = (mi) (Object) stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  break L4;
                } else {
                  stackOut_6_0 = (aw) (Object) stackIn_6_0;
                  stackOut_6_1 = (mi) (Object) stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  break L4;
                }
              }
              ((aw) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0);
              break L3;
            } else {
              ((uo) this).field_b.g(1, -111);
              ((uo) this).field_b.a(13754, lf.field_c);
              ((uo) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
              ((uo) this).field_b.a(mm.field_h, 2, 0);
              stackOut_2_0 = ((uo) this).field_b;
              stackOut_2_1 = jq.field_a;
              stackOut_2_2 = 0;
              stackOut_2_3 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              ((aw) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3 != 0);
              ((uo) this).field_b.l(0);
              ((uo) this).field_b.a((ed) null, 98);
              ((uo) this).field_b.g(0, -120);
              ((uo) this).field_f = false;
              break L3;
            }
          }
          ((uo) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((uo) this).field_b.a(param2, 113);
              ((uo) this).field_b.h(param1 ^ 18900, param0);
              if (param1 == 18834) {
                break L1;
              } else {
                var5 = null;
                String discarded$2 = uo.a(true, (CharSequence[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("uo.E(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void d(byte param0) {
        field_e = null;
    }

    static {
    }
}
