/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class spa implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = 56 / ((-64 - param0) / 50);
        return (tv) (Object) new mua();
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (32 < kt.field_l) {
          L0: {
            var1 = kt.field_l % 32;
            if (var1 != 0) {
              break L0;
            } else {
              var1 = 32;
              break L0;
            }
          }
          nl.a(-var1 + kt.field_l, -13205);
          return;
        } else {
          nl.a(0, -13205);
          return;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = -87;
            return (tv[]) (Object) new mua[param1];
        }
        return (tv[]) (Object) new mua[param1];
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        String var15 = null;
        sg var16 = null;
        lta var18 = null;
        String var19 = null;
        sg var20 = null;
        lta var22 = null;
        String var23 = null;
        sg var24 = null;
        lta var26 = null;
        String var27 = null;
        sg var28 = null;
        lta var30 = null;
        sg var31 = null;
        lta var33 = null;
        sg var34 = null;
        lta var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        if (ck.b(false)) {
          var2 = 1;
          var15 = km.field_s;
          var4 = 0;
          if (vqa.field_g != null) {
            if (!vqa.field_g.field_N) {
              var4 = 1;
              ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
              var5 = kma.a(var2, 0, 200, var15);
              var34 = ae.a(wba.field_o, (byte) 41);
              var36 = new lta();
              var36.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
              var36.field_d = ip.field_p.width >> 1;
              var42 = var34.f((byte) -92);
              var9 = -var42[0] + var42[1];
              var10 = var42[3] - var42[2];
              var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
              var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
              var36.field_a = Math.min(var11, var12);
              var36.field_c = (float)((var42[0] - -var42[1]) / 2);
              var36.field_b = (float)((var42[3] + var42[2]) / 2);
              var34.a(kdb.field_o * 10 % 8192, -82);
              if (vqa.field_g != null) {
                if (!vqa.field_g.field_N) {
                  if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                    L0: {
                      var34.a(false, true, (pe) null);
                      var34.a(var36, 121, (pe) null);
                      if (0 != sab.field_o) {
                        break L0;
                      } else {
                        if (si.field_o[83]) {
                          break L0;
                        } else {
                          if (si.field_o[84]) {
                            break L0;
                          } else {
                            if (!si.field_o[13]) {
                              if (param0 == 0) {
                                return;
                              } else {
                                spa.a(45, false);
                                return;
                              }
                            } else {
                              if (var4 != 0) {
                                L1: {
                                  mgb.field_o = true;
                                  if (param0 == 0) {
                                    break L1;
                                  } else {
                                    spa.a(45, false);
                                    break L1;
                                  }
                                }
                                return;
                              } else {
                                wba.field_o = null;
                                mgb.field_o = true;
                                if (param0 == 0) {
                                  return;
                                } else {
                                  spa.a(45, false);
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      mgb.field_o = true;
                      if (param0 == 0) {
                        return;
                      } else {
                        spa.a(45, false);
                        return;
                      }
                    } else {
                      wba.field_o = null;
                      mgb.field_o = true;
                      if (param0 == 0) {
                        return;
                      } else {
                        spa.a(45, false);
                        return;
                      }
                    }
                  } else {
                    L2: {
                      L3: {
                        var34.h(17704, 1);
                        var34.a(false, true, (pe) null);
                        var34.a(var36, 121, (pe) null);
                        if (0 != sab.field_o) {
                          break L3;
                        } else {
                          if (si.field_o[83]) {
                            break L3;
                          } else {
                            if (si.field_o[84]) {
                              break L3;
                            } else {
                              if (!si.field_o[13]) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        mgb.field_o = true;
                        break L2;
                      } else {
                        wba.field_o = null;
                        mgb.field_o = true;
                        break L2;
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
                  L4: {
                    var34.a(false, true, (pe) null);
                    var34.a(var36, 121, (pe) null);
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
                            if (param0 == 0) {
                              return;
                            } else {
                              spa.a(45, false);
                              return;
                            }
                          } else {
                            if (var4 != 0) {
                              L5: {
                                mgb.field_o = true;
                                if (param0 == 0) {
                                  break L5;
                                } else {
                                  spa.a(45, false);
                                  break L5;
                                }
                              }
                              return;
                            } else {
                              wba.field_o = null;
                              mgb.field_o = true;
                              if (param0 == 0) {
                                return;
                              } else {
                                spa.a(45, false);
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    mgb.field_o = true;
                    if (param0 == 0) {
                      return;
                    } else {
                      spa.a(45, false);
                      return;
                    }
                  } else {
                    wba.field_o = null;
                    mgb.field_o = true;
                    if (param0 == 0) {
                      return;
                    } else {
                      spa.a(45, false);
                      return;
                    }
                  }
                }
              } else {
                L6: {
                  var34.a(false, true, (pe) null);
                  var34.a(var36, 121, (pe) null);
                  if (0 != sab.field_o) {
                    break L6;
                  } else {
                    if (si.field_o[83]) {
                      break L6;
                    } else {
                      if (si.field_o[84]) {
                        break L6;
                      } else {
                        if (!si.field_o[13]) {
                          if (param0 == 0) {
                            return;
                          } else {
                            spa.a(45, false);
                            return;
                          }
                        } else {
                          if (var4 != 0) {
                            L7: {
                              mgb.field_o = true;
                              if (param0 == 0) {
                                break L7;
                              } else {
                                spa.a(45, false);
                                break L7;
                              }
                            }
                            return;
                          } else {
                            wba.field_o = null;
                            mgb.field_o = true;
                            if (param0 == 0) {
                              return;
                            } else {
                              spa.a(45, false);
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  mgb.field_o = true;
                  if (param0 == 0) {
                    return;
                  } else {
                    spa.a(45, false);
                    return;
                  }
                } else {
                  wba.field_o = null;
                  mgb.field_o = true;
                  if (param0 == 0) {
                    return;
                  } else {
                    spa.a(45, false);
                    return;
                  }
                }
              }
            } else {
              if (oab.field_o == 0) {
                if (0 != wgb.field_f) {
                  L8: {
                    var27 = cf.field_a;
                    ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                    var5 = kma.a(var2, 0, 200, var27);
                    var28 = ae.a(wba.field_o, (byte) 41);
                    var30 = new lta();
                    var30.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
                    var30.field_d = ip.field_p.width >> 1;
                    var40 = var28.f((byte) -92);
                    var9 = -var40[0] + var40[1];
                    var10 = var40[3] - var40[2];
                    var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
                    var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
                    var30.field_a = Math.min(var11, var12);
                    var30.field_c = (float)((var40[0] - -var40[1]) / 2);
                    var30.field_b = (float)((var40[3] + var40[2]) / 2);
                    var28.a(kdb.field_o * 10 % 8192, -82);
                    if (vqa.field_g == null) {
                      break L8;
                    } else {
                      if (vqa.field_g.field_N) {
                        break L8;
                      } else {
                        if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var28.h(17704, 1);
                              var28.a(false, true, (pe) null);
                              var28.a(var30, 121, (pe) null);
                              if (0 != sab.field_o) {
                                break L10;
                              } else {
                                if (si.field_o[83]) {
                                  break L10;
                                } else {
                                  if (si.field_o[84]) {
                                    break L10;
                                  } else {
                                    if (!si.field_o[13]) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            if (var4 != 0) {
                              mgb.field_o = true;
                              break L9;
                            } else {
                              wba.field_o = null;
                              mgb.field_o = true;
                              break L9;
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
                    }
                  }
                  L11: {
                    var28.a(false, true, (pe) null);
                    var28.a(var30, 121, (pe) null);
                    if (0 != sab.field_o) {
                      break L11;
                    } else {
                      if (si.field_o[83]) {
                        break L11;
                      } else {
                        if (si.field_o[84]) {
                          break L11;
                        } else {
                          if (!si.field_o[13]) {
                            if (param0 == 0) {
                              return;
                            } else {
                              spa.a(45, false);
                              return;
                            }
                          } else {
                            if (var4 != 0) {
                              L12: {
                                mgb.field_o = true;
                                if (param0 == 0) {
                                  break L12;
                                } else {
                                  spa.a(45, false);
                                  break L12;
                                }
                              }
                              return;
                            } else {
                              wba.field_o = null;
                              L13: {
                                mgb.field_o = true;
                                if (param0 == 0) {
                                  break L13;
                                } else {
                                  spa.a(45, false);
                                  break L13;
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
                    mgb.field_o = true;
                    if (param0 == 0) {
                      return;
                    } else {
                      spa.a(45, false);
                      return;
                    }
                  } else {
                    wba.field_o = null;
                    mgb.field_o = true;
                    if (param0 == 0) {
                      return;
                    } else {
                      spa.a(45, false);
                      return;
                    }
                  }
                } else {
                  L14: {
                    var4 = 1;
                    ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                    var5 = kma.a(var2, 0, 200, var15);
                    var31 = ae.a(wba.field_o, (byte) 41);
                    var33 = new lta();
                    var33.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
                    var33.field_d = ip.field_p.width >> 1;
                    var41 = var31.f((byte) -92);
                    var9 = -var41[0] + var41[1];
                    var10 = var41[3] - var41[2];
                    var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
                    var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
                    var33.field_a = Math.min(var11, var12);
                    var33.field_c = (float)((var41[0] - -var41[1]) / 2);
                    var33.field_b = (float)((var41[3] + var41[2]) / 2);
                    var31.a(kdb.field_o * 10 % 8192, -82);
                    if (vqa.field_g == null) {
                      break L14;
                    } else {
                      if (vqa.field_g.field_N) {
                        break L14;
                      } else {
                        if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                          break L14;
                        } else {
                          var31.h(17704, 1);
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    L16: {
                      var31.a(false, true, (pe) null);
                      var31.a(var33, 121, (pe) null);
                      if (0 != sab.field_o) {
                        break L16;
                      } else {
                        if (si.field_o[83]) {
                          break L16;
                        } else {
                          if (si.field_o[84]) {
                            break L16;
                          } else {
                            if (!si.field_o[13]) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      mgb.field_o = true;
                      break L15;
                    } else {
                      wba.field_o = null;
                      mgb.field_o = true;
                      break L15;
                    }
                  }
                  L17: {
                    if (param0 == 0) {
                      break L17;
                    } else {
                      spa.a(45, false);
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  var23 = cf.field_a;
                  ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                  var5 = kma.a(var2, 0, 200, var23);
                  var24 = ae.a(wba.field_o, (byte) 41);
                  var26 = new lta();
                  var26.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
                  var26.field_d = ip.field_p.width >> 1;
                  var39 = var24.f((byte) -92);
                  var9 = -var39[0] + var39[1];
                  var10 = var39[3] - var39[2];
                  var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
                  var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
                  var26.field_a = Math.min(var11, var12);
                  var26.field_c = (float)((var39[0] - -var39[1]) / 2);
                  var26.field_b = (float)((var39[3] + var39[2]) / 2);
                  var24.a(kdb.field_o * 10 % 8192, -82);
                  if (vqa.field_g == null) {
                    break L18;
                  } else {
                    if (vqa.field_g.field_N) {
                      break L18;
                    } else {
                      if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                        break L18;
                      } else {
                        L19: {
                          L20: {
                            var24.h(17704, 1);
                            var24.a(false, true, (pe) null);
                            var24.a(var26, 121, (pe) null);
                            if (0 != sab.field_o) {
                              break L20;
                            } else {
                              if (si.field_o[83]) {
                                break L20;
                              } else {
                                if (si.field_o[84]) {
                                  break L20;
                                } else {
                                  if (!si.field_o[13]) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                          if (var4 != 0) {
                            mgb.field_o = true;
                            break L19;
                          } else {
                            wba.field_o = null;
                            mgb.field_o = true;
                            break L19;
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
                  }
                }
                L21: {
                  var24.a(false, true, (pe) null);
                  var24.a(var26, 121, (pe) null);
                  if (0 != sab.field_o) {
                    break L21;
                  } else {
                    if (si.field_o[83]) {
                      break L21;
                    } else {
                      if (si.field_o[84]) {
                        break L21;
                      } else {
                        if (!si.field_o[13]) {
                          if (param0 != 0) {
                            spa.a(45, false);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (var4 != 0) {
                            L22: {
                              mgb.field_o = true;
                              if (param0 == 0) {
                                break L22;
                              } else {
                                spa.a(45, false);
                                break L22;
                              }
                            }
                            return;
                          } else {
                            wba.field_o = null;
                            L23: {
                              mgb.field_o = true;
                              if (param0 == 0) {
                                break L23;
                              } else {
                                spa.a(45, false);
                                break L23;
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
                  mgb.field_o = true;
                  if (param0 != 0) {
                    spa.a(45, false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  wba.field_o = null;
                  mgb.field_o = true;
                  if (param0 != 0) {
                    spa.a(45, false);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            L24: {
              if (oab.field_o != 0) {
                break L24;
              } else {
                if (0 != wgb.field_f) {
                  break L24;
                } else {
                  L25: {
                    var4 = 1;
                    ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
                    var5 = kma.a(var2, 0, 200, var15);
                    var16 = ae.a(wba.field_o, (byte) 41);
                    var18 = new lta();
                    var18.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
                    var18.field_d = ip.field_p.width >> 1;
                    var37 = var16.f((byte) -92);
                    var9 = -var37[0] + var37[1];
                    var10 = var37[3] - var37[2];
                    var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
                    var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
                    var18.field_a = Math.min(var11, var12);
                    var18.field_c = (float)((var37[0] - -var37[1]) / 2);
                    var18.field_b = (float)((var37[3] + var37[2]) / 2);
                    var16.a(kdb.field_o * 10 % 8192, -82);
                    if (vqa.field_g == null) {
                      break L25;
                    } else {
                      if (vqa.field_g.field_N) {
                        break L25;
                      } else {
                        if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                          break L25;
                        } else {
                          var16.h(17704, 1);
                          break L25;
                        }
                      }
                    }
                  }
                  L26: {
                    L27: {
                      var16.a(false, true, (pe) null);
                      var16.a(var18, 121, (pe) null);
                      if (0 != sab.field_o) {
                        break L27;
                      } else {
                        if (si.field_o[83]) {
                          break L27;
                        } else {
                          if (si.field_o[84]) {
                            break L27;
                          } else {
                            if (!si.field_o[13]) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      mgb.field_o = true;
                      break L26;
                    } else {
                      wba.field_o = null;
                      mgb.field_o = true;
                      break L26;
                    }
                  }
                  L28: {
                    if (param0 == 0) {
                      break L28;
                    } else {
                      spa.a(45, false);
                      break L28;
                    }
                  }
                  return;
                }
              }
            }
            L29: {
              var19 = cf.field_a;
              ga.a(200, false, 0, 0, ip.field_p.height, ip.field_p.width, 1);
              var5 = kma.a(var2, 0, 200, var19);
              var20 = ae.a(wba.field_o, (byte) 41);
              var22 = new lta();
              var22.field_e = (ip.field_p.height >> 1) - (-(var5 >> 1) - ((ip.field_p.height >> 1) - (var5 >> 1) >> 1));
              var22.field_d = ip.field_p.width >> 1;
              var38 = var20.f((byte) -92);
              var9 = -var38[0] + var38[1];
              var10 = var38[3] - var38[2];
              var11 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
              var12 = (-32.0f + (float)((ip.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
              var22.field_a = Math.min(var11, var12);
              var22.field_c = (float)((var38[0] - -var38[1]) / 2);
              var22.field_b = (float)((var38[3] + var38[2]) / 2);
              var20.a(kdb.field_o * 10 % 8192, -82);
              if (vqa.field_g == null) {
                break L29;
              } else {
                if (vqa.field_g.field_N) {
                  break L29;
                } else {
                  if (vqa.field_g.field_m.b(param0 + 1).field_g.d(vqa.field_g.field_L, 76) == null) {
                    break L29;
                  } else {
                    L30: {
                      L31: {
                        var20.h(17704, 1);
                        var20.a(false, true, (pe) null);
                        var20.a(var22, 121, (pe) null);
                        if (0 != sab.field_o) {
                          break L31;
                        } else {
                          if (si.field_o[83]) {
                            break L31;
                          } else {
                            if (si.field_o[84]) {
                              break L31;
                            } else {
                              if (!si.field_o[13]) {
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        mgb.field_o = true;
                        break L30;
                      } else {
                        wba.field_o = null;
                        mgb.field_o = true;
                        break L30;
                      }
                    }
                    L32: {
                      if (param0 == 0) {
                        break L32;
                      } else {
                        spa.a(45, false);
                        break L32;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L33: {
              var20.a(false, true, (pe) null);
              var20.a(var22, 121, (pe) null);
              if (0 != sab.field_o) {
                break L33;
              } else {
                if (si.field_o[83]) {
                  break L33;
                } else {
                  if (si.field_o[84]) {
                    break L33;
                  } else {
                    if (!si.field_o[13]) {
                      if (param0 != 0) {
                        spa.a(45, false);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L34: {
                        if (var4 != 0) {
                          mgb.field_o = true;
                          break L34;
                        } else {
                          wba.field_o = null;
                          mgb.field_o = true;
                          break L34;
                        }
                      }
                      L35: {
                        if (param0 == 0) {
                          break L35;
                        } else {
                          spa.a(45, false);
                          break L35;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
            if (var4 != 0) {
              L36: {
                mgb.field_o = true;
                if (param0 == 0) {
                  break L36;
                } else {
                  spa.a(45, false);
                  break L36;
                }
              }
              return;
            } else {
              wba.field_o = null;
              L37: {
                mgb.field_o = true;
                if (param0 == 0) {
                  break L37;
                } else {
                  spa.a(45, false);
                  break L37;
                }
              }
              return;
            }
          }
        } else {
          if (param0 != 0) {
            spa.a(45, false);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 50;
    }
}
