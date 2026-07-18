/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends o {
    static String field_o;
    static String field_m;
    static String field_l;
    static ci field_j;
    static int field_n;
    static int[][] field_k;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) bj.field_cb);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) bj.field_cb);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) bj.field_cb);
            nd.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "uj.C(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Chess.field_G;
        if (param1 < 15) {
          L0: {
            char discarded$1 = uj.a('w', (byte) 121);
            var2 = param0;
            if (var2 != 32) {
              if (var2 != 160) {
                if (var2 != 95) {
                  if (var2 != 45) {
                    L1: {
                      if (var2 == 91) {
                        break L1;
                      } else {
                        if (93 != var2) {
                          if (35 != var2) {
                            L2: {
                              if (224 == var2) {
                                break L2;
                              } else {
                                if (var2 == 225) {
                                  break L2;
                                } else {
                                  if (var2 == 226) {
                                    break L2;
                                  } else {
                                    if (var2 != 228) {
                                      if (var2 == 227) {
                                        break L2;
                                      } else {
                                        if (192 == var2) {
                                          break L2;
                                        } else {
                                          if (var2 != 193) {
                                            if (194 != var2) {
                                              if (196 == var2) {
                                                break L2;
                                              } else {
                                                if (var2 != 195) {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (234 != var2) {
                                                          if (235 == var2) {
                                                            break L3;
                                                          } else {
                                                            if (var2 != 200) {
                                                              if (var2 == 201) {
                                                                break L3;
                                                              } else {
                                                                if (202 != var2) {
                                                                  if (203 == var2) {
                                                                    break L3;
                                                                  } else {
                                                                    L4: {
                                                                      if (237 == var2) {
                                                                        break L4;
                                                                      } else {
                                                                        if (var2 != 238) {
                                                                          if (239 != var2) {
                                                                            if (var2 != 205) {
                                                                              if (206 != var2) {
                                                                                if (var2 != 207) {
                                                                                  if (var2 != 242) {
                                                                                    L5: {
                                                                                      if (var2 == 243) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (var2 != 244) {
                                                                                          if (var2 != 246) {
                                                                                            if (var2 == 245) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (var2 == 211) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (var2 != 212) {
                                                                                                    if (var2 == 214) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (var2 != 213) {
                                                                                                        L6: {
                                                                                                          if (249 == var2) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (var2 == 250) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (var2 != 251) {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (var2 != 217) {
                                                                                                                    if (218 != var2) {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (var2 != 220) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (255 == var2) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  L7: {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      break L7;
                                                                                                                                    } else {
                                                                                                                                      if (var2 == 209) {
                                                                                                                                        break L7;
                                                                                                                                      } else {
                                                                                                                                        if (var2 != 223) {
                                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'u';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      } else {
                                                                                                        return 'o';
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'o';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    return 'o';
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'i';
                                                                                }
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        } else {
                                                                          break L4;
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return param0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                return '_';
              }
            } else {
              break L0;
            }
          }
          return '_';
        } else {
          L8: {
            var2 = param0;
            if (var2 != 32) {
              if (var2 != 160) {
                if (var2 != 95) {
                  if (var2 != 45) {
                    if (var2 != 91) {
                      L9: {
                        if (93 != var2) {
                          if (35 != var2) {
                            if (224 != var2) {
                              if (var2 != 225) {
                                L10: {
                                  if (var2 == 226) {
                                    break L10;
                                  } else {
                                    if (var2 != 228) {
                                      if (var2 == 227) {
                                        break L10;
                                      } else {
                                        if (192 == var2) {
                                          break L10;
                                        } else {
                                          if (var2 != 193) {
                                            if (194 != var2) {
                                              if (196 == var2) {
                                                break L10;
                                              } else {
                                                if (var2 != 195) {
                                                  L11: {
                                                    if (232 == var2) {
                                                      break L11;
                                                    } else {
                                                      if (var2 == 233) {
                                                        break L11;
                                                      } else {
                                                        if (234 != var2) {
                                                          if (235 == var2) {
                                                            break L11;
                                                          } else {
                                                            if (var2 != 200) {
                                                              if (var2 == 201) {
                                                                break L11;
                                                              } else {
                                                                if (202 != var2) {
                                                                  if (203 == var2) {
                                                                    break L11;
                                                                  } else {
                                                                    L12: {
                                                                      if (237 == var2) {
                                                                        break L12;
                                                                      } else {
                                                                        if (var2 != 238) {
                                                                          if (239 != var2) {
                                                                            if (var2 != 205) {
                                                                              if (206 != var2) {
                                                                                if (var2 != 207) {
                                                                                  L13: {
                                                                                    if (var2 != 242) {
                                                                                      if (var2 == 243) {
                                                                                        break L13;
                                                                                      } else {
                                                                                        if (var2 != 244) {
                                                                                          if (var2 != 246) {
                                                                                            if (var2 == 245) {
                                                                                              break L13;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L13;
                                                                                              } else {
                                                                                                if (var2 == 211) {
                                                                                                  break L13;
                                                                                                } else {
                                                                                                  if (var2 != 212) {
                                                                                                    if (var2 == 214) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      if (var2 != 213) {
                                                                                                        L14: {
                                                                                                          if (249 == var2) {
                                                                                                            break L14;
                                                                                                          } else {
                                                                                                            if (var2 == 250) {
                                                                                                              break L14;
                                                                                                            } else {
                                                                                                              if (var2 != 251) {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (var2 != 217) {
                                                                                                                    if (218 != var2) {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (var2 != 220) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (255 == var2) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  L15: {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      break L15;
                                                                                                                                    } else {
                                                                                                                                      if (var2 == 209) {
                                                                                                                                        break L15;
                                                                                                                                      } else {
                                                                                                                                        if (var2 != 223) {
                                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'u';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L14;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L14;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L14;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      } else {
                                                                                                        break L13;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L13;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L13;
                                                                                          }
                                                                                        } else {
                                                                                          break L13;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                } else {
                                                                                  break L12;
                                                                                }
                                                                              } else {
                                                                                break L12;
                                                                              }
                                                                            } else {
                                                                              break L12;
                                                                            }
                                                                          } else {
                                                                            break L12;
                                                                          }
                                                                        } else {
                                                                          break L12;
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                            } else {
                                                              break L11;
                                                            }
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                return 'a';
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      return param0;
                    } else {
                      return param0;
                    }
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              } else {
                return '_';
              }
            } else {
              break L8;
            }
          }
          return '_';
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        pa var4_ref_pa = null;
        int var4 = 0;
        dc var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        nk var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              var9 = tk.field_h;
              var2 = var9.i(-128);
              var3 = var9.i(-128);
              if (var2 != 0) {
                if (1 != var2) {
                  fg.a((Throwable) null, (byte) -77, "LR1: " + tm.b((byte) -127));
                  si.d(65280);
                  break L1;
                } else {
                  var4 = var9.a(false);
                  var5 = (dc) (Object) fa.field_j.g(-18110);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var5.field_j != var3) {
                            break L4;
                          } else {
                            if (var4 != var5.field_l) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = (dc) (Object) fa.field_j.a((byte) -128);
                        continue L2;
                      }
                    }
                    if (var5 == null) {
                      si.d(65280);
                      return;
                    } else {
                      var5.c(-2193);
                      break L1;
                    }
                  }
                }
              } else {
                var4_ref_pa = (pa) (Object) ve.field_Nb.g(-18110);
                if (var4_ref_pa == null) {
                  si.d(65280);
                  return;
                } else {
                  L5: {
                    var5_int = -var9.field_l + sb.field_sb;
                    var13 = var4_ref_pa.field_q;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5_int > var13.length << 2) {
                      var5_int = var13.length << 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7 = 0;
                  L6: while (true) {
                    if (var5_int <= var7) {
                      var4_ref_pa.c(-2193);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.i(-80) << (ce.a(3, var7) << 8));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "uj.A(" + -243 + ')');
        }
    }

    private uj() throws Throwable {
        throw new Error();
    }

    public static void c(byte param0) {
        field_l = null;
        field_m = null;
        field_j = null;
        field_o = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Quick Chat game";
        field_l = "Average rating";
        field_o = "You have entered another game.";
    }
}
