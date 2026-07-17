/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eo {
    static String field_a;
    static String field_b;

    final static String a(byte param0) {
        if (param0 == 46) {
          if (!un.field_u) {
            if (ei.field_j >= ef.field_d) {
              if (ei.field_j >= ef.field_d - -qf.field_l) {
                return null;
              } else {
                return on.field_b;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          eo.b((byte) -64);
          if (!un.field_u) {
            if (ei.field_j >= ef.field_d) {
              if (ei.field_j >= ef.field_d - -qf.field_l) {
                return null;
              } else {
                return on.field_b;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    abstract int a(byte param0, long param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, boolean param7, int param8, int param9) {
        if (param5) {
          if (param7) {
            fc.a(param9, param3, param6, param1, true, 29788, false, param8, param4, param0, param2, false);
            return;
          } else {
            qi.a(param4, param6, param8, param0, param2, 73, param3, param1, param9);
            return;
          }
        } else {
          char discarded$1 = eo.a(-21, '7');
          if (param7) {
            fc.a(param9, param3, param6, param1, true, 29788, false, param8, param4, param0, param2, false);
            return;
          } else {
            qi.a(param4, param6, param8, param0, param2, 73, param3, param1, param9);
            return;
          }
        }
    }

    abstract long c(byte param0);

    final static void a(int param0, boolean param1) {
        Object var3 = null;
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        if (param0 == 24) {
          if (null != ma.field_a) {
            pc.field_d = 16777215;
            gd.field_X = 7899280;
            lh.field_e = 12110032;
            var6 = null;
            var5 = null;
            sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, (wl) (Object) fh.field_g, 240, param1);
            mj.field_d = 0;
            gi.a((byte) -71);
            return;
          } else {
            gd.field_X = 6340704;
            lh.field_e = 10551200;
            pc.field_d = 16777215;
            var4 = null;
            var3 = null;
            sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, (wl) (Object) fh.field_g, 300, param1);
            mj.field_d = 0;
            gi.a((byte) -71);
            return;
          }
        } else {
          String discarded$1 = eo.a((byte) 53);
          if (null != ma.field_a) {
            pc.field_d = 16777215;
            gd.field_X = 7899280;
            lh.field_e = 12110032;
            var6 = null;
            var5 = null;
            sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, (wl) (Object) fh.field_g, 240, param1);
            mj.field_d = 0;
            gi.a((byte) -71);
            return;
          } else {
            gd.field_X = 6340704;
            lh.field_e = 10551200;
            pc.field_d = 16777215;
            var4 = null;
            var3 = null;
            sa.a(0, 0, false, (ed[]) null, 0, 24, (ed[]) null, 320, 22, (wl) (Object) fh.field_g, 300, param1);
            mj.field_d = 0;
            gi.a((byte) -71);
            return;
          }
        }
    }

    final static void a(ed param0, byte param1) {
        try {
            hf.a(-123);
            if (param1 >= -3) {
                Object var3 = null;
                eo.a((ed) null, (byte) -40);
            }
            em.a(param0.field_B, param0.field_A, param0.field_z);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "eo.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -72) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 < 34) {
          L0: {
            field_a = null;
            var4 = ((eo) this).c((byte) 96);
            if (var4 > 0L) {
              en.a((byte) -86, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((eo) this).a((byte) -95, param0);
        } else {
          L1: {
            var4 = ((eo) this).c((byte) 96);
            if (var4 > 0L) {
              en.a((byte) -86, var4);
              break L1;
            } else {
              break L1;
            }
          }
          return ((eo) this).a((byte) -95, param0);
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        if (param0 != 227) {
          eo.b((byte) -68);
          var2 = param1;
          if (var2 != 32) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 != 95) {
                  if (45 != var2) {
                    L1: {
                      if (var2 != 91) {
                        if (93 != var2) {
                          if (var2 == 35) {
                            break L1;
                          } else {
                            L2: {
                              if (224 != var2) {
                                if (var2 == 225) {
                                  break L2;
                                } else {
                                  if (var2 != 226) {
                                    if (var2 != 228) {
                                      if (227 == var2) {
                                        break L2;
                                      } else {
                                        if (var2 != 192) {
                                          if (var2 == 193) {
                                            break L2;
                                          } else {
                                            if (var2 != 194) {
                                              if (var2 == 196) {
                                                break L2;
                                              } else {
                                                if (var2 != 195) {
                                                  L3: {
                                                    if (var2 != 232) {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (200 != var2) {
                                                              if (var2 == 201) {
                                                                break L3;
                                                              } else {
                                                                if (var2 != 202) {
                                                                  if (var2 != 203) {
                                                                    if (237 != var2) {
                                                                      L4: {
                                                                        if (var2 == 238) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 == 239) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 != 205) {
                                                                              if (var2 == 206) {
                                                                                break L4;
                                                                              } else {
                                                                                if (var2 == 207) {
                                                                                  break L4;
                                                                                } else {
                                                                                  if (var2 != 242) {
                                                                                    if (var2 != 243) {
                                                                                      if (var2 != 244) {
                                                                                        if (var2 != 246) {
                                                                                          if (var2 != 245) {
                                                                                            L5: {
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
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        if (var2 != 249) {
                                                                                                          if (var2 != 250) {
                                                                                                            if (var2 != 251) {
                                                                                                              if (var2 != 252) {
                                                                                                                if (217 != var2) {
                                                                                                                  if (var2 == 218) {
                                                                                                                    return 'u';
                                                                                                                  } else {
                                                                                                                    if (var2 != 219) {
                                                                                                                      if (var2 != 220) {
                                                                                                                        if (var2 == 231) {
                                                                                                                          return 'c';
                                                                                                                        } else {
                                                                                                                          if (var2 != 199) {
                                                                                                                            if (var2 != 255) {
                                                                                                                              if (var2 != 376) {
                                                                                                                                L6: {
                                                                                                                                  if (var2 == 241) {
                                                                                                                                    break L6;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 209) {
                                                                                                                                      break L6;
                                                                                                                                    } else {
                                                                                                                                      if (223 == var2) {
                                                                                                                                        return 'b';
                                                                                                                                      } else {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                return 'n';
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
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
                                                                                                  } else {
                                                                                                    return 'o';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'o';
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      return 'i';
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  } else {
                                                                    break L3;
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
                                                    } else {
                                                      break L3;
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
                                          }
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
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (var2 != 32) {
            if (var2 != 160) {
              L7: {
                if (var2 != 95) {
                  if (45 != var2) {
                    L8: {
                      if (var2 != 91) {
                        if (93 != var2) {
                          if (var2 != 35) {
                            L9: {
                              if (224 != var2) {
                                if (var2 != 225) {
                                  if (var2 != 226) {
                                    if (var2 != 228) {
                                      if (227 == var2) {
                                        break L9;
                                      } else {
                                        if (var2 != 192) {
                                          if (var2 == 193) {
                                            break L9;
                                          } else {
                                            if (var2 != 194) {
                                              if (var2 == 196) {
                                                break L9;
                                              } else {
                                                if (var2 != 195) {
                                                  L10: {
                                                    if (var2 != 232) {
                                                      if (var2 == 233) {
                                                        break L10;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L10;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L10;
                                                          } else {
                                                            if (200 != var2) {
                                                              if (var2 == 201) {
                                                                break L10;
                                                              } else {
                                                                if (var2 != 202) {
                                                                  if (var2 != 203) {
                                                                    L11: {
                                                                      if (237 != var2) {
                                                                        if (var2 == 238) {
                                                                          break L11;
                                                                        } else {
                                                                          if (var2 == 239) {
                                                                            break L11;
                                                                          } else {
                                                                            if (var2 != 205) {
                                                                              if (var2 == 206) {
                                                                                break L11;
                                                                              } else {
                                                                                if (var2 == 207) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L12: {
                                                                                    if (var2 != 242) {
                                                                                      if (var2 != 243) {
                                                                                        if (var2 != 244) {
                                                                                          if (var2 != 246) {
                                                                                            if (var2 != 245) {
                                                                                              if (var2 == 210) {
                                                                                                break L12;
                                                                                              } else {
                                                                                                if (var2 == 211) {
                                                                                                  break L12;
                                                                                                } else {
                                                                                                  if (var2 != 212) {
                                                                                                    if (var2 == 214) {
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      if (var2 == 213) {
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        L13: {
                                                                                                          if (var2 != 249) {
                                                                                                            if (var2 != 250) {
                                                                                                              if (var2 != 251) {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (217 != var2) {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L13;
                                                                                                                    } else {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (var2 != 220) {
                                                                                                                          if (var2 == 231) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (var2 != 255) {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  L14: {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      break L14;
                                                                                                                                    } else {
                                                                                                                                      if (var2 == 209) {
                                                                                                                                        break L14;
                                                                                                                                      } else {
                                                                                                                                        if (223 == var2) {
                                                                                                                                          return 'b';
                                                                                                                                        } else {
                                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  return 'n';
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'u';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L13;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L13;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L13;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L13;
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L12;
                                                                                                  }
                                                                                                }
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
                                                                                    } else {
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            } else {
                                                                              break L11;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L11;
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    break L10;
                                                                  }
                                                                } else {
                                                                  break L10;
                                                                }
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
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                break L9;
                              }
                            }
                            return 'a';
                          } else {
                            return param1;
                          }
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    return param1;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              return '_';
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    abstract void a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Watch Introduction";
        field_a = "Please check if address is correct";
    }
}
