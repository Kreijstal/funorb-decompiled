/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static mj field_c;
    static String field_d;
    static am field_a;
    static boolean field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 203) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        hk var2 = null;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        re.field_e = param1;
        var2 = (hk) (Object) bd.field_c.a((byte) -117);
        L0: while (true) {
          if (var2 == null) {
            if (param0 != 256) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (!var2.field_h.d(-3548)) {
                var2.c(param0 + -20078);
                break L1;
              } else {
                var2.field_g.g(re.field_e * var2.field_j / 256);
                break L1;
              }
            }
            var2 = (hk) (Object) bd.field_c.d((byte) 63);
            continue L0;
          }
        }
    }

    final static void a(int param0, le[] param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 != null) {
          if (-1 <= (param4 ^ -1)) {
            return;
          } else {
            var5 = param1[0].field_m;
            var6 = param1[2].field_m;
            var7 = param1[1].field_m;
            param1[0].c(param3, param0);
            param1[2].c(param4 + (param3 - var6), param0);
            ge.b(si.field_u);
            ge.c(param3 - -var5, param0, -var6 + param3 - -param4, param0 - -param1[1].field_n);
            var10 = 29 % ((param2 - 22) / 48);
            var8 = param3 + var5;
            var9 = param4 + (param3 + -var6);
            param3 = var8;
            L0: while (true) {
              if (var9 <= param3) {
                ge.a(si.field_u);
                return;
              } else {
                param1[1].c(param3, param0);
                param3 = param3 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static char a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 != -201) {
          var4 = null;
          qb.a(-124, (le[]) null, (byte) -91, -104, 94);
          var2 = param0;
          if (32 != var2) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (95 == var2) {
                  break L0;
                } else {
                  if (var2 == 45) {
                    break L0;
                  } else {
                    L1: {
                      if (var2 != -92) {
                        if (-94 == var2) {
                          break L1;
                        } else {
                          if (35 != var2) {
                            L2: {
                              if (-225 == (var2 ^ -1)) {
                                break L2;
                              } else {
                                if (var2 != 225) {
                                  if (var2 == 226) {
                                    break L2;
                                  } else {
                                    if (var2 == 228) {
                                      break L2;
                                    } else {
                                      if ((var2 ^ -1) != -228) {
                                        if (192 != var2) {
                                          if (var2 == -194) {
                                            break L2;
                                          } else {
                                            if (-195 == var2) {
                                              break L2;
                                            } else {
                                              if (var2 == 196) {
                                                break L2;
                                              } else {
                                                if (var2 == 195) {
                                                  break L2;
                                                } else {
                                                  if (-233 != (var2 ^ -1)) {
                                                    L3: {
                                                      if (var2 == -234) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == -235) {
                                                          break L3;
                                                        } else {
                                                          if (-236 == var2) {
                                                            break L3;
                                                          } else {
                                                            if (-201 != var2) {
                                                              if (-202 != (var2 ^ -1)) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (203 != var2) {
                                                                    if ((var2 ^ -1) == -238) {
                                                                      return 'i';
                                                                    } else {
                                                                      if (var2 != 238) {
                                                                        if (var2 != -240) {
                                                                          if (205 != var2) {
                                                                            if (-207 != var2) {
                                                                              if (-208 != (var2 ^ -1)) {
                                                                                L4: {
                                                                                  if (var2 == 242) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (var2 != -244) {
                                                                                      if (244 == var2) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        if (-247 == var2) {
                                                                                          break L4;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            if (-211 != (var2 ^ -1)) {
                                                                                              if (var2 != -212) {
                                                                                                if (-213 == var2) {
                                                                                                  break L4;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) == -215) {
                                                                                                    break L4;
                                                                                                  } else {
                                                                                                    if (var2 == 213) {
                                                                                                      break L4;
                                                                                                    } else {
                                                                                                      L5: {
                                                                                                        if (var2 == -250) {
                                                                                                          break L5;
                                                                                                        } else {
                                                                                                          if (-251 != var2) {
                                                                                                            if ((var2 ^ -1) == -252) {
                                                                                                              break L5;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) != -253) {
                                                                                                                if (var2 == 217) {
                                                                                                                  break L5;
                                                                                                                } else {
                                                                                                                  if (218 == var2) {
                                                                                                                    break L5;
                                                                                                                  } else {
                                                                                                                    if ((var2 ^ -1) != -220) {
                                                                                                                      if (var2 != 220) {
                                                                                                                        L6: {
                                                                                                                          if (var2 == -232) {
                                                                                                                            break L6;
                                                                                                                          } else {
                                                                                                                            if (-200 == var2) {
                                                                                                                              break L6;
                                                                                                                            } else {
                                                                                                                              if (var2 != -256) {
                                                                                                                                if (376 == var2) {
                                                                                                                                  return 'y';
                                                                                                                                } else {
                                                                                                                                  L7: {
                                                                                                                                    if (-242 == var2) {
                                                                                                                                      break L7;
                                                                                                                                    } else {
                                                                                                                                      if (var2 == 209) {
                                                                                                                                        break L7;
                                                                                                                                      } else {
                                                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
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
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
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
                                                                        return 'i';
                                                                      }
                                                                    }
                                                                  } else {
                                                                    return 'e';
                                                                  }
                                                                }
                                                              } else {
                                                                return 'e';
                                                              }
                                                            } else {
                                                              return 'e';
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    return 'e';
                                                  } else {
                                                    return 'e';
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          return 'a';
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
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param0;
                  }
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param0;
          if (32 != var2) {
            if (var2 != 160) {
              if (95 != var2) {
                if (var2 != 45) {
                  L8: {
                    if (var2 != -92) {
                      if (-94 == var2) {
                        break L8;
                      } else {
                        if (35 != var2) {
                          L9: {
                            if (-225 == (var2 ^ -1)) {
                              break L9;
                            } else {
                              if (var2 != 225) {
                                if (var2 == 226) {
                                  break L9;
                                } else {
                                  if (var2 == 228) {
                                    break L9;
                                  } else {
                                    if ((var2 ^ -1) != -228) {
                                      if (192 != var2) {
                                        if (var2 == -194) {
                                          break L9;
                                        } else {
                                          if (-195 == var2) {
                                            break L9;
                                          } else {
                                            if (var2 == 196) {
                                              break L9;
                                            } else {
                                              if (var2 == 195) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (-233 != var2) {
                                                    if (var2 == -234) {
                                                      break L10;
                                                    } else {
                                                      if (var2 == -235) {
                                                        break L10;
                                                      } else {
                                                        if (-236 == var2) {
                                                          break L10;
                                                        } else {
                                                          if (-201 != var2) {
                                                            if (-202 != var2) {
                                                              if (202 == var2) {
                                                                break L10;
                                                              } else {
                                                                if (203 != var2) {
                                                                  L11: {
                                                                    if ((var2 ^ -1) == -238) {
                                                                      break L11;
                                                                    } else {
                                                                      if (var2 != 238) {
                                                                        if (var2 != -240) {
                                                                          if (205 != var2) {
                                                                            if (-207 != var2) {
                                                                              if (-208 != (var2 ^ -1)) {
                                                                                L12: {
                                                                                  if (var2 == 242) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (var2 != -244) {
                                                                                      if (244 == var2) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        if (-247 == var2) {
                                                                                          break L12;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (-211 != (var2 ^ -1)) {
                                                                                              if (var2 != -212) {
                                                                                                if (-213 == var2) {
                                                                                                  break L12;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) == -215) {
                                                                                                    break L12;
                                                                                                  } else {
                                                                                                    if (var2 == 213) {
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      L13: {
                                                                                                        if (var2 == -250) {
                                                                                                          break L13;
                                                                                                        } else {
                                                                                                          if (-251 != var2) {
                                                                                                            if ((var2 ^ -1) == -252) {
                                                                                                              break L13;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) != -253) {
                                                                                                                if (var2 == 217) {
                                                                                                                  break L13;
                                                                                                                } else {
                                                                                                                  if (218 == var2) {
                                                                                                                    break L13;
                                                                                                                  } else {
                                                                                                                    if ((var2 ^ -1) != -220) {
                                                                                                                      if (var2 != 220) {
                                                                                                                        L14: {
                                                                                                                          if (var2 == -232) {
                                                                                                                            break L14;
                                                                                                                          } else {
                                                                                                                            if (-200 == var2) {
                                                                                                                              break L14;
                                                                                                                            } else {
                                                                                                                              if (var2 != -256) {
                                                                                                                                if (376 == var2) {
                                                                                                                                  return 'y';
                                                                                                                                } else {
                                                                                                                                  L15: {
                                                                                                                                    if (-242 == var2) {
                                                                                                                                      break L15;
                                                                                                                                    } else {
                                                                                                                                      if (var2 == 209) {
                                                                                                                                        break L15;
                                                                                                                                      } else {
                                                                                                                                        if (-224 != (var2 ^ -1)) {
                                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            } else {
                                                                                              break L12;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L11;
                                                                              }
                                                                            } else {
                                                                              break L11;
                                                                            }
                                                                          } else {
                                                                            break L11;
                                                                          }
                                                                        } else {
                                                                          break L11;
                                                                        }
                                                                      } else {
                                                                        break L11;
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
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
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                return 'e';
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          return 'a';
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  return param0;
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click";
        pj discarded$0 = new pj();
        field_a = new am();
        field_b = false;
    }
}
