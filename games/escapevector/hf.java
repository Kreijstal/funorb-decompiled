/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static double field_c;
    static int field_b;
    static boolean field_a;

    final static void a(int param0) {
        mi var1 = (mi) (Object) k.field_d.b(-8980);
        if (var1 == null) {
            var1 = new mi();
        }
        var1.a(em.field_j, (byte) 29, em.field_k, em.field_b, em.field_a, em.field_d, em.field_i, em.field_l);
        int var2 = 28 % ((param0 - -72) / 49);
        re.field_q.a(-12328, (hg) (Object) var1);
    }

    final static String b(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        var5 = EscapeVector.field_A;
        var6 = "(" + g.field_q + " " + f.field_t + " " + jj.field_b + ") " + cd.field_v;
        if (-1 > (hi.field_r ^ -1)) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (var2 < hi.field_r) {
              L1: {
                var7 = var1 + 32;
                var3 = 255 & om.field_g.field_g[var2];
                var4 = var3 >> -1780804028;
                stackOut_5_0 = var4;
                stackOut_5_1 = 10;
                stackIn_16_0 = stackOut_5_0;
                stackIn_16_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (var5 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (stackIn_6_0 < stackIn_6_1) {
                        break L3;
                      } else {
                        var4 += 55;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 48;
                    break L2;
                  }
                  L4: {
                    L5: {
                      var3 = var3 & 15;
                      var8 = var7 + (char)var4;
                      if ((var3 ^ -1) <= -11) {
                        break L5;
                      } else {
                        var3 += 48;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 55;
                    break L4;
                  }
                  var1 = var8 + (char)var3;
                  var2++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    stackOut_15_0 = 96;
                    stackOut_15_1 = (-24 - param0) / 38;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L1;
                  }
                }
              }
              var2 = stackIn_16_0 / stackIn_16_1;
              return var1;
            } else {
              var2 = 96 / ((-24 - param0) / 38);
              return var1;
            }
          }
        } else {
          var2 = 96 / ((-24 - param0) / 38);
          return var6;
        }
    }

    final boolean a(byte param0) {
        if (param0 >= 62) {
          if (this != (Object) (Object) mc.field_b) {
            if ((Object) (Object) rn.field_c != this) {
              if (this == (Object) (Object) ck.field_t) {
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
          return false;
        }
    }

    final static byte[] a(mf param0, int[] param1, int param2, int param3, mf param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        mf var8 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        mf var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        mf var20 = null;
        String var21 = null;
        String var22 = null;
        mf stackIn_8_0 = null;
        mf stackIn_21_0 = null;
        mf stackOut_20_0 = null;
        mf stackOut_19_0 = null;
        mf stackOut_7_0 = null;
        mf stackOut_6_0 = null;
        if (param5 >= 92) {
          var6 = je.a(false, param3);
          if (param2 >= 0) {
            if (var6 > param2) {
              L0: {
                var7 = dh.field_e[param3];
                if ((var7 ^ -1) != -3) {
                  stackOut_20_0 = (mf) param0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = (mf) param4;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              var20 = stackIn_21_0;
              var8 = var20;
              if (var8 != null) {
                var18 = ja.field_e[param3].toLowerCase();
                var17 = fh.field_c[param3][param2].toLowerCase() + ".lvl";
                var19 = rd.a((byte) 72, var17);
                var22 = var18 + "_" + var19;
                var21 = "";
                if (param1 != null) {
                  return var20.a((byte) -73, var21, var22, param1);
                } else {
                  return var20.a(-4, var22, var21);
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_b = -32;
          var6 = je.a(false, param3);
          if (param2 >= 0) {
            if (var6 > param2) {
              L1: {
                var7 = dh.field_e[param3];
                if ((var7 ^ -1) != -3) {
                  stackOut_7_0 = (mf) param0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = (mf) param4;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              var14 = stackIn_8_0;
              var8 = var14;
              if (var8 != null) {
                var12 = ja.field_e[param3].toLowerCase();
                var11 = fh.field_c[param3][param2].toLowerCase() + ".lvl";
                var13 = rd.a((byte) 72, var11);
                var16 = var12 + "_" + var13;
                var15 = "";
                if (param1 != null) {
                  return var14.a((byte) -73, var15, var16, param1);
                } else {
                  return var14.a(-4, var16, var15);
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static ed[] b(int param0) {
        ed[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var14 = null;
        int[] var15 = null;
        byte[] var16 = null;
        int[] var17 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        var7 = EscapeVector.field_A;
        if (param0 >= 63) {
          var1 = new ed[qk.field_j];
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= qk.field_j) {
                  break L2;
                } else {
                  var3 = bc.field_a[var2] * qh.field_k[var2];
                  var14 = qe.field_a[var2];
                  var15 = new int[var3];
                  var9 = var15;
                  var5 = var9;
                  stackOut_4_0 = 0;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    var6 = stackIn_5_0;
                    L3: while (true) {
                      if (var6 >= var3) {
                        var1[var2] = new ed(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var15);
                        var2++;
                        if (var7 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      } else {
                        var5[var6] = qk.field_f[ae.a((int) var14[var6], 255)];
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            of.a(stackIn_13_0 != 0);
            return var1;
          }
        } else {
          field_c = -0.8853374871854307;
          var1 = new ed[qk.field_j];
          var2 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var2 >= qk.field_j) {
                  break L6;
                } else {
                  var3 = bc.field_a[var2] * qh.field_k[var2];
                  var16 = qe.field_a[var2];
                  var17 = new int[var3];
                  var11 = var17;
                  var5 = var11;
                  stackOut_16_0 = 0;
                  stackIn_25_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var7 != 0) {
                    break L5;
                  } else {
                    var6 = stackIn_17_0;
                    L7: while (true) {
                      if (var6 >= var3) {
                        var1[var2] = new ed(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var17);
                        var2++;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      } else {
                        var5[var6] = qk.field_f[ae.a((int) var16[var6], 255)];
                        var6++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L5;
            }
            of.a(stackIn_25_0 != 0);
            return var1;
          }
        }
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        if (param0 > 22) {
          if (param1 <= 0) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                var2 = (byte)param1;
                return (byte) var2;
              } else {
                L0: {
                  L1: {
                    if (8364 == param1) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 == 8218) {
                          break L2;
                        } else {
                          L3: {
                            if (param1 == 402) {
                              break L3;
                            } else {
                              L4: {
                                if (8222 == param1) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (param1 == 8230) {
                                      break L5;
                                    } else {
                                      L6: {
                                        if (param1 != 8224) {
                                          break L6;
                                        } else {
                                          var2 = -122;
                                          if (var3 == 0) {
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      L7: {
                                        if (8225 == param1) {
                                          break L7;
                                        } else {
                                          L8: {
                                            if (710 != param1) {
                                              break L8;
                                            } else {
                                              var2 = -120;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          L9: {
                                            if (param1 == 8240) {
                                              break L9;
                                            } else {
                                              L10: {
                                                if (param1 == 352) {
                                                  break L10;
                                                } else {
                                                  L11: {
                                                    if (param1 == 8249) {
                                                      break L11;
                                                    } else {
                                                      L12: {
                                                        if (param1 == 338) {
                                                          break L12;
                                                        } else {
                                                          L13: {
                                                            if (param1 != 381) {
                                                              break L13;
                                                            } else {
                                                              var2 = -114;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                          }
                                                          L14: {
                                                            if (8216 != param1) {
                                                              break L14;
                                                            } else {
                                                              var2 = -111;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                          }
                                                          L15: {
                                                            if (param1 == 8217) {
                                                              break L15;
                                                            } else {
                                                              L16: {
                                                                if (param1 != 8220) {
                                                                  break L16;
                                                                } else {
                                                                  var2 = -109;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L16;
                                                                  }
                                                                }
                                                              }
                                                              L17: {
                                                                if (8221 != param1) {
                                                                  break L17;
                                                                } else {
                                                                  var2 = -108;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L17;
                                                                  }
                                                                }
                                                              }
                                                              L18: {
                                                                if (param1 == 8226) {
                                                                  break L18;
                                                                } else {
                                                                  L19: {
                                                                    if (8211 != param1) {
                                                                      break L19;
                                                                    } else {
                                                                      var2 = -106;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L19;
                                                                      }
                                                                    }
                                                                  }
                                                                  L20: {
                                                                    if (8212 != param1) {
                                                                      break L20;
                                                                    } else {
                                                                      var2 = -105;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L20;
                                                                      }
                                                                    }
                                                                  }
                                                                  L21: {
                                                                    if (param1 != 732) {
                                                                      break L21;
                                                                    } else {
                                                                      var2 = -104;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L21;
                                                                      }
                                                                    }
                                                                  }
                                                                  L22: {
                                                                    if (param1 != 8482) {
                                                                      break L22;
                                                                    } else {
                                                                      var2 = -103;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L22;
                                                                      }
                                                                    }
                                                                  }
                                                                  L23: {
                                                                    if (param1 == 353) {
                                                                      break L23;
                                                                    } else {
                                                                      L24: {
                                                                        if (8250 == param1) {
                                                                          break L24;
                                                                        } else {
                                                                          L25: {
                                                                            if (339 != param1) {
                                                                              break L25;
                                                                            } else {
                                                                              var2 = -100;
                                                                              if (var3 == 0) {
                                                                                break L0;
                                                                              } else {
                                                                                break L25;
                                                                              }
                                                                            }
                                                                          }
                                                                          L26: {
                                                                            if (param1 != 382) {
                                                                              break L26;
                                                                            } else {
                                                                              var2 = -98;
                                                                              if (var3 == 0) {
                                                                                break L0;
                                                                              } else {
                                                                                break L26;
                                                                              }
                                                                            }
                                                                          }
                                                                          L27: {
                                                                            if (param1 != 376) {
                                                                              break L27;
                                                                            } else {
                                                                              var2 = -97;
                                                                              if (var3 == 0) {
                                                                                break L0;
                                                                              } else {
                                                                                break L27;
                                                                              }
                                                                            }
                                                                          }
                                                                          var2 = 63;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L24;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -101;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -102;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L18;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -107;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L15;
                                                              }
                                                            }
                                                          }
                                                          var2 = -110;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L12;
                                                          }
                                                        }
                                                      }
                                                      var2 = -116;
                                                      if (var3 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L11;
                                                      }
                                                    }
                                                  }
                                                  var2 = -117;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                              var2 = -118;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          var2 = -119;
                                          if (var3 == 0) {
                                            break L0;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      var2 = -121;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var2 = -124;
                              if (var3 == 0) {
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var2 = -125;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var2 = -126;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    var2 = (byte)param1;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L28: {
                L29: {
                  if (8364 == param1) {
                    break L29;
                  } else {
                    L30: {
                      if (param1 == 8218) {
                        break L30;
                      } else {
                        L31: {
                          if (param1 == 402) {
                            break L31;
                          } else {
                            L32: {
                              if (8222 == param1) {
                                break L32;
                              } else {
                                L33: {
                                  if (param1 == 8230) {
                                    break L33;
                                  } else {
                                    L34: {
                                      if (param1 != 8224) {
                                        break L34;
                                      } else {
                                        var2 = -122;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                    L35: {
                                      if (8225 == param1) {
                                        break L35;
                                      } else {
                                        L36: {
                                          if (710 != param1) {
                                            break L36;
                                          } else {
                                            var2 = -120;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                        L37: {
                                          if (param1 == 8240) {
                                            break L37;
                                          } else {
                                            L38: {
                                              if (param1 == 352) {
                                                break L38;
                                              } else {
                                                L39: {
                                                  if (param1 == 8249) {
                                                    break L39;
                                                  } else {
                                                    L40: {
                                                      if (param1 == 338) {
                                                        break L40;
                                                      } else {
                                                        L41: {
                                                          if (param1 != 381) {
                                                            break L41;
                                                          } else {
                                                            var2 = -114;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L41;
                                                            }
                                                          }
                                                        }
                                                        L42: {
                                                          if (8216 != param1) {
                                                            break L42;
                                                          } else {
                                                            var2 = -111;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                        }
                                                        L43: {
                                                          if (param1 == 8217) {
                                                            break L43;
                                                          } else {
                                                            L44: {
                                                              if (param1 != 8220) {
                                                                break L44;
                                                              } else {
                                                                var2 = -109;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L44;
                                                                }
                                                              }
                                                            }
                                                            L45: {
                                                              if (8221 != param1) {
                                                                break L45;
                                                              } else {
                                                                var2 = -108;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L45;
                                                                }
                                                              }
                                                            }
                                                            L46: {
                                                              if (param1 == 8226) {
                                                                break L46;
                                                              } else {
                                                                L47: {
                                                                  if (8211 != param1) {
                                                                    break L47;
                                                                  } else {
                                                                    var2 = -106;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L47;
                                                                    }
                                                                  }
                                                                }
                                                                L48: {
                                                                  if (8212 != param1) {
                                                                    break L48;
                                                                  } else {
                                                                    var2 = -105;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L48;
                                                                    }
                                                                  }
                                                                }
                                                                L49: {
                                                                  if (param1 != 732) {
                                                                    break L49;
                                                                  } else {
                                                                    var2 = -104;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L49;
                                                                    }
                                                                  }
                                                                }
                                                                L50: {
                                                                  if (param1 != 8482) {
                                                                    break L50;
                                                                  } else {
                                                                    var2 = -103;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L50;
                                                                    }
                                                                  }
                                                                }
                                                                L51: {
                                                                  if (param1 == 353) {
                                                                    break L51;
                                                                  } else {
                                                                    L52: {
                                                                      if (8250 == param1) {
                                                                        break L52;
                                                                      } else {
                                                                        L53: {
                                                                          if (339 != param1) {
                                                                            break L53;
                                                                          } else {
                                                                            var2 = -100;
                                                                            if (var3 == 0) {
                                                                              break L28;
                                                                            } else {
                                                                              break L53;
                                                                            }
                                                                          }
                                                                        }
                                                                        L54: {
                                                                          if (param1 != 382) {
                                                                            break L54;
                                                                          } else {
                                                                            var2 = -98;
                                                                            if (var3 == 0) {
                                                                              break L28;
                                                                            } else {
                                                                              break L54;
                                                                            }
                                                                          }
                                                                        }
                                                                        L55: {
                                                                          if (param1 != 376) {
                                                                            break L55;
                                                                          } else {
                                                                            var2 = -97;
                                                                            if (var3 == 0) {
                                                                              break L28;
                                                                            } else {
                                                                              break L55;
                                                                            }
                                                                          }
                                                                        }
                                                                        var2 = 63;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L52;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -101;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L51;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -102;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L46;
                                                                }
                                                              }
                                                            }
                                                            var2 = -107;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L43;
                                                            }
                                                          }
                                                        }
                                                        var2 = -110;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    var2 = -116;
                                                    if (var3 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                }
                                                var2 = -117;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            var2 = -118;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        var2 = -119;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var2 = -121;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                var2 = -123;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var2 = -124;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L31;
                            }
                          }
                        }
                        var2 = -125;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var2 = -126;
                    if (var3 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var2 = -128;
                if (var3 == 0) {
                  break L28;
                } else {
                  var2 = (byte)param1;
                  break L28;
                }
              }
              return (byte) var2;
            }
          } else {
            if (param1 < 128) {
              var2 = (byte)param1;
              return (byte) var2;
            } else {
              L56: {
                L57: {
                  L58: {
                    if (param1 < 160) {
                      break L58;
                    } else {
                      if (param1 <= 255) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  L59: {
                    if (8364 == param1) {
                      break L59;
                    } else {
                      L60: {
                        if (param1 == 8218) {
                          break L60;
                        } else {
                          L61: {
                            if (param1 == 402) {
                              break L61;
                            } else {
                              L62: {
                                if (8222 == param1) {
                                  break L62;
                                } else {
                                  L63: {
                                    if (param1 == 8230) {
                                      break L63;
                                    } else {
                                      L64: {
                                        if (param1 != 8224) {
                                          break L64;
                                        } else {
                                          var2 = -122;
                                          if (var3 == 0) {
                                            break L56;
                                          } else {
                                            break L64;
                                          }
                                        }
                                      }
                                      L65: {
                                        if (8225 == param1) {
                                          break L65;
                                        } else {
                                          L66: {
                                            if (710 != param1) {
                                              break L66;
                                            } else {
                                              var2 = -120;
                                              break L66;
                                            }
                                          }
                                          L67: {
                                            if (param1 == 8240) {
                                              break L67;
                                            } else {
                                              L68: {
                                                if (param1 == 352) {
                                                  break L68;
                                                } else {
                                                  L69: {
                                                    if (param1 == 8249) {
                                                      break L69;
                                                    } else {
                                                      L70: {
                                                        if (param1 == 338) {
                                                          break L70;
                                                        } else {
                                                          L71: {
                                                            if (param1 != 381) {
                                                              break L71;
                                                            } else {
                                                              var2 = -114;
                                                              break L71;
                                                            }
                                                          }
                                                          L72: {
                                                            if (8216 != param1) {
                                                              break L72;
                                                            } else {
                                                              var2 = -111;
                                                              break L72;
                                                            }
                                                          }
                                                          L73: {
                                                            if (param1 == 8217) {
                                                              break L73;
                                                            } else {
                                                              L74: {
                                                                if (param1 != 8220) {
                                                                  break L74;
                                                                } else {
                                                                  var2 = -109;
                                                                  break L74;
                                                                }
                                                              }
                                                              L75: {
                                                                if (8221 != param1) {
                                                                  break L75;
                                                                } else {
                                                                  var2 = -108;
                                                                  break L75;
                                                                }
                                                              }
                                                              L76: {
                                                                if (param1 == 8226) {
                                                                  break L76;
                                                                } else {
                                                                  L77: {
                                                                    if (8211 != param1) {
                                                                      break L77;
                                                                    } else {
                                                                      var2 = -106;
                                                                      break L77;
                                                                    }
                                                                  }
                                                                  L78: {
                                                                    if (8212 != param1) {
                                                                      break L78;
                                                                    } else {
                                                                      var2 = -105;
                                                                      break L78;
                                                                    }
                                                                  }
                                                                  L79: {
                                                                    if (param1 != 732) {
                                                                      break L79;
                                                                    } else {
                                                                      var2 = -104;
                                                                      break L79;
                                                                    }
                                                                  }
                                                                  L80: {
                                                                    if (param1 != 8482) {
                                                                      break L80;
                                                                    } else {
                                                                      var2 = -103;
                                                                      break L80;
                                                                    }
                                                                  }
                                                                  L81: {
                                                                    if (param1 == 353) {
                                                                      break L81;
                                                                    } else {
                                                                      L82: {
                                                                        if (8250 == param1) {
                                                                          break L82;
                                                                        } else {
                                                                          L83: {
                                                                            if (339 != param1) {
                                                                              break L83;
                                                                            } else {
                                                                              var2 = -100;
                                                                              break L83;
                                                                            }
                                                                          }
                                                                          L84: {
                                                                            if (param1 != 382) {
                                                                              break L84;
                                                                            } else {
                                                                              var2 = -98;
                                                                              break L84;
                                                                            }
                                                                          }
                                                                          L85: {
                                                                            if (param1 != 376) {
                                                                              break L85;
                                                                            } else {
                                                                              var2 = -97;
                                                                              break L85;
                                                                            }
                                                                          }
                                                                          var2 = 63;
                                                                          break L82;
                                                                        }
                                                                      }
                                                                      var2 = -101;
                                                                      break L81;
                                                                    }
                                                                  }
                                                                  var2 = -102;
                                                                  break L76;
                                                                }
                                                              }
                                                              var2 = -107;
                                                              break L73;
                                                            }
                                                          }
                                                          var2 = -110;
                                                          break L70;
                                                        }
                                                      }
                                                      var2 = -116;
                                                      break L69;
                                                    }
                                                  }
                                                  var2 = -117;
                                                  break L68;
                                                }
                                              }
                                              var2 = -118;
                                              break L67;
                                            }
                                          }
                                          var2 = -119;
                                          break L65;
                                        }
                                      }
                                      var2 = -121;
                                      break L63;
                                    }
                                  }
                                  var2 = -123;
                                  break L62;
                                }
                              }
                              var2 = -124;
                              break L61;
                            }
                          }
                          var2 = -125;
                          break L60;
                        }
                      }
                      var2 = -126;
                      break L59;
                    }
                  }
                  var2 = -128;
                  break L57;
                }
                var2 = (byte)param1;
                break L56;
              }
              return (byte) var2;
            }
          }
        } else {
          return (byte) -88;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = Math.atan2(1.0, 0.0);
    }
}
