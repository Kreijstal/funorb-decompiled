/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spa implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = 56 / ((-64 - param0) / 50);
        return (tv) ((Object) new mua());
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (32 >= kt.field_l) {
          nl.a(0, -13205);
          if (param0 == 64) {
            return;
          } else {
            field_a = 29;
            return;
          }
        } else {
          L0: {
            var1 = kt.field_l % 32;
            if (-1 != (var1 ^ -1)) {
              break L0;
            } else {
              var1 = 32;
              break L0;
            }
          }
          nl.a(-var1 + kt.field_l, -13205);
          if (param0 == 64) {
            return;
          } else {
            field_a = 29;
            return;
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = -87;
            return (tv[]) ((Object) new mua[param1]);
        }
        return (tv[]) ((Object) new mua[param1]);
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        String var15 = null;
        sg var16 = null;
        lta var18 = null;
        sg var19 = null;
        lta var21 = null;
        sg var22 = null;
        lta var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        if (ck.b(false)) {
          L0: {
            L1: {
              var2 = 1;
              var3 = km.field_s;
              var15 = var3;
              var3 = var15;
              var15 = var3;
              var3 = var15;
              var4 = 0;
              if (vqa.field_g == null) {
                break L1;
              } else {
                if (!vqa.field_g.field_N) {
                  var4 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (-1 == (oab.field_o ^ -1)) {
              if (0 != wgb.field_f) {
                var3 = cf.field_a;
                break L0;
              } else {
                L2: {
                  var4 = 1;
                  ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                  var5 = kma.a(var2, 0, 200, var3);
                  var19 = ae.a(wba.field_o, (byte) 41);
                  var21 = new lta();
                  var21.field_e = (ip.field_p.height >> -1012681151) - (-(var5 >> -1759423135) - ((ip.field_p.height >> 1982741537) - (var5 >> 1180520417) >> 1255731457));
                  var21.field_d = ip.field_p.width >> -75924511;
                  var26 = var19.f((byte) -92);
                  var9 = -var26[0] + var26[1];
                  var10 = var26[3] - var26[2];
                  var11 = (-32.0f + (float)((ip.field_p.height >> -1123245791) - (var5 >> -1325434239))) / (float)var9;
                  var12 = (-32.0f + (float)((ip.field_p.height >> 1201749153) - (var5 >> -506414719))) / (float)var10;
                  var21.field_a = Math.min(var11, var12);
                  var21.field_c = (float)((var26[0] - -var26[1]) / 2);
                  var21.field_b = (float)((var26[3] + var26[2]) / 2);
                  var19.a(kdb.field_o * 10 % 8192, -82);
                  if (vqa.field_g == null) {
                    break L2;
                  } else {
                    if (vqa.field_g.field_N) {
                      break L2;
                    } else {
                      if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                        break L2;
                      } else {
                        var19.h(17704, 1);
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  L4: {
                    var19.a(false, true, (pe) null);
                    var19.a(var21, 121, (pe) null);
                    if (0 != sab.field_o) {
                      break L4;
                    } else {
                      if (si.field_o[83]) {
                        break L4;
                      } else {
                        if (si.field_o[84]) {
                          break L4;
                        } else {
                          if (!si.field_o[13]) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    mgb.field_o = true;
                    break L3;
                  } else {
                    wba.field_o = null;
                    mgb.field_o = true;
                    break L3;
                  }
                }
                L5: {
                  if (param1) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param0 == 0) {
                    break L6;
                  } else {
                    spa.a(45, false);
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                var15 = cf.field_a;
                var3 = var15;
                ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                var5 = kma.a(var2, 0, 200, var15);
                var16 = ae.a(wba.field_o, (byte) 41);
                var18 = new lta();
                var18.field_e = (ip.field_p.height >> -1012681151) - (-(var5 >> -1759423135) - ((ip.field_p.height >> 1982741537) - (var5 >> 1180520417) >> 1255731457));
                var18.field_d = ip.field_p.width >> -75924511;
                var25 = var16.f((byte) -92);
                var9 = -var25[0] + var25[1];
                var10 = var25[3] - var25[2];
                var11 = (-32.0f + (float)((ip.field_p.height >> -1123245791) - (var5 >> -1325434239))) / (float)var9;
                var12 = (-32.0f + (float)((ip.field_p.height >> 1201749153) - (var5 >> -506414719))) / (float)var10;
                var18.field_a = Math.min(var11, var12);
                var18.field_c = (float)((var25[0] - -var25[1]) / 2);
                var18.field_b = (float)((var25[3] + var25[2]) / 2);
                var16.a(kdb.field_o * 10 % 8192, -82);
                if (vqa.field_g == null) {
                  break L7;
                } else {
                  if (vqa.field_g.field_N) {
                    break L7;
                  } else {
                    if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          var16.h(17704, 1);
                          var16.a(false, true, (pe) null);
                          var16.a(var18, 121, (pe) null);
                          if (0 != sab.field_o) {
                            break L9;
                          } else {
                            if (si.field_o[83]) {
                              break L9;
                            } else {
                              if (si.field_o[84]) {
                                break L9;
                              } else {
                                if (!si.field_o[13]) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        if (var4 != 0) {
                          mgb.field_o = true;
                          break L8;
                        } else {
                          wba.field_o = null;
                          mgb.field_o = true;
                          break L8;
                        }
                      }
                      L10: {
                        if (param1) {
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (param0 == 0) {
                          break L11;
                        } else {
                          spa.a(45, false);
                          break L11;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L12: {
                var16.a(false, true, (pe) null);
                var16.a(var18, 121, (pe) null);
                if (0 != sab.field_o) {
                  break L12;
                } else {
                  if (si.field_o[83]) {
                    break L12;
                  } else {
                    if (si.field_o[84]) {
                      break L12;
                    } else {
                      if (!si.field_o[13]) {
                        L13: {
                          if (param1) {
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        if (param0 != 0) {
                          spa.a(45, false);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L14: {
                          if (var4 != 0) {
                            mgb.field_o = true;
                            break L14;
                          } else {
                            wba.field_o = null;
                            mgb.field_o = true;
                            break L14;
                          }
                        }
                        L15: {
                          if (param1) {
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (param0 == 0) {
                            break L16;
                          } else {
                            spa.a(45, false);
                            break L16;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              if (var4 != 0) {
                L17: {
                  mgb.field_o = true;
                  if (param1) {
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0 == 0) {
                    break L18;
                  } else {
                    spa.a(45, false);
                    break L18;
                  }
                }
                return;
              } else {
                wba.field_o = null;
                L19: {
                  mgb.field_o = true;
                  if (param1) {
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param0 == 0) {
                    break L20;
                  } else {
                    spa.a(45, false);
                    break L20;
                  }
                }
                return;
              }
            }
          }
          ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
          var5 = kma.a(var2, 0, 200, var3);
          var22 = ae.a(wba.field_o, (byte) 41);
          var24 = new lta();
          var24.field_e = (ip.field_p.height >> -1012681151) - (-(var5 >> -1759423135) - ((ip.field_p.height >> 1982741537) - (var5 >> 1180520417) >> 1255731457));
          var24.field_d = ip.field_p.width >> -75924511;
          var27 = var22.f((byte) -92);
          var9 = -var27[0] + var27[1];
          var10 = var27[3] - var27[2];
          var11 = (-32.0f + (float)((ip.field_p.height >> -1123245791) - (var5 >> -1325434239))) / (float)var9;
          var12 = (-32.0f + (float)((ip.field_p.height >> 1201749153) - (var5 >> -506414719))) / (float)var10;
          var24.field_a = Math.min(var11, var12);
          var24.field_c = (float)((var27[0] - -var27[1]) / 2);
          var24.field_b = (float)((var27[3] + var27[2]) / 2);
          var22.a(kdb.field_o * 10 % 8192, -82);
          if (vqa.field_g != null) {
            if (!vqa.field_g.field_N) {
              if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                var22.a(false, true, (pe) null);
                var22.a(var24, 121, (pe) null);
                if (0 == sab.field_o) {
                  if (!si.field_o[83]) {
                    if (si.field_o[84]) {
                      if (var4 != 0) {
                        L21: {
                          mgb.field_o = true;
                          if (param1) {
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (param0 == 0) {
                          return;
                        } else {
                          spa.a(45, false);
                          return;
                        }
                      } else {
                        wba.field_o = null;
                        L22: {
                          mgb.field_o = true;
                          if (param1) {
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (param0 == 0) {
                          return;
                        } else {
                          spa.a(45, false);
                          return;
                        }
                      }
                    } else {
                      if (!si.field_o[13]) {
                        L23: {
                          if (param1) {
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (param0 == 0) {
                          return;
                        } else {
                          spa.a(45, false);
                          return;
                        }
                      } else {
                        if (var4 != 0) {
                          L24: {
                            mgb.field_o = true;
                            if (param1) {
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          L25: {
                            if (param0 == 0) {
                              break L25;
                            } else {
                              spa.a(45, false);
                              break L25;
                            }
                          }
                          return;
                        } else {
                          wba.field_o = null;
                          L26: {
                            mgb.field_o = true;
                            if (param1) {
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          if (param0 == 0) {
                            return;
                          } else {
                            spa.a(45, false);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (var4 != 0) {
                      L27: {
                        mgb.field_o = true;
                        if (param1) {
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      if (param0 == 0) {
                        return;
                      } else {
                        spa.a(45, false);
                        return;
                      }
                    } else {
                      wba.field_o = null;
                      L28: {
                        mgb.field_o = true;
                        if (param1) {
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      if (param0 == 0) {
                        return;
                      } else {
                        spa.a(45, false);
                        return;
                      }
                    }
                  }
                } else {
                  if (var4 != 0) {
                    L29: {
                      mgb.field_o = true;
                      if (param1) {
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    if (param0 == 0) {
                      return;
                    } else {
                      spa.a(45, false);
                      return;
                    }
                  } else {
                    wba.field_o = null;
                    L30: {
                      mgb.field_o = true;
                      if (param1) {
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    if (param0 == 0) {
                      return;
                    } else {
                      spa.a(45, false);
                      return;
                    }
                  }
                }
              } else {
                L31: {
                  L32: {
                    var22.h(17704, 1);
                    var22.a(false, true, (pe) null);
                    var22.a(var24, 121, (pe) null);
                    if (0 != sab.field_o) {
                      break L32;
                    } else {
                      if (si.field_o[83]) {
                        break L32;
                      } else {
                        if (si.field_o[84]) {
                          break L32;
                        } else {
                          if (!si.field_o[13]) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    mgb.field_o = true;
                    break L31;
                  } else {
                    wba.field_o = null;
                    mgb.field_o = true;
                    break L31;
                  }
                }
                L33: {
                  if (param1) {
                    break L33;
                  } else {
                    break L33;
                  }
                }
                if (param0 == 0) {
                  return;
                } else {
                  spa.a(45, false);
                  return;
                }
              }
            } else {
              L34: {
                var22.a(false, true, (pe) null);
                var22.a(var24, 121, (pe) null);
                if (0 != sab.field_o) {
                  break L34;
                } else {
                  if (si.field_o[83]) {
                    break L34;
                  } else {
                    if (si.field_o[84]) {
                      break L34;
                    } else {
                      if (!si.field_o[13]) {
                        L35: {
                          if (param1) {
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        if (param0 != 0) {
                          spa.a(45, false);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (var4 != 0) {
                          L36: {
                            mgb.field_o = true;
                            if (param1) {
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (param0 == 0) {
                              break L37;
                            } else {
                              spa.a(45, false);
                              break L37;
                            }
                          }
                          return;
                        } else {
                          wba.field_o = null;
                          L38: {
                            mgb.field_o = true;
                            if (param1) {
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (param0 == 0) {
                              break L39;
                            } else {
                              spa.a(45, false);
                              break L39;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (var4 != 0) {
                L40: {
                  mgb.field_o = true;
                  if (param1) {
                    break L40;
                  } else {
                    break L40;
                  }
                }
                if (param0 != 0) {
                  spa.a(45, false);
                  return;
                } else {
                  return;
                }
              } else {
                wba.field_o = null;
                L41: {
                  mgb.field_o = true;
                  if (param1) {
                    break L41;
                  } else {
                    break L41;
                  }
                }
                if (param0 != 0) {
                  spa.a(45, false);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L42: {
              var22.a(false, true, (pe) null);
              var22.a(var24, 121, (pe) null);
              if (0 != sab.field_o) {
                break L42;
              } else {
                if (si.field_o[83]) {
                  break L42;
                } else {
                  if (si.field_o[84]) {
                    break L42;
                  } else {
                    if (!si.field_o[13]) {
                      L43: {
                        if (param1) {
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      if (param0 != 0) {
                        spa.a(45, false);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var4 != 0) {
                        L44: {
                          mgb.field_o = true;
                          if (param1) {
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          if (param0 == 0) {
                            break L45;
                          } else {
                            spa.a(45, false);
                            break L45;
                          }
                        }
                        return;
                      } else {
                        wba.field_o = null;
                        L46: {
                          mgb.field_o = true;
                          if (param1) {
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        L47: {
                          if (param0 == 0) {
                            break L47;
                          } else {
                            spa.a(45, false);
                            break L47;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (var4 != 0) {
              L48: {
                mgb.field_o = true;
                if (param1) {
                  break L48;
                } else {
                  break L48;
                }
              }
              if (param0 != 0) {
                spa.a(45, false);
                return;
              } else {
                return;
              }
            } else {
              wba.field_o = null;
              L49: {
                mgb.field_o = true;
                if (param1) {
                  break L49;
                } else {
                  break L49;
                }
              }
              if (param0 != 0) {
                spa.a(45, false);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L50: {
            if (param1) {
              break L50;
            } else {
              break L50;
            }
          }
          if (param0 != 0) {
            spa.a(45, false);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_a = 50;
    }
}
