/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelActorSpawner {
    static AccountConnectionState field_a;
    static ResourceArchive field_b;

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = wizardrun.field_H;
        try {
          var5 = PasswordContentHelpers.field_b;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1_ref), "vj.A(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        GridPoint var5 = null;
        GridPoint var6 = null;
        int var2Lifetime1;
        var4 = wizardrun.field_H;
        try {
          var5 = new GridPoint();
          var6 = var5;
          var5.column = 0;
          while (var6.column < 20) {
            var6.row = 0;
            while (var6.row < 15) {
              if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] > 0) {
                var2 = 0;
                var3 = GridActor.field_l;
                if (var3 != 0) {
                  if (var3 != 1) {
                    if (var3 != 2) {
                      if (var3 != 3) {
                        if (var3 != 4) {
                          if (var3 == 5) {
                            if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 1) {
                              var2 = 36;
                            }
                            if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 2) {
                              var2 = 37;
                            }
                            if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 3) {
                              var2 = 38;
                            }
                            if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 4) {
                              var2 = 39;
                            }
                            if (5 == SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)]) {
                              var2 = 40;
                            }
                          }
                        } else {
                          if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 1) {
                            var2 = 29;
                          }
                          if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 2) {
                            var2 = 30;
                          }
                          if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 3) {
                            var2 = 31;
                          }
                          if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 4) {
                            var2 = 32;
                          }
                          if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 5) {
                            var2 = 33;
                          }
                        }
                      } else {
                        if (1 == SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)]) {
                          var2 = 22;
                        }
                        if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 2) {
                          var2 = 23;
                        }
                        if (3 == SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)]) {
                          var2 = 24;
                        }
                        if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 4) {
                          var2 = 25;
                        }
                        if (5 == SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)]) {
                          var2 = 26;
                        }
                      }
                    } else {
                      if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 1) {
                        var2 = 13;
                      }
                      if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 2) {
                        var2 = 14;
                      }
                      if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 3) {
                        var2 = 15;
                      }
                      if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 4) {
                        var2 = 16;
                      }
                      if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 5) {
                        var2 = 17;
                      }
                    }
                  } else {
                    if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 1) {
                      var2 = 7;
                    }
                    if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 2) {
                      var2 = 8;
                    }
                    if (3 == SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)]) {
                      var2 = 9;
                    }
                    if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 4) {
                      var2 = 10;
                    }
                    if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] != 5) {
                      SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, var2, var6);
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      var6.row = var6.row + 1;
                      continue;
                    }
                    var2 = 12;
                  }
                } else {
                  if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 1) {
                    var2 = 3;
                  }
                  if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 2) {
                    var2 = 4;
                  }
                  if (3 == SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)]) {
                    var2 = 5;
                  }
                  if (SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] == 5) {
                    var2 = 6;
                  }
                }
                SavedDataRequest.level.field_a[var6.toTileIndex((byte) -68)] = 0;
                NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, var2, var6);
                WidgetTheme.field_k = WidgetTheme.field_k + 1;
              }
              var6.row = var6.row + 1;
            }
            var6.column = var6.column + 1;
          }
          var2Lifetime1 = -113 % ((param0 + 79) / 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "vj.C(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          LevelActorSpawner.releaseStatics(-52);
        }
    }

    static {
        field_a = new AccountConnectionState();
    }
}
