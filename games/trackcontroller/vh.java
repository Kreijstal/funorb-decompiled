/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vh extends gb {
    int field_o;
    static String field_p;
    static volatile boolean field_q;

    final static void h(int param0) {
        Object var2 = null;
        bk.field_J = null;
        jf.field_i = null;
        ue.field_c = null;
        mh.field_i = false;
        el.field_O = null;
        if (param0 == -2532) {
          return;
        } else {
          var2 = null;
          vh.a((String) null, 32, (String) null);
          return;
        }
    }

    public static void g(int param0) {
        field_p = null;
        if (param0 == 32) {
            return;
        }
        field_p = null;
    }

    final static long a(byte param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        var2 = 0L;
        if (param0 < -79) {
          var4 = param1.length();
          var5 = 0;
          L0: while (true) {
            if (var4 > var5) {
              L1: {
                L2: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L2;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(1 + var6 - 65);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6 < 97) {
                    break L3;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L1;
                } else {
                  if (57 < var6) {
                    break L1;
                  } else {
                    var2 = var2 + (long)(27 - -var6 - 48);
                    break L1;
                  }
                }
              }
              if (-177917621779460414L < (var2 ^ -1L)) {
                var5++;
                continue L0;
              } else {
                L4: while (true) {
                  L5: {
                    if ((var2 % 37L ^ -1L) != -1L) {
                      break L5;
                    } else {
                      if (-1L == (var2 ^ -1L)) {
                        break L5;
                      } else {
                        var2 = var2 / 37L;
                        continue L4;
                      }
                    }
                  }
                  return var2;
                }
              }
            } else {
              L6: while (true) {
                L7: {
                  if ((var2 % 37L ^ -1L) != -1L) {
                    break L7;
                  } else {
                    if (-1L == (var2 ^ -1L)) {
                      break L7;
                    } else {
                      var2 = var2 / 37L;
                      continue L6;
                    }
                  }
                }
                return var2;
              }
            }
          }
        } else {
          field_p = null;
          var4 = param1.length();
          var5 = 0;
          L8: while (true) {
            L9: {
              if (var4 <= var5) {
                break L9;
              } else {
                L10: {
                  L11: {
                    var2 = var2 * 37L;
                    var6 = param1.charAt(var5);
                    if (var6 < 65) {
                      break L11;
                    } else {
                      if (var6 <= 90) {
                        var2 = var2 + (long)(1 + var6 - 65);
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (var6 < 97) {
                      break L12;
                    } else {
                      if (var6 <= 122) {
                        var2 = var2 + (long)(-97 + var6 + 1);
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (var6 < 48) {
                    break L10;
                  } else {
                    if (57 < var6) {
                      break L10;
                    } else {
                      var2 = var2 + (long)(27 - -var6 - 48);
                      break L10;
                    }
                  }
                }
                if (-177917621779460414L >= (var2 ^ -1L)) {
                  break L9;
                } else {
                  var5++;
                  continue L8;
                }
              }
            }
            L13: while (true) {
              L14: {
                if ((var2 % 37L ^ -1L) != -1L) {
                  break L14;
                } else {
                  if (-1L == (var2 ^ -1L)) {
                    break L14;
                  } else {
                    var2 = var2 / 37L;
                    continue L13;
                  }
                }
              }
              return var2;
            }
          }
        }
    }

    final static char a(boolean param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (!param0) {
          field_q = false;
          var2 = param1;
          if (var2 != 32) {
            L0: {
              if (-161 == (var2 ^ -1)) {
                break L0;
              } else {
                if ((var2 ^ -1) == -96) {
                  break L0;
                } else {
                  if ((var2 ^ -1) != -46) {
                    L1: {
                      if ((var2 ^ -1) != -92) {
                        if (93 != var2) {
                          if (var2 != 35) {
                            L2: {
                              if (224 != var2) {
                                if (225 != var2) {
                                  if ((var2 ^ -1) != -227) {
                                    if (var2 != 228) {
                                      if (227 != var2) {
                                        if (var2 != 192) {
                                          if (193 != var2) {
                                            if (-195 != var2) {
                                              if (-197 == var2) {
                                                break L2;
                                              } else {
                                                if (var2 == -196) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (-233 != var2) {
                                                      if (var2 != 233) {
                                                        if (var2 == -235) {
                                                          break L3;
                                                        } else {
                                                          if (-236 != var2) {
                                                            if ((var2 ^ -1) != -201) {
                                                              if (201 != var2) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (var2 != 203) {
                                                                    if ((var2 ^ -1) != -238) {
                                                                      L4: {
                                                                        if ((var2 ^ -1) == -239) {
                                                                          break L4;
                                                                        } else {
                                                                          if ((var2 ^ -1) != -240) {
                                                                            if (var2 != 205) {
                                                                              if (206 == var2) {
                                                                                break L4;
                                                                              } else {
                                                                                if (var2 != 207) {
                                                                                  L5: {
                                                                                    if (242 == var2) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 != 243) {
                                                                                        if (244 == var2) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (-247 != var2) {
                                                                                            if (var2 != 245) {
                                                                                              if (var2 == 210) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (var2 == 211) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (-213 == var2) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 != 214) {
                                                                                                      if (213 != var2) {
                                                                                                        L6: {
                                                                                                          if (var2 == -250) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (250 == var2) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (-252 == var2) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if ((var2 ^ -1) == -253) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if ((var2 ^ -1) != -218) {
                                                                                                                    if (218 == var2) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 != -220) {
                                                                                                                        if (220 == var2) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 == 199) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (-256 == var2) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if (-242 == (var2 ^ -1)) {
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    if (var2 != 209) {
                                                                                                                                      if (var2 == 223) {
                                                                                                                                        return 'b';
                                                                                                                                      } else {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      return 'n';
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
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
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
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
                                                                                          } else {
                                                                                            return 'o';
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
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        }
                                                                      }
                                                                      return 'i';
                                                                    } else {
                                                                      return 'i';
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
                                                          } else {
                                                            return 'e';
                                                          }
                                                        }
                                                      } else {
                                                        break L3;
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
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
            if (-161 != var2) {
              if (var2 != -96) {
                if ((var2 ^ -1) != -46) {
                  L7: {
                    if ((var2 ^ -1) != -92) {
                      if (93 != var2) {
                        if (var2 != 35) {
                          L8: {
                            if (224 != var2) {
                              if (225 != var2) {
                                if ((var2 ^ -1) != -227) {
                                  if (var2 != 228) {
                                    if (227 != var2) {
                                      if (var2 != 192) {
                                        if (193 != var2) {
                                          if (-195 != var2) {
                                            if (-197 != var2) {
                                              if (var2 == -196) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (-233 != var2) {
                                                    if (var2 != 233) {
                                                      if (var2 == -235) {
                                                        break L9;
                                                      } else {
                                                        if (-236 != var2) {
                                                          if ((var2 ^ -1) != -201) {
                                                            if (201 != var2) {
                                                              if (202 == var2) {
                                                                break L9;
                                                              } else {
                                                                if (var2 != 203) {
                                                                  L10: {
                                                                    if ((var2 ^ -1) != -238) {
                                                                      if ((var2 ^ -1) == -239) {
                                                                        break L10;
                                                                      } else {
                                                                        if ((var2 ^ -1) != -240) {
                                                                          if (var2 != 205) {
                                                                            if (206 == var2) {
                                                                              break L10;
                                                                            } else {
                                                                              if (var2 != 207) {
                                                                                L11: {
                                                                                  if (242 == var2) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    if (var2 != 243) {
                                                                                      if (244 == var2) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (-247 != var2) {
                                                                                          if (var2 != 245) {
                                                                                            if (var2 == 210) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if (var2 == 211) {
                                                                                                break L11;
                                                                                              } else {
                                                                                                if (-213 == var2) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if (var2 != 214) {
                                                                                                    if (213 != var2) {
                                                                                                      L12: {
                                                                                                        if (var2 == -250) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (250 == var2) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            if (-252 == var2) {
                                                                                                              break L12;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) == -253) {
                                                                                                                break L12;
                                                                                                              } else {
                                                                                                                if ((var2 ^ -1) != -218) {
                                                                                                                  if (218 == var2) {
                                                                                                                    break L12;
                                                                                                                  } else {
                                                                                                                    if (var2 != -220) {
                                                                                                                      if (220 == var2) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (var2 != 231) {
                                                                                                                          if (var2 == 199) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (-256 == var2) {
                                                                                                                              return 'y';
                                                                                                                            } else {
                                                                                                                              if (var2 != 376) {
                                                                                                                                if (-242 == (var2 ^ -1)) {
                                                                                                                                  return 'n';
                                                                                                                                } else {
                                                                                                                                  if (var2 != 209) {
                                                                                                                                    if (var2 == 223) {
                                                                                                                                      return 'b';
                                                                                                                                    } else {
                                                                                                                                      return Character.toLowerCase(param1);
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
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
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L11;
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
                                                                                return 'o';
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
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  return 'i';
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
                                                          break L9;
                                                        }
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              return 'a';
                                            }
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          return 'a';
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  return param1;
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

    vh(int param0) {
        ((vh) this).field_o = param0;
    }

    final static kk a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != 98) {
          field_q = true;
          return fh.a(param4, param0, param2, false, param3, -122);
        } else {
          return fh.a(param4, param0, param2, false, param3, -122);
        }
    }

    final static void a(String param0, int param1, String param2) {
        nf.a(false, param2, param0, (byte) -105);
        if (param1 == 224) {
            return;
        }
        field_q = true;
    }

    abstract boolean f(int param0);

    abstract Object a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = true;
    }
}
